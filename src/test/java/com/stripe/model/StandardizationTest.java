package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.reflect.ClassPath;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.Test;

/** Simple test to make sure stripe-java provides consistent bindings. */
public class StandardizationTest {
  @Test
  public void allNonDeprecatedMethodsHaveCorrespondingMethodWithRequestOptions()
      throws IOException, NoSuchMethodException {
    for (Class<?> model : getAllModels()) {
      for (Method method : model.getMethods()) {
        if (methodShouldBeSkipped(method, model)) continue;
        Class<?>[] methodParameterTypes = method.getParameterTypes();
        Parameter[] methodParameters = method.getParameters();
        if (methodParameters.length == 0) continue;
        if (!methodParameters[methodParameters.length - 1].getName().equals("params")) continue;
        Class<?>[] extendedMethodParameterTypes =
            Arrays.copyOf(methodParameterTypes, methodParameterTypes.length + 1);
        extendedMethodParameterTypes[methodParameterTypes.length] =
            RequestOptions.class; // Add RequestOptions to the end
        Method correspondingMethod =
            getCorrespondingMethodWithRequestOptions(model, method, extendedMethodParameterTypes);
        assertNotNull(
            correspondingMethod,
            String.format(
                "Methods on %ss like %s %s should have a corresponding method with RequestOptions as the last argument.%n",
                ApiResource.class.getSimpleName(),
                method.getName(),
                method.getParameterTypes().length > 0
                    ? "with parameters " + Arrays.toString(method.getParameterTypes())
                    : ""));
      }
    }
  }

  private boolean methodShouldBeSkipped(Method method, Class<?> model) {
    return method.getName().startsWith("set")
        || method.getName().startsWith("get")
        || method.getName().startsWith("_")
        || method.getName().equals("equals")
        || method.getDeclaringClass() != model
        || method.getName().equals("hashCode")
        || method.isAnnotationPresent(Deprecated.class)
        || getPrivacyStatus(method);
  }

  private Method getCorrespondingMethodWithRequestOptions(
      Class<?> model, Method method, Class<?>[] extendedMethodParameterTypes) {
    try {
      return model.getMethod(method.getName(), extendedMethodParameterTypes);
    } catch (NoSuchMethodException e) {
      return null; // returns null if there is no corresponding method with RequestOptions
    }
  }

  private boolean getPrivacyStatus(Method method) {
    return Modifier.isPrivate(method.getModifiers());
  }

  private Collection<Class<?>> getAllModels() throws IOException {
    Class<Charge> chargeClass = Charge.class;
    ClassPath classPath = ClassPath.from(chargeClass.getClassLoader());
    ImmutableSet<ClassPath.ClassInfo> topLevelClasses =
        classPath.getTopLevelClasses(chargeClass.getPackage().getName());
    List<Class<?>> classList = Lists.newArrayListWithExpectedSize(topLevelClasses.size());
    for (ClassPath.ClassInfo classInfo : topLevelClasses) {
      Class<?> c = classInfo.load();
      // Skip things that aren't APIResources
      if (!ApiResource.class.isAssignableFrom(c)) {
        continue;
      }
      // Skip the APIResource itself
      if (ApiResource.class == c) {
        continue;
      }
      classList.add(classInfo.load());
    }
    return classList;
  }
}

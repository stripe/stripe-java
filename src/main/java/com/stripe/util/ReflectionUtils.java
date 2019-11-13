package com.stripe.util;

import java.lang.reflect.Constructor;

public final class ReflectionUtils {
  /**
   * Loads a class by name.
   *
   * @param name the class name
   * @return the class object
   */
  public static Class<?> getClassByName(String name) {
    try {
      return Class.forName(name);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Initializes a new instance of the provided class object, passing the provided arguments to the
   * constructor.
   *
   * @param <T> the type of the class to instantiate
   * @param clazz the class object
   * @param initargs the arguments to pass to the class constructor
   * @return the new instance
   */
  public static <T> T newInstance(Class<T> clazz, Object... initargs) {
    try {
      Constructor<T> ctor = clazz.getConstructor();
      return ctor.newInstance(initargs);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}

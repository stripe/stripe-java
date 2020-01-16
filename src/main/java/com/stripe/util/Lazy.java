package com.stripe.util;

import static java.util.Objects.requireNonNull;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/**
 * This class provides a generic implementation of the lazy initialization pattern.
 *
 * @param <T> the type of the object wrapped by this class
 */
public class Lazy<T> {
  private final AtomicReference<Object> cached = new AtomicReference<>();

  private final Supplier<? extends T> ctor;

  /**
   * Initializes a new instance of the {@link Lazy} class.
   *
   * @param ctor the {@link Supplier} used to initialize the object
   * @throws NullPointerException if {@code ctor} is {@code null}
   */
  public Lazy(Supplier<? extends T> ctor) {
    requireNonNull(ctor);
    this.ctor = ctor;
  }

  /**
   * Returns the object wrapped by this instance. The object will be initialized and cached the
   * first time this method is called, and the cached version is returned on subsequent calls.
   *
   * @return the lazily-initialized object
   */
  @SuppressWarnings("unchecked")
  public T get() {
    Object value = this.cached.get();
    if (value == null) {
      synchronized (this.cached) {
        value = this.cached.get();
        if (value == null) {
          final T actualValue = this.ctor.get();
          value = actualValue == null ? this.cached : actualValue;
          this.cached.set(value);
        }
      }
    }
    return (T) (value == this.cached ? null : value);
  }
}

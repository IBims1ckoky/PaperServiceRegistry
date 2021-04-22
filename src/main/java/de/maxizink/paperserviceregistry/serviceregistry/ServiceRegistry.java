package de.maxizink.paperserviceregistry.serviceregistry;

import java.util.HashMap;
import java.util.Map;

public class ServiceRegistry {

  private static final Map<Class<? extends Service>, Service> REGISTERED_SERVICES = new HashMap<>();
  private static final Map<ServiceAccessorOwner, ServiceAccessor> SERVICE_ACCESSORS = new HashMap<>();

  public static void registerAccessor(final ServiceAccessorOwner serviceAccessorOwner, final ServiceAccessor serviceAccessor) {
    if (SERVICE_ACCESSORS.containsKey(serviceAccessorOwner)) {
      throw new IllegalArgumentException("The ServiceAccessorOwner already had an Accessor!");
    }
    SERVICE_ACCESSORS.put(serviceAccessorOwner, serviceAccessor);
  }

  public static <T extends Service> void registerService(final Class<T> interfaceClass, final T implementationClass) {
    if(REGISTERED_SERVICES.containsKey(interfaceClass)) {
      throw new IllegalArgumentException("The Service is already registered!");
    }
    REGISTERED_SERVICES.put(interfaceClass, implementationClass);
  }

  public static  <T extends Service> T accessService(final Class<T> clazz) {
    return (T) REGISTERED_SERVICES.get(clazz);
  }
}

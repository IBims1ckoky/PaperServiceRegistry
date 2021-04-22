package de.maxizink.paperserviceregistry.serviceregistry;

import lombok.Getter;

public class ServiceAccessor {

  @Getter
  private final ServiceAccessorOwner serviceAccessorOwner;

  public ServiceAccessor(final ServiceAccessorOwner serviceAccessorOwner) {
    this.serviceAccessorOwner = serviceAccessorOwner;
  }

  public <T extends Service> T accessService(final Class<T> interfaceClass) {
    return ServiceRegistry.accessService(interfaceClass);
  }

  public <T extends Service> void registerService(final Class<T> interfaceClass, final T implementationClass) {
    ServiceRegistry.registerService(interfaceClass, implementationClass);
  }
}
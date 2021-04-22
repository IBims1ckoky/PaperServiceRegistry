package de.maxizink.paperserviceregistry;

import de.maxizink.paperserviceregistry.serviceregistry.PaperPlugin;
import de.maxizink.paperserviceregistry.serviceregistry.ServiceAccessor;

public class PaperServiceRegistryPlugin extends PaperPlugin {

  @Override
  public void onEnable() {
    ServiceAccessor serviceAccessor = getServiceAccessor();
    System.out.println("Started PaperServiceRegistry v1.0.0");
  }
}

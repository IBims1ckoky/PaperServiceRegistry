package de.maxizink.paperserviceregistry.serviceregistry;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;

import java.io.File;

public class PaperPlugin extends JavaPlugin implements ServiceAccessorOwner {

  private final ServiceAccessor serviceAccessor = new ServiceAccessor(this);

  public PaperPlugin() {
    super();
  }

  public PaperPlugin(final JavaPluginLoader loader, final PluginDescriptionFile description,
                     final File dataFolder, final File file) {
    super(loader, description, dataFolder, file);
  }

  public ServiceAccessor getServiceAccessor() {
    return serviceAccessor;
  }
}

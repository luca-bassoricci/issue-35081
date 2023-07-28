package org.acme;

import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Singleton;

@ApplicationScoped
public class ConfigServiceProducer
{
	@Produces
	@Singleton
	@Startup
	ConfigService configService(AppConfig config)
	{
		return new ConfigService(config);
	}
}

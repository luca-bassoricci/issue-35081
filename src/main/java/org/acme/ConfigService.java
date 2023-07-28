package org.acme;

public class ConfigService
{
	private final AppConfig config;

	public ConfigService(AppConfig config)
	{
		this.config = config;
	}

	public int countMail()
	{
		return config.mail().size();
	}
}

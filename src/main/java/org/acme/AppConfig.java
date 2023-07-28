package org.acme;

import java.util.Set;

import io.smallrye.config.ConfigMapping;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@ConfigMapping(prefix = "myapp")
public interface AppConfig
{
	@NotEmpty
	Set<@NotNull @Email String> mail();
}

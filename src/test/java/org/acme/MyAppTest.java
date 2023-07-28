package org.acme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;

@QuarkusTest
class MyAppTest
{
	@Inject
	ConfigService configService;

	@Test
	void fail()
	{
		assertEquals(3, configService.countMail());
	}
}

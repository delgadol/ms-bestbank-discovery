package com.bestbank.servdiscovery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {com.bestbank.servdiscovery.MsBestbankDiscoveryApplication.class})
class MsBestbankDiscoveryApplicationTests {

	@Test
	@Disabled("Tes de prueba")
	void contextLoads() {
	  Assertions.fail();
	}

}

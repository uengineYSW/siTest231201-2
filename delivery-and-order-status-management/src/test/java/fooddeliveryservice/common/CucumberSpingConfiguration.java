package fooddeliveryservice.common;

import fooddeliveryservice.DeliveryAndOrderStatusManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeliveryAndOrderStatusManagementApplication.class })
public class CucumberSpingConfiguration {}

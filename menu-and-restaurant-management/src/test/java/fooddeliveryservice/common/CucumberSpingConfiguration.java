package fooddeliveryservice.common;

import fooddeliveryservice.MenuAndRestaurantManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MenuAndRestaurantManagementApplication.class })
public class CucumberSpingConfiguration {}

package fooddeliveryservice.common;

import fooddeliveryservice.SystemManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { SystemManagementApplication.class })
public class CucumberSpingConfiguration {}

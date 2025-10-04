package io.github.santhoshkani.micro.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import io.github.santhoshkani.micro.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}

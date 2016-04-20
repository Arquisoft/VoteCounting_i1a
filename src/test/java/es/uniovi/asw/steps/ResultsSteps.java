package es.uniovi.asw.steps;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.Assert;
import org.springframework.web.context.WebApplicationContext;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import es.uniovi.asw.Application;

@ContextConfiguration(classes=Application.class, loader=SpringApplicationContextLoader.class)
@IntegrationTest
@WebAppConfiguration
public class ResultsSteps {
  
  @Autowired
  protected WebApplicationContext context;

  protected MockMvc mvc;
  protected MvcResult result;
  
  @When("^the client calls /results$")
  public void the_client_calls_results() throws Throwable {
    Assert.notNull(context);
    this.mvc = MockMvcBuilders.webAppContextSetup(context).build();
    result = mvc.perform(get("/results")).andReturn();
  }

}

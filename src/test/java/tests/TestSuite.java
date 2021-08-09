package tests;

import cucumberBDD.Runner;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;

@RunWith(JUnitPlatform.class)
@SelectClasses({LoginTest.class, ProductTest.class})
public class TestSuite {

}

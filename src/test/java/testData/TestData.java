package testData;

import cucumberBDD.steps.Hooks;
import io.cucumber.java.Scenario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import projectData.ProjectData;
import utils.Log;

public class TestData {
    protected ProjectData projectData = new ProjectData();

    @BeforeEach
    public void setUp() {
        projectData.openBrowser();

    }

    @AfterEach
    public void tearDown() {
        projectData.closeBrowser();
    }
}

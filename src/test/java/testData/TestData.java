package testData;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import projectData.ProjectData;

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

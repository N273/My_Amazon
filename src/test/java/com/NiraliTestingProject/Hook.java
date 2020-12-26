package com.NiraliTestingProject;

import com.NiraliTestingProject.Driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;




public class Hook{
    private DriverManager drivermanager = new DriverManager();
    @Before
    public void Startup(){
        drivermanager.OpenBrowser();

    }
    @After
    public void Teardown(){
     drivermanager.closeBrowser();
    }

}

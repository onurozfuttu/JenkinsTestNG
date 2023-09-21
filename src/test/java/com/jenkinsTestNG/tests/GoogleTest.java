package com.jenkinsTestNG.tests;

import com.jenkinsTestNG.pages.BasePage;
import com.jenkinsTestNG.utilities.ConfigurationReader;
import com.jenkinsTestNG.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BasePage {

    @Test
    public void pageTitleVerify() {
        Driver.get().get(ConfigurationReader.get("url"));
        Assert.assertEquals("Google",Driver.get().getTitle());
        Driver.get().close();
    }
}

package com.jenkinsTestNG.pages;

import com.jenkinsTestNG.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }
}

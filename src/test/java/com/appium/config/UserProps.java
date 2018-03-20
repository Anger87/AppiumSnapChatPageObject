package com.appium.config;

import jodd.props.Props;
import org.springframework.util.ResourceUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserProps {


    public String Login;
    public String Password;
    public Properties property;

    public UserProps() {
        try {
            FileInputStream fis;
            this.property = new Properties();
            fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\props\\user.properties");
            property.load(fis);


            this.Password = property.getProperty("password");
            this.Login = property.getProperty("login");
            System.out.println(" LOGIN: " + Login
                    + ", PASSWORD: " + Password);

        } catch (IOException e) {
            System.err.println("Error: user.properties file is absent");
        }
    }


    public String getLogin() {
        return Login;
    }

    public String getPassword() {
        return Password;
    }


}

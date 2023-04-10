package me.herberthleao.gexa;

import me.herberthleao.gexa.core.CoreApplication;

import javafx.application.Application;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GexaApplication
{
    public static void main(String[] args)
    {
        Application.launch(CoreApplication.class, args);
    }
}
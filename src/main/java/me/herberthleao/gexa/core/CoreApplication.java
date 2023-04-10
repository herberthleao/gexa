package me.herberthleao.gexa.core;

import me.herberthleao.gexa.GexaApplication;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

public class CoreApplication extends Application
{
    private ConfigurableApplicationContext applicationContext;

    @Override
    public void init()
    {
        this.applicationContext = new SpringApplicationBuilder(
                GexaApplication.class
        ).run();
    }

    @Override
    public void start(Stage stage)
    {
        this.applicationContext.publishEvent(new StageReadyEvent(stage));
    }

    @Override
    public void stop()
    {
        this.applicationContext.close();
        Platform.exit();
    }

    public static class StageReadyEvent extends ApplicationEvent
    {
        public StageReadyEvent(Stage stage)
        {
            super(stage);
        }

        public Stage getStage()
        {
            return (Stage) this.getSource();
        }
    }
}
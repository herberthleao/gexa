package me.herberthleao.gexa.controllers;

import me.herberthleao.gexa.core.CoreApplication;
import me.herberthleao.gexa.core.CoreApplication.StageReadyEvent;
import me.herberthleao.gexa.ui.screens.windows.HomeWindow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationListener;

@Component
public class HomeController implements ApplicationListener<StageReadyEvent>
{
    private HomeWindow window;

    public void onApplicationEvent(CoreApplication.StageReadyEvent event)
    {
        this.window.setStage(event.getStage());
        this.window.show();
    }

    @Autowired
    public void setScreen(HomeWindow screen)
    {
        this.window = screen;
    }
}

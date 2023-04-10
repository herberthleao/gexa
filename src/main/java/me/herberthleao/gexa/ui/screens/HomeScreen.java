package me.herberthleao.gexa.ui.screens;

import me.herberthleao.gexa.core.CoreApplication.StageReadyEvent;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class HomeScreen extends Screen implements ApplicationListener<
    StageReadyEvent
>  {
    public HomeScreen()
    {
        super("home");
    }

    public void onApplicationEvent(StageReadyEvent event)
    {
        Stage stage = event.getStage();
        stage.setScene(new Scene((AnchorPane) this.view));
        stage.show();
    }
}

package me.herberthleao.gexa.ui.screens;

import me.herberthleao.gexa.core.CoreApplication.StageReadyEvent;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class HomeScreen extends Screen implements ApplicationListener<
    StageReadyEvent
> {
    public HomeScreen()
    {
        super("home", "Gexa — Gestão Comercial");
    }

    public void onApplicationEvent(StageReadyEvent event)
    {
        Stage stage = event.getStage();
        stage.setTitle(this.title);
        stage.setMaximized(true);
        stage.setScene(new Scene((VBox) this.view));
        stage.show();
    }
}

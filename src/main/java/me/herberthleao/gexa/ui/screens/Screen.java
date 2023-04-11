package me.herberthleao.gexa.ui.screens;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public abstract class Screen {
    protected String title;
    protected Pane view;

    public Screen(String name, String title)
    {
        this.view = this.getView(name);
        this.title = title;
    }

    private Pane getView(String name)
    {
        Pane resource = null;
        try {
            String path = String.format("/views/%s.fxml", name);
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource(path));

            resource = loader.load();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        return resource;
    }
}

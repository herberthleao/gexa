package me.herberthleao.gexa.ui.screens;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;
import java.net.URL;

public abstract class Screen
{
    protected FXMLLoader loader;
    protected String title;
    private final String view;

    public Screen(String view, String title)
    {
        this.view = view;
        this.title = title;
    }

    public abstract void show();

    protected Parent loadTemplate()
    {
        Parent element = null;
        try {
            String path = String.format("/views/%s.fxml", this.view);
            URL resource = this.getClass().getResource(path);
            if (resource != null) {
                this.loader = new FXMLLoader(resource);
                element = this.loader.load();
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        return element;
    }

    protected abstract void configure();
}

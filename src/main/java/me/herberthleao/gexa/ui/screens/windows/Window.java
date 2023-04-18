package me.herberthleao.gexa.ui.screens.windows;

import me.herberthleao.gexa.ui.screens.Screen;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public abstract class Window extends Screen
{
    protected Stage stage;

    public Window(String view, String title)
    {
        super(view, title);
    }

    public void setStage(Stage stage)
    {
        this.stage = stage;
    }

    @Override
    public void show()
    {
        this.configure();
        this.mount();

        this.stage.show();
    }

    abstract protected void mount();

    @Override
    final protected void configure()
    {
        if (this.stage == null) {
            this.stage = new Stage();
        }

        this.stage.setTitle(this.title);
        this.stage.setScene(new Scene((Pane) this.loadTemplate()));
    }
}

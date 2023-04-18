package me.herberthleao.gexa.ui.screens.modals;

import javafx.scene.control.ButtonType;
import me.herberthleao.gexa.ui.screens.Screen;

import javafx.scene.control.DialogPane;
import javafx.scene.control.Dialog;
import javafx.stage.Window;

abstract class Modal extends Screen
{
    protected Window parent;
    protected Dialog<ButtonType> dialog;

    public Modal(String view, String title)
    {
        super(view, title);
    }

    public void show(Window parent)
    {
        this.parent = parent;

        this.configure();
        this.show();
    }

    @Override
    final protected void configure()
    {
        if (this.dialog == null) {
            this.dialog = new Dialog<ButtonType>();
            this.dialog.setTitle(this.title);
            this.dialog.initOwner(this.parent);
            this.dialog.setDialogPane((DialogPane) this.loadTemplate());
        }
    }
}

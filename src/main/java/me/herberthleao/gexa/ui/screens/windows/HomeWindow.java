package me.herberthleao.gexa.ui.screens.windows;

import org.springframework.stereotype.Component;

@Component
public class HomeWindow extends Window
{
    public HomeWindow()
    {
        super("home", "Gexa — Gestão Comercial");
    }

    @Override
    protected void mount()
    {
        this.stage.setMaximized(true);
    }
}

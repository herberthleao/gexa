package me.herberthleao.gexa.controllers;

import me.herberthleao.gexa.services.Service;

abstract class Controller
{
    protected static Service service;

    protected void setService(Service service)
    {
        Controller.service = service;
    }

    protected Service getService()
    {
        return Controller.service;
    }
}

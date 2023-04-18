package me.herberthleao.gexa.controllers;

import me.herberthleao.gexa.services.ProductService;

import javafx.fxml.FXML;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ProductController extends Controller
{
    public static final ButtonType SAVE = new ButtonType("Salvar");

    @FXML
    TextField name;
    @FXML
    TextField price;
    @FXML
    TextArea description;
    @FXML
    TextField barcode;

    public String getBarcode()
    {
        return this.barcode.getText();
    }

    public String getDescription()
    {
        return this.description.getText();
    }

    public String getName() {
        return this.name.getText();
    }

    public BigDecimal getPrice()
    {
        String amount = this.price.getText().replace(",", ".");
        if (amount.isBlank()) {
            amount = "0.00";
        }

        return new BigDecimal(amount);
    }

    public void register()
    {
        ((ProductService) this.getService()).create(
            this.getName(),
            this.getPrice(),
            this.getDescription(),
            this.getBarcode()
        );
    }

    @Autowired
    public void setService(ProductService service)
    {
        super.setService(service);
    }
}

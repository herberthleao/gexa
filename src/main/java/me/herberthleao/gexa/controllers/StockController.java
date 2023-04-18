package me.herberthleao.gexa.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import me.herberthleao.gexa.persistence.entities.Product;
import me.herberthleao.gexa.ui.screens.modals.NewProductModal;

import javafx.scene.Node;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StockController
{
    private static NewProductModal newProductModal;

    @Autowired
    public void setNewProductModal(NewProductModal newProductModal)
    {
        StockController.newProductModal = newProductModal;
    }

    private ObservableList<Product> loadProducts()
    {
        List<Product> products = this.service.getAll();

        return FXCollections.observableArrayList(products);
    }

    @FXML
    private void openNewProductModal(ActionEvent event)
    {
        event.consume();
        Platform.runLater(() -> {
            Node node = (Node) event.getSource();
            StockController.newProductModal.show(node.getScene().getWindow());
        });
    }
}

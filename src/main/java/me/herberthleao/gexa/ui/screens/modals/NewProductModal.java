package me.herberthleao.gexa.ui.screens.modals;

import me.herberthleao.gexa.controllers.ProductController;

import org.springframework.stereotype.Component;

@Component
public class NewProductModal extends Modal
{
    public NewProductModal()
    {
        super("dialogs/new_product", "Novo Produto");
    }

    @Override
    public void show()
    {
        ProductController controller = this.loader.getController();
        this.dialog.showAndWait().filter(
            ProductController.SAVE::equals
        ).ifPresent(button -> controller.register());
    }
}
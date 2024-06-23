package org.resturant.Controllers;

import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.resturant.TM.Description;


public class EntreeSnacksPagePageController {
    @FXML
    private MFXButton txtOpenPrice;

    @FXML
    void openPrice(ActionEvent event) {
        Description tm = new Description();
        tm.description.add("Open Price");
        tm.qty.add(1);
        tm.price.add(200.00);

        System.out.println("Open Price , 1 , 200.00 ");
    }
}

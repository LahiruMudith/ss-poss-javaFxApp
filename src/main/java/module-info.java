module org.resturant {
    requires javafx.controls;
    requires javafx.fxml;
    requires mfx.resources;
    requires mfx.effects;
    requires mfx.core;
    requires mfx.localization;
    requires MaterialFX;
    requires java.sql;


    opens org.resturant to javafx.fxml;
    opens org.resturant.Controllers;
    exports org.resturant;
    exports org.resturant.Controllers;
}
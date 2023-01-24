module myfirstfx.helloworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens myfirstfx.helloworld to javafx.fxml;
    exports myfirstfx.helloworld;
}
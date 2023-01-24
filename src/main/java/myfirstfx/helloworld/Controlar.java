package myfirstfx.helloworld;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controlar {
    @FXML
    private Label label1;
    public void loginClick()
    {
label1.setText("Now I'm ready to Guide you");
    }
}

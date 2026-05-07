package Application.controllers;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Dialog;
import javafx.scene.control.MenuItem;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class ApplicationController implements Initializable {

    public MenuItem newCanvasBtn;
    Dialog<int[]> myNewCanvasDialog;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myNewCanvasDialog = new Dialog<>();
        newCanvasBtn.setOnAction(e -> {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Application/views/newCanvas.fxml"));
            try {
                myNewCanvasDialog.setDialogPane(loader.load());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            Optional<int[]> result = myNewCanvasDialog.showAndWait();
            if (result.isPresent() && result.get()[0] > 0 && result.get()[1] > 0) {
                System.out.println("Success!");
            }
        });
    }
}

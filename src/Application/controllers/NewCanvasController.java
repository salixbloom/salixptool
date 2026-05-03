package Application.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

public class NewCanvasController implements Initializable {

    final private String calculatedString = "MAX SIZE: ";
    private int inputWidth = 0;
    private int inputHeight = 0;

    private Consumer<int[]> onAccept;

    @FXML
    private Label calculatedSize;
    @FXML
    private TextField widthField;
    @FXML
    private TextField heightField;
    @FXML
    private Button cancelButton;
    @FXML
    private Button confirmButton;

    public void setCallBack(Consumer<int[]> callback) {
        this.onAccept = callback;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        calculatedSize.setText(calculatedString);

        widthField.setOnInputMethodTextChanged(e -> {
            String widthText = widthField.getText();
            try {
                inputWidth = Integer.parseInt(widthText);
                updateCalculatedSize();
            } catch (NumberFormatException _) {
                // TODO: Add warning
            }
        });

        heightField.setOnInputMethodTextChanged(e -> {
            String heightText = heightField.getText();
            try {
                inputHeight = Integer.parseInt(heightText);
                updateCalculatedSize();
            } catch (NumberFormatException _) {
                // TODO: Add warning
            }
        });

        confirmButton.setOnAction(e -> {
            if (inputWidth > 0 &&  inputHeight > 0 && onAccept != null) {
                onAccept.accept(new int[] {inputWidth, inputHeight});
            }
        });

        cancelButton.setOnAction(e -> {
            Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            stage.close();
        });


    }

    private void updateCalculatedSize() {
        final String size = String.valueOf(inputWidth * inputHeight);
        calculatedSize.setText(calculatedString + size + " Bits");
    }
}

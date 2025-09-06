/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Laynecito
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField txtLado;

    Cuadrado unCuadrado;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void onAction() {

        if (txtLado.getText().isEmpty()) {
            return;
        }

        int lado = Integer.parseInt(txtLado.getText());
        unCuadrado = new Cuadrado(lado);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Calculo");
        alert.setContentText("El area es: " + unCuadrado.getArea() + " y el perimetro es: " + unCuadrado.getPerimetro());
        alert.showAndWait();
    }

}

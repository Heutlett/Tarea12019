package sample;

import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller extends AnchorPane {

    @FXML private Label lbl1;
    @FXML private Stage primaryStage;

    public void seleccionarArchivo(MouseEvent event){

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("CSV files (*.csv)", "*.csv");
        fileChooser.getExtensionFilters().add(extFilter);
        File a = fileChooser.showOpenDialog(primaryStage);
        lbl1.setText(a.getAbsolutePath());

    }

    public void abrirArchivo(MouseEvent event){

        

    }

}

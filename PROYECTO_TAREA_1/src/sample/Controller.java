package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Controller extends AnchorPane {

    @FXML private Label lbl1;
    @FXML private Stage primaryStage;
    @FXML private TableView tableView1;

    public void seleccionarArchivo(MouseEvent event){

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("CSV files (*.csv)", "*.csv");
        fileChooser.getExtensionFilters().add(extFilter);
        File a = fileChooser.showOpenDialog(primaryStage);
        lbl1.setText(a.getAbsolutePath());

    }

    public void abrirArchivo(MouseEvent event) throws IOException {

        tableView1.setEditable(true);

        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");
        TableColumn emailCol = new TableColumn("Email");



        tableView1.getColumns().addAll(firstNameCol, lastNameCol, emailCol);

    }

}

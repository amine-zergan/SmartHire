package com.example.smarthire.Auth;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;



public class SingupController implements Initializable {


    @FXML
    private PasswordField MotdePassFieldID;

    @FXML
    private Button closeId;

    @FXML
    private TextField emaiilFieldId;

    @FXML
    private Button signupId;

    @FXML
    private ComboBox<String> roleId;

    private String[] roles = {"Responsable RH", "Recruteur", "condidat", "Admin"};


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> listData = FXCollections.observableArrayList();
        listData.addAll(roles);
        roleId.setItems(listData);

    }
}

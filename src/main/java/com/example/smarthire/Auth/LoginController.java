package com.example.smarthire.Auth;

import com.example.smarthire.serviceDb.DatabaseConnection;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.stage.StageStyle;

import java.net.URL;
import java.sql.Connection;
import java.util.Objects;
import java.util.ResourceBundle;




public class LoginController  implements  Initializable{
    @FXML
    private Label bienvenueId;

    @FXML
    private ImageView imageId;

    @FXML
    private Button loginId;

    @FXML
    private PasswordField passwordFieldId;

    @FXML
    private Label seConnecterLabelId;

    @FXML
    private Label smartlabelId;

    @FXML
    private TextField usernameFieldId;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    @FXML
    public  void verifyCredential(){
        if(usernameFieldId.getText().isBlank() && passwordFieldId.getText().isBlank()){
            Alert erreur = new Alert(Alert.AlertType.WARNING) ;
            erreur.setTitle("");
            erreur.setContentText("Merci de Saisir votre login et mot de passe");
            erreur.initStyle(StageStyle.UNDECORATED);
            erreur.show();
        }
    }

    private void login(){
        DatabaseConnection connection =new DatabaseConnection();
        Connection connection1 = connection.getConnection();
        String verifyLogin = "SELECT count(1) FROM auth WHERE username = "+usernameFieldId.getText() +"AND password= "+passwordFieldId.getText();

    }
}
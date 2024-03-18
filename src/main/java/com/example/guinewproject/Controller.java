package com.example.guinewproject;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
@FXML
    Label Info;
@FXML
    TextField txt_First_Name;
@FXML
    TextField Txt_Last_Name;
@FXML
    TextField Txt_Origin;

@FXML
    Button cmd_submit;

@FXML
    public void showAllInformation(){
    String FirstName = txt_First_Name.getText();
    String LastName = Txt_Last_Name.getText();
    String Origin = Txt_Origin.getText();

    Info.setText(FirstName + " " + LastName + " " + Origin); // showing information on the same window

    /*Alert message = new Alert(Alert.AlertType.INFORMATION); showing information on another window
    message.setContentText( FirstName + " " + LastName + " " + Origin);
    message.show();

     */
}
}

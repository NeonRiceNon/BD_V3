package com.example.demo1;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Callback;

public class addController {
    static private String name;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField Av_dob_Text;

    @FXML
    private Button Butt_dob_av;

    @FXML
    void dd_Avt(ActionEvent event) {

    }

    @FXML
    void initialize() {

                Butt_dob_av.setOnAction(actionEvent -> {
                    try(Connection con = DriverManager.getConnection("jdbc:postgresql://46.229.214.241:5432/book publishing", "PKS", "PKS")){
                        Statement statement = con.createStatement();
                        int rows = statement.executeUpdate("INSERT INTO public.\"Author\"(name)VALUES('"+Av_dob_Text.getText()+"');");
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }finally {
                        Stage stage = (Stage) Butt_dob_av.getScene().getWindow();
                        stage.close();
                    }
                });

    }

}
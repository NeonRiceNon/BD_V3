package com.example.demo1;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class add_Gan {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button add_GAN;

    @FXML
    private TextField text_add_GAN;

    @FXML
    void Butt_add_GAN(ActionEvent event) {
        /*add_GAN.setOnAction(actionEvent -> {
            try(Connection con = DriverManager.getConnection("jdbc:postgresql://46.229.214.241:5432/book publishing", "PKS", "PKS")){
                Statement statement = con.createStatement();
                int rows = statement.executeUpdate("INSERT INTO public.\"Genre\"(name)VALUES('"+text_add_GAN.getText()+"');");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally {
                Stage stage = (Stage) add_GAN.getScene().getWindow();
                stage.close();
            }
        });*/
    }
    @FXML
    void initialize() {

        add_GAN.setOnAction(actionEvent -> {
            try(Connection con = DriverManager.getConnection("jdbc:postgresql://46.229.214.241:5432/book publishing", "PKS", "PKS")){
                Statement statement = con.createStatement();
                int rows = statement.executeUpdate("INSERT INTO public.\"Genre\"(name)VALUES('"+text_add_GAN.getText()+"');");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally {
                Stage stage = (Stage) add_GAN.getScene().getWindow();
                stage.close();
            }
        });

    }
}
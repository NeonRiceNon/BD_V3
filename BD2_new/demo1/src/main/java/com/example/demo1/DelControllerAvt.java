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
import javafx.stage.Stage;

public class DelControllerAvt {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Ev_Del;

    @FXML
    void Ev_Del_Actinon(ActionEvent event) {
    }

    @FXML
    void initialize() {
        Ev_Del.setOnAction(actionEvent -> {
            try(Connection con = DriverManager.getConnection("jdbc:postgresql://46.229.214.241:5432/book publishing", "PKS", "PKS")){
                Statement statement = con.createStatement();

                int rows = statement.executeUpdate("DELETE FROM public.\"Author\" WHERE \"id_Author\"= '"+Peremennie.id+"'");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally {
                Stage stage = (Stage) Ev_Del.getScene().getWindow();
                stage.close();
            }
        });
    }
}

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

public class add_Cli {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button add_CLI;

    @FXML
    private TextField text_add_CLI_Adr;

    @FXML
    private TextField text_add_CLI_Naz;

    @FXML
    private TextField text_add_CLI_Tel;

    @FXML
    void Butt_add_CLI(ActionEvent event) {

    }

    @FXML
    void initialize() {
        add_CLI.setOnAction(actionEvent -> {
            try(Connection con = DriverManager.getConnection("jdbc:postgresql://46.229.214.241:5432/book publishing", "PKS", "PKS")){
                Statement statement = con.createStatement();
                int rows = statement.executeUpdate("INSERT INTO public.\"Client\"(\"Shop\", \"Address\", \"Phone_number\")VALUES('"+text_add_CLI_Naz.getText()+"','"+text_add_CLI_Adr.getText()+"',"+text_add_CLI_Tel.getText()+");");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally {
                Stage stage = (Stage) add_CLI.getScene().getWindow();
                stage.close();
            }
        });
    }

}
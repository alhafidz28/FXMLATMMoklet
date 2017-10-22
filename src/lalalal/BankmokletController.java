/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lalalal;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Sweet.Cakee
 */
public class BankmokletController implements Initializable {

    String pinnn = "";
    String PINNN = "1234";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    private JFXButton asatu;
    @FXML
    private JFXButton atiga;
    @FXML
    private JFXButton adua;
    @FXML
    private JFXButton aempat;
    @FXML
    private JFXButton alima;
    @FXML
    private JFXButton atujuh;
    @FXML
    private JFXButton aenam;
    @FXML
    private JFXButton adelapan;
    @FXML
    private JFXButton asembilan;
    @FXML
    private JFXButton ac;
    @FXML
    private JFXButton anol;
    @FXML
    private JFXButton aok;
    @FXML
    private JFXPasswordField apin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    void satu(ActionEvent event) {
        pinnn += "1";
        apin.setText(pinnn);
    }

    @FXML
    void tiga(ActionEvent event) {
        pinnn += "3";
        apin.setText(pinnn);
    }

    @FXML
    void dua(ActionEvent event) {
        pinnn += "2";
        apin.setText(pinnn);
    }

    @FXML
    void empat(ActionEvent event) {
        pinnn += "4";
        apin.setText(pinnn);
    }

    @FXML
    void lima(ActionEvent event) {
        pinnn += "5";
        apin.setText(pinnn);
    }

    @FXML
    void tujuh(ActionEvent event) {
        pinnn += "7";
        apin.setText(pinnn);
    }

    @FXML
    void enam(ActionEvent event) {
        pinnn += "6";
        apin.setText(pinnn);
    }

    @FXML
    void delapan(ActionEvent event) {
        pinnn += "8";
        apin.setText(pinnn);
    }

    @FXML
    void sembilan(ActionEvent event) {
        pinnn += "9";
        apin.setText(pinnn);
    }

    @FXML
    void c(ActionEvent event) {
        pinnn = "";
        apin.setText(pinnn);
    }

    @FXML
    void nol(ActionEvent event) {
        pinnn += "0";
        apin.setText(pinnn);
    }

    @FXML
    void ok(ActionEvent event) throws IOException {
        if (pinnn.equals(PINNN)){
        try {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("fxmlmenuawal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 830, 450);
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("BankMoklet");
        stage.show();
        
        } catch (IOException e){
            System.out.println("Failed to create new Window." + e);
        }
        }else {
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa" + kesempatan + "kesempatan lagi");
            apin.setText("");
            pinnn = "";
            if (kesempatan == 0){
                System.exit(0);
            }
            
        }
    }

    @FXML
    private void pinnn(ActionEvent event) {
    }
    
}

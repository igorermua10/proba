package ehu.isad.controller.ui;
import java.net.URL;
import java.util.ResourceBundle;

import ehu.isad.Main;
import ehu.isad.Txanpona;
import ehu.isad.controller.db.DBTxanponak;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

public class Mainkud  implements Initializable {
    private Main main;
    public void setMainApp (Main main){
        this.main = main;
    }



        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button btn_sartu;

        @FXML
        private Button btn_gorde;

        @FXML
        private TableColumn<?, ?> id;

        @FXML
        private TableColumn<?, ?> txanpon;

        @FXML
        private TableColumn<?, ?> noiz;

        @FXML
        private TableColumn<?, ?> zenbat;

        @FXML
        private TableColumn<?, ?> bolumena;

        @FXML
        private TableColumn<?, ?> portaera;

        @FXML
        void onClick(ActionEvent event) {

        }
        private final ObservableList<Txanpona> model = FXCollections.observableArrayList(DBTxanponak.getDbTxanponak().getTxanpona());


        @FXML
        void initialize() {
            assert btn_sartu != null : "fx:id=\"btn_sartu\" was not injected: check your FXML file 'Main.fxml'.";
            assert btn_gorde != null : "fx:id=\"btn_gorde\" was not injected: check your FXML file 'Main.fxml'.";
            assert id != null : "fx:id=\"id\" was not injected: check your FXML file 'Main.fxml'.";
            assert txanpon != null : "fx:id=\"txanpon\" was not injected: check your FXML file 'Main.fxml'.";
            assert noiz != null : "fx:id=\"noiz\" was not injected: check your FXML file 'Main.fxml'.";
            assert zenbat != null : "fx:id=\"zenbat\" was not injected: check your FXML file 'Main.fxml'.";
            assert bolumena != null : "fx:id=\"bolumena\" was not injected: check your FXML file 'Main.fxml'.";
            assert portaera != null : "fx:id=\"portaera\" was not injected: check your FXML file 'Main.fxml'.";

        }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}





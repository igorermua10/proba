package ehu.isad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Parent MainUI;

    private Stage stage;

    private Object mainkud;
    @Override



    public void start (Stage primaryStage) throws Exception{

        stage=primaryStage;
        pantailaKargatu();
        stage.setTitle("Txanponak");
        stage.setScene((new Scene(MainUI)));
        stage.show();
    }
    private void pantailaKargatu() throws IOException{
        FXMLLoader loaderTxanponak = new FXMLLoader(getClass().getResource("/Main.fxml"));
        MainUI = (Parent)loaderTxanponak.load();
        mainkud = loaderTxanponak.getController();
        mainkud.setMainApp(this);
    }
    public static void main(String[] args) {
        launch(args);
    }

}

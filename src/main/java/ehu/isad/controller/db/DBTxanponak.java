package ehu.isad.controller.db;

import ehu.isad.Txanpona;
import javafx.scene.image.Image;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBTxanponak {

    private static DBTxanponak dbTxanponak = new DBTxanponak();

    private DBTxanponak(){}

    public static DBTxanponak getDbTxanponak(){
        return dbTxanponak;
    }
    public List<Txanpona> getTxanpona(){
        List<Txanpona> emaitza = new ArrayList<>();
        String query = "select id , txanpon, noiz, zenbat, bolumena, portaera FROM txanponak;";
        ResultSet rs = DBKudeatzaile.getInstantzia().execSQL(query);
        try{
            while (rs.next()){
                Integer id = rs.getInt("id");
                String txanpon = rs.getString("txanpon");
                Date noiz = rs.getDate("noiz");
                Double zenbat = rs.getDouble("zenbat");
                Double bolumena = rs.getDouble("bolumena");
                String portaera = rs.getString("portaera");


                Image portaeraf = this.getImage(portaera);
                Txanpona aktual = new Txanpona(id, noiz, zenbat, bolumena, portaeraf);
                emaitza.add(aktual);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return emaitza;
    }
    private Image getImage (String portaera){
        return new Image(getClass().getResourceAsStream(portaera));
    }
    //public void gehituBerria
}

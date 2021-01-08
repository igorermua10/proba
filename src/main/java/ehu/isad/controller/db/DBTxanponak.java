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
        String query = "select id, data, balioa, mota, bolumena FROM txanponak;";
        ResultSet rs = DBKudeatzaile.getInstantzia().execSQL(query);
        try{
            while (rs.next()){
                Integer id = rs.getInt("id");
                Date data = rs.getDate("data");
                Double balioa = rs.getDouble("balioa");
                String mota = rs.getString("mota");
                Double bolumena = rs.getDouble("bolumena");


                Image portaeraf = this.getImage(portaera);//Horrela jarri beharrean parametro gabe jarri eta metodo batek lortzea
                Txanpona aktual = new Txanpona(id, mota, data, balioa, bolumena, portaeraf);
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

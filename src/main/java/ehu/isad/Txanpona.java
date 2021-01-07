package ehu.isad;

import javafx.scene.image.Image;

import java.sql.Date;

public class Txanpona {
    private int id;


    private String txanpon;
    private Date noiz;
    private Double zenbat;
    private Double bolumena;
    private Image portaera;

    public Txanpona(Integer id, Date noiz, Double zenbat, Double bolumena, Image portaera) {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTxanpon() {
        return txanpon;
    }

    public void setTxanpon(String txanpon) {
        this.txanpon = txanpon;
    }

    public Date getNoiz() {
        return noiz;
    }

    public void setNoiz(Date noiz) {
        this.noiz = noiz;
    }

    public double getZenbat() {
        return zenbat;
    }

    public void setZenbat(double zenbat) {
        this.zenbat = zenbat;
    }

    public double getBolumena() {
        return bolumena;
    }

    public void setBolumena(double bolumena) {
        this.bolumena = bolumena;
    }

    public Image getPortaera() {
        return portaera;
    }

    public void setPortaera(Image portaera) {
        this.portaera = portaera;
    }
    @Override
    public String toString() {
        return "Txanpona{" +
                "txanpon='" + txanpon + '\'' +
                ", noiz=" + noiz +
                ", portaera=" + portaera +
                '}';
    }



}

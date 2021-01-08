package ehu.isad;

import javafx.scene.image.Image;

import java.sql.Date;

public class Txanpona {
    private int id;
    private String mota;
    private Date noiz;
    private Double zenbat;
    private Double bolumena;
    private Image portaera;

    public Txanpona(Integer id, String mota, Date noiz, Double zenbat, Double bolumena, Image portaera) {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
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
                "mota='" + mota + '\'' +
                ", noiz=" + noiz +
                ", portaera=" + portaera +
                '}';
    }



}

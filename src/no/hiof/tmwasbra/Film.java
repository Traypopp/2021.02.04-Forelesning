package no.hiof.tmwasbra;

import java.time.LocalDate;

public class Film {
    private String tittel, sjanger;
    private int spilleTid;
    private LocalDate lanseringsDato;

    public Film(String tittel, String sjanger, int spilleTid, LocalDate lanseringsDato) {
        this.tittel = tittel;
        this.sjanger = sjanger;
        this.spilleTid = spilleTid;
        this.lanseringsDato = lanseringsDato;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getSjanger() {
        return sjanger;
    }

    public void setSjanger(String sjanger) {
        this.sjanger = sjanger;
    }

    public int getSpilleTid() {
        return spilleTid;
    }

    public void setSpilleTid(int spilleTid) {
        this.spilleTid = spilleTid;
    }

    public LocalDate getLanseringsDato() {
        return lanseringsDato;
    }

    public void setLanseringsDato(LocalDate lanseringsDato) {
        this.lanseringsDato = lanseringsDato;
    }
}

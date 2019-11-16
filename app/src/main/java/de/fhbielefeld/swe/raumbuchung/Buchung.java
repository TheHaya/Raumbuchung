package de.fhbielefeld.swe.raumbuchung;
import java.sql.Date;

public class Buchung {
    int raum;
    Date dat;
    int buchungsID;

    public Buchung(int raum, Date dat, int buchungsID) {
        this.raum = raum;
        this.dat = dat;
        this.buchungsID = buchungsID;
    }

    public int getRaum() {
        return raum;
    }

    public void setRaum(int raum) {
        this.raum = raum;
    }

    public Date getDat() {
        return dat;
    }

    public void setDat(Date dat) {
        this.dat = dat;
    }

    public int getBuchungsID() {
        return buchungsID;
    }

    public void setBuchungsID(int buchungsID) {
        this.buchungsID = buchungsID;
    }


}

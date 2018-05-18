/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaTest;

/**
 *
 * @author Flow-User
 */
class Adresse {
    private String Vorname;

    private String Nachname;
    
    private String Strasse;
            
    private String Hausnummer;
            
    private String Plz;
            
    private String Ort;
            
    private String Land;

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String Vorname) {
        this.Vorname = Vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String Nachname) {
        this.Nachname = Nachname;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String Ort) {
        this.Ort = Ort;
    }
    
    @Override

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(Vorname).append(" ").append(Nachname)

          .append("\n").append(Strasse).append(" ").append(Hausnummer)

          .append("\n").append(Plz).append(" ").append(Ort)

          .append("\n").append(Land);

        return sb.toString();

    }
}




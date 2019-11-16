package de.fhbielefeld.swe.raumbuchung;

public class User {
    String username;
    String pw;
    String mail;
    int userid;

    public User(String username, String pw, String mail, int userid) {
        this.username = username;
        this.pw = pw;
        this.mail = mail;
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}

package com.example.esercizioappsalutare.entity;

public class Saluto {
    private String messaggio;

    public Saluto(String messaggio) {
        this.messaggio = messaggio;
    }

    public Saluto() {
    }

    public String getMessaggio() {
        return messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }
}

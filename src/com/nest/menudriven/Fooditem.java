package com.nest.menudriven;

public class Fooditem {
    int tea;
    int dosa;
    int coffe;
    int idili;

    public Fooditem(int tea, int dosa, int coffe, int idili) {
        this.tea = tea;
        this.dosa = dosa;
        this.coffe = coffe;
        this.idili = idili;
    }

    public int getTea() {
        return tea;
    }

    public void setTea(int tea) {
        this.tea = tea;
    }

    public int getDosa() {
        return dosa;
    }

    public void setDosa(int dosa) {
        this.dosa = dosa;
    }

    public int getCoffe() {
        return coffe;
    }

    public void setCoffe(int coffe) {
        this.coffe = coffe;
    }

    public int getIdili() {
        return idili;
    }

    public void setIdili(int idili) {
        this.idili = idili;
    }
}

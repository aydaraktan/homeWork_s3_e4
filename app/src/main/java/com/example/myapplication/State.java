package com.example.myapplication;

public class State {

    private String name; // название
    private String capital;  // столица
    private int flagResource; // ресурс флага

    public State(String name, String capital, int flag){

        this.name=name;
        this.capital=capital;
        this.flagResource=flag;
    }

    public String getName() {
        return this.name;
    }



    public String getCapital() {
        return this.capital;
    }


    public int getFlagResource() {
        return this.flagResource;
    }

}
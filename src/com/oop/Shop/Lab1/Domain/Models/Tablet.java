package com.oop.Shop.Lab1.Domain.Models;

public class Tablet extends Mobile {

    private String ram;
    private String storage;
    private int cameras;
    private String OS;

    public Tablet(String ram, String storage, int cameras, String OS){
        this.ram=ram;
        this.storage=storage;
        this.cameras=cameras;
        this.OS=OS;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getStorage() {
        return this.storage;
    }

    @Override
    public int getCameras() {
        return this.cameras;
    }

    @Override
    public String getOS() {
        return this.OS;
    }

}
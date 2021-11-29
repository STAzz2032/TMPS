package com.oop.Shop.Lab1.Domain.Models;

public class MicroSD extends Memory {

    private String type;
    private String storage;


    public MicroSD(String storage, String type){

        this.storage=storage;
        this.type=type;
    }
    @Override
    public String getStorage() {
        return this.storage;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
package com.oop.Shop.Lab1.Domain.Models;

public abstract class Memory {

    public abstract String getStorage();
    public abstract String getType();

    @Override
    public String toString(){
        return "Storage="+this.getStorage()+", Type="+this.getType();
    }
}
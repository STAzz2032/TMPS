package com.oop.Shop.Lab1.Domain.Models;

public abstract class Mobile {

    public abstract String getRAM();
    public abstract String getStorage();
    public abstract int getCameras();
    public abstract String getOS();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", Storage="+this.getStorage()+", Cameras="+this.getCameras()+", OS="+this.getOS();
    }
}
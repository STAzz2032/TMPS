package com.oop.Shop.Lab1.Domain.Factory;

import com.oop.Shop.Lab1.Domain.Models.Mobile;
import com.oop.Shop.Lab1.Domain.Models.Smartphone;
import com.oop.Shop.Lab1.Domain.Models.Tablet;

public class MobileFactory {

    public static Mobile getMobile(String type, String ram, String storage, int cameras, String OS) {
        if ("Smartphone".equalsIgnoreCase(type)) return new Smartphone(ram, storage, cameras, OS);
        else if ("Tablet".equalsIgnoreCase(type)) return new Tablet(ram, storage, cameras, OS);

        return null;
    }
}
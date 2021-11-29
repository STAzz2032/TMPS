package com.oop.Shop.Lab1.Domain.Factory;

import com.oop.Shop.Lab1.Domain.Models.Computer;
import com.oop.Shop.Lab1.Domain.Models.Server;
import com.oop.Shop.Lab1.Domain.Models.PC;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }
}
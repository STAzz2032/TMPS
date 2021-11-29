package com.oop.Shop.Lab1.Client;

import com.oop.Shop.Lab1.Domain.Factory.ComputerFactory;
import com.oop.Shop.Lab1.Domain.Models.Computer;
import com.oop.Shop.Lab1.Domain.Factory.MobileFactory;
import com.oop.Shop.Lab1.Domain.Models.Memory;
import com.oop.Shop.Lab1.Domain.Models.Mobile;
import com.oop.Shop.Lab1.Domain.Factory.MemoryFactory;

public class Main {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        Mobile samsung = MobileFactory.getMobile("smartphone","4 GB","32 GB",2,"Android");
        Mobile ipad = MobileFactory.getMobile("tablet","3 GB","32 GB", 2,"IOS");
        Memory hdd = MemoryFactory.getMemory("HDD","512 GB","internal");
        Memory microsd = MemoryFactory.getMemory("MicroSD","32 GB","external");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
        System.out.println("Samsung Config::"+samsung);
        System.out.println("Ipad Config::"+ipad);
        System.out.println("Factory HDD Config::"+hdd);
        System.out.println("Factory MicroSD Config::"+microsd);
    }

}
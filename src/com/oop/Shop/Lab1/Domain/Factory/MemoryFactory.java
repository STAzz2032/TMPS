package com.oop.Shop.Lab1.Domain.Factory;

import com.oop.Shop.Lab1.Domain.Models.Memory;
import com.oop.Shop.Lab1.Domain.Models.HDD;
import com.oop.Shop.Lab1.Domain.Models.MicroSD;

public class MemoryFactory {

    public static Memory getMemory(String type, String storage, String M_type){
        if("HDD".equalsIgnoreCase(type)) return new HDD(storage,M_type);
        else if("MicroSD".equalsIgnoreCase(type)) return new MicroSD(storage,M_type);

        return null;
    }
}
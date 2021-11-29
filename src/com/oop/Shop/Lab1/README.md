# Creational and Structural Design Patterns

Author: Bandalac Sergiu

## Objectives

* Get familiar with Creational and Structural DPs;
* Choose a specific domain (digital shop);
* Implement at least 3 CDPs and 3 SDPs for digital shop.

## Used Design Patterns

* Factory Design Pattern
* Adapter Design Pattern

## Implementation

### Abstract Computer class has 3 resources : RAM, HDD adn CPU
```java
public abstract class Computer {

    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}
```

### From that implemented PC and server classes using Factory Design
```java
public class PC extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public PC(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

}
```

```java
public class Server extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

}
```
### Same functionalities and abstraction are used for Mobile and Memory classes

## Factory class

```java
public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }
}
```

## Client class

```java
 Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
 Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");

 System.out.println("Factory PC Config::"+pc);
 System.out.println("Factory Server Config::"+server);
}
```

## Conclusions
I learned how design patterns make software development easier by providing a toolbox of solutions to common problems you encounter in object-oriented design.
The most common design patterns are divided into
creational patterns that describe how objects are created;
structural patterns that describe how objects and classes are combined into larger composite structures, and
behavioral patterns that describe how objects and classes interact.

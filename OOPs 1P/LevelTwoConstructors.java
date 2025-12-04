class Laptop{
    String brand;
    String ram;
    int price;

    Laptop(String brand,String ram,int price) {
        this.brand =brand;
        this.ram  = ram;
        this.price = price;
    }

    void  details(){
        System.out.println(this.brand);
        System.out.println(this.price);
        System.out.println(this.ram);
    }

    
}

class Person{
    String name;
    int age;

    Person(String name,int age){
        this.age = age;
        this.name = name;
    }

    void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

class employ{
    String name;
    String id;
    long salary;

    employ(String name, String id, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void detail(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.salary);
    }

    
}
public class LevelTwoConstructors {
    public static void main(String[] args) {
        {
            Laptop l1 = new Laptop("APPLE","16Gb",69000);
            l1.details();
        }
        System.out.println("");
        {
           Person p1 = new Person("Adugarla Srinu", 19);
           p1.info();
        }
        System.out.println("");
        {
            employ e1 = new employ("Abhinay Teja", "N231053", 200000);
            e1.detail();
        }
    }
}

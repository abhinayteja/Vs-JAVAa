class Student{
    String name ;
    int age;
}
class Car{
    String brand;
    String model;

}

class Mobile{
    String company;
    int price;

    void details(){
        System.out.println(this.company + " " + this.price);
    }
}

class Book{
    String title;
    String author;
    int pages;

    void info(){
        System.out.println("Title  : " + this.title +"\n" + "Author : "+this.author + "\n"+ "Pages  : "+ this.pages);
    }
}

class Aninimal{
    void sound(){
        System.out.println("This animal make this sound");
    }
}
public class basicProblem {
    public static void main(String[] args) {
        System.out.println(" ");
        {
            Student s1 = new Student();

            s1.name = "AbhinayTeja";
            s1.age = 18;

            System.out.println(s1.name + " " + s1.age);
        }
        System.out.println(" ");
        {
            Car c1 = new Car();
            Car c2 = new Car();

            c1.brand = "Benz";
            c1.model = "I2";

            c2.brand = "BMW";
            c2.model = "i7";

            System.out.println(c1.brand +" "+ c1.model);
            System.out.println(c2.brand +" "+ c2.model);

        }
        System.out.println(" ");
        {
            Mobile smartMobile = new Mobile();

            smartMobile.company  = "Realme";
            smartMobile.price    = 14499;
            smartMobile.details();
        }
        System.out.println(" ");

        {
          
              Book b1 = new Book();

              b1.title = "Title With Out Fights";
              b1.author = "AbhinayTeja";
              b1.pages = 1011;
              b1.info();

        }
        System.out.println(" ");
        {
            Aninimal a1 = new Aninimal();
            Aninimal a2 = new Aninimal();
            Aninimal a3 = new Aninimal();

            a1.sound();
            a2.sound();
            a3.sound();
            
        }


    }
}


class Pencil {
    String type;
    String company;
    String color;
    int noOf;

    public Pencil(int noOf,String color) { // It will create object with the fixed or can be changed
        this.noOf = noOf;     // This refers to the it is belong to the particular class 
        this.color = color;   // If this is not mentioned ,it will come under the static variable >> cover the complete class 
    }

    

    public void printType(){
        System.out.println(this.company);
        System.out.println(this.type);
        System.out.println(this.noOf); // what is this...... ?? Get cleared  Q!!!
        System.out.println(this.color);
    }
    
}
public class basic1 {
    public static void main(String[] args) {

        Pencil p1 = new Pencil(5,"grey");
        p1.company = "Natraja Pencil";
        p1.type = "2HB";
        p1.noOf = 102; // < Here we are updating the value of the int noOf > //
        p1.printType();

        Pencil p2 = new Pencil(10,"grey");
        p2.company = "Apsara Pencil";
        p2.type = "Extra dark";
        p2.printType();
        
    }
}

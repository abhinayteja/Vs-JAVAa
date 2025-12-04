
import java.util.Scanner;



// - [ ]  Make a class **Rectangle** with length, width.
// - [ ]  Constructor sets values.


class Rectangle{
    double Length;
    double Width;

    Rectangle(double Length,double Width) {
        this.Length = Length;
        this.Width = Width;
    }
    
    void Area(){
        double area = this.Length * this.Width; 
        System.out.println("Area of the Rectangle : "+area);
    }
    
}
public class jkdb {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Length : ");
        double length = in.nextDouble();

        System.out.print("Enter Width  : ");
        double width = in.nextDouble();

        

        Rectangle shape1 = new Rectangle(length,width);
        shape1.Area();
        
        
    }
}

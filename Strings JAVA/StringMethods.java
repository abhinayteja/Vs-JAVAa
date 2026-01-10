// exploring the import string methods  in java 
// length -- String_name.length()  --> return : int
// character -- String_name.charAt(Index); --> return : char
// equal -- comaparing the strings --> String_name.equal(Particular string name to compare ); --> return  : boolen
// equalIgnoreCase --> String_name.equalIgnoreCase(String_name to compare); -->return : boolean
// toCharArray --> String_name.toCharArray() --> return : converts the string to the char;
//

public class StringMethods {
    public static void main(String[] args) {
        // String length 
        String s = "Japan";
        String m = "Japan";

        System.out.println("String length : "+s.length());
        System.out.println("Does s == m :"+s.equals(m));
        System.out.println("Does s == m (ignoring the upper case) :"+s.equalsIgnoreCase(m));
        System.out.println("Char at 1 : "+s.charAt(1));
        System.out.print("Printing the character array : ");
        for (int i = 0; i <= s.length()-1; i++) {
            System.out.print(" "+s.charAt(i)+" ");
        }
    }
}

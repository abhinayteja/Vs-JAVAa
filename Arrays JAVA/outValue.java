public class outValue{
    public static void main(String args[]){
        int [] arr = new int[5];
        String [] name = new String[5];

        arr[1] = 20;
        name[1] = "Raja Ram Mohan Roy";

        System.out.println(name[0]); // For the strings ----> It will gives the null value in the nonPrimitives ----> Cause : it create as a object
        System.out.println(arr[0]); // For the integers ----> It will gives the 0 vlaue in Primitives ----> Cause :  it Create as a memory
        System.out.println(name[1]);  // Prints the First Index
        System.out.println(arr[1]); // prints the First Index
    }
}

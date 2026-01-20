public class compStrings {
    public static void main(String[] args) {
        // STRING comp

        // By the name1.equal(name2) --> compare the content inside the 
        // string (return bool value).

        // By the == (compoarision operator ) --> compare that the it 
        // belong to the same object or not (retur bool value)

        String a = "Rane vacchadoyamm aa ramaya";
        String b = "Rane vacchadoyamm aa ramaya";

        // System.out.println(a == b); // check wether the object belongs to same string --> return false
        System.out.println((a.equals(b))); // checks the content inside it

    }
}

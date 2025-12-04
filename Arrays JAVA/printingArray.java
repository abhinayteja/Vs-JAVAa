public class printingArray {
    public static void main(String[] args) {
        int [][] arr  = {{1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}};
       
        // for (int[] arr1 : arr) {
        //     System.out.println(Arrays.toString(arr1));
        // }

        for(int [] arr1 : arr){
            for(int value : arr1){
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println();

        int [][] array1 = {
            {3,4,8,9},
            {6,5,4},
            {3,5,7,8}
        };

            for (int[] array11 : array1) {    
                
    // Use for-each when:
    // 1.You only need values
    // 2.You don’t care about index
    // 3.You’re just reading array/list
    // 4.No modification needed 
    
            for (int j = 0; j < array11.length; j++) {
                System.out.print(array11[j] + " ");
            }
            System.out.println();
        }
    }
}

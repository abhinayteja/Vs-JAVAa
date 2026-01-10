public class ssLs {
    public static void main(String[] args) {
        int [] arr = {3,4,5,6,7,8};

        int x = 7;
        // find the elment using the linear search
         System.out.println("The Element is in : "+ fin(arr,x)+" INDEX");
    }
    static int fin(int arr[],int ans){
        if (arr.length == 0) {
            return  -1;
        }
        for(int i = 0 ; i < arr.length;i++){
            if (arr[i] == ans) {
                return i;
            }
        }
        return  -1;
    }
}

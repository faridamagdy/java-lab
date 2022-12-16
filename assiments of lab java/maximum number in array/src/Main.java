public class Main {
    public static void main(String[] args) {
         //creating an array
        int[] arr = {10, 3, 7, 30, 21, 8, 10,50};
        int max=arr[0];
        //for loop to walk on every number in the array
        for (int i = 1; i < arr.length; i++) {
            //compare every element with another current element
            if(arr[i]>max ) {
                max=arr[i];
            }
        }
        System.out.println("the max number in array is = " + max);
    }
}
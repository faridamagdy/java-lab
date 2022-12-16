//craeting a class
class quickSort{
    //crating function
    public void QuickSort(int[]arr,int low ,int high){
        if(low>high)
            return;
        //creating variable to get the middle of the number
        //if there are 10 numbers the middle is number 5
        int middle =low+(high-low)/2;
        int povit=arr[middle];
        //storing
        //i start index and j end index
        int i=low;
        int j=high;
        while (i<=j){
            //if the povit is larger than  current array number increase the index  of i by one
            while(arr[i]<povit)
                i++;
            //if the povit is larger than  current array number decrease the index of j by one
            while(arr[j]>povit)
                j--;

            if(i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        if(low<j)
        {
            //using recursion on function
            QuickSort(arr,low,j);
        }
        if(high>j)
        {
            //using recursion on function
            QuickSort(arr,i,high);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int []arr={10,3,5,11,19,7,2,1,20};
        System.out.println("before sort");
        //display the array numbers
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"  ");
        // craeting new object
        quickSort q =new  quickSort();
        //using object to recall the function
        q.QuickSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("after sort");
        //display array numbers after sorting them
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"  ");
    }
}
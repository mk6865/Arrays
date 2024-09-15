import java.io.*;
import java.util.*;
class Largest_No{
    public static int findLargest(int arr[]){
        int res = 0;
        for(int i =1;i<arr.length;i++){
            if(arr[i]>arr[res])
            {
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = findLargest(arr);
        System.out.println("Largest element is: "+result);

    }
}
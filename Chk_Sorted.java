import java.util.*;
public class Chk_Sorted {
    public static void check_Sorted(int arr[]){
        int n = arr.length;
        for(int i =1;i<n;i++){
            if(arr[i]<arr[i-1]){
                System.out.println("Array is not sorted");
                return;
            }
        }
        System.out.println("The Array is sorted");
        
    }
    public static void main(String[] args){
    System.out.println("Enter the Size of the array");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of the array");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    check_Sorted(arr);

    }
}

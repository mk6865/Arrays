import java.util.Scanner;
public class Left_Rotate_By_D {
    public static void Left_Rotate_D(int arr[] , int d){
        for(int i=0;i<d;i++){
            Left_Rotate_by_one(arr, d);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

    }
    public static void Left_Rotate_by_one(int arr[],int d){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
    public static void main(String[] args){
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the no of position you want to rotate");
        int d = sc.nextInt();
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Left_Rotate_D(arr, d);
        
    }
}

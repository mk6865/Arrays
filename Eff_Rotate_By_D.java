import java.util.Scanner;
public class Eff_Rotate_By_D {
    public static  void Rotate_By_D(int arr[], int d){
        int n = arr.length;
        int temp[] = new int[d];
        for(int i =0;i<d;i++){
            temp[i] = arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d] = arr[i];
        }
        for(int i=0;i<d;i++){
            arr[n-d+i] =temp[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        System.out.print("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter  the number of the position you want to rotate");
        int d = sc.nextInt();
        System.out.println("Enter the elements of the array");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Rotate_By_D(arr,d);
    }
}
    


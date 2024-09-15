import java.util.Scanner;

public class Rotate_By_One {

        public static void Rotate_By_One(int[] arr){
            int n = arr.length;
            int temp = arr[0];
            for(int i =1;i<n;i++){
                arr[i-1] = arr[i];
            }
            arr[n-1] = temp;
            for(int i=0;i<n;i++){
                System.out.print(arr[i] +" ");
            }
        }
        public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]  = sc.nextInt();
        }
        Rotate_By_One(arr);
    }
}
    


public class ReverSal_Rotate_ByD {
    public static void Left_Rotate(int[] arr, int d){
        int n = arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0,n-1);
    

    }
    public static void reverse(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int d = 2;
        int n = arr.length;
        Left_Rotate(arr,d);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }
}

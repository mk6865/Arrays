public class Eff_Remove_dup {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3,4,4};
        int n = arr.length;
        int result = 1;
        for(int i=1;i<n;i++){
            if(arr[result -1] != arr[i]){
                arr[result]  = arr[i];
                result++;
            }
        }
        for(int i =0;i<result;i++){
            System.out.println(arr[i] +" ");
        }
        System.out.println("The total no of unique elements" + result);
    }
    
}

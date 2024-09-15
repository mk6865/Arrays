import java.util.*; // Imports all classes from java.util package
// import java.io.*;   // Imports all classes from java.io package


public class Eff_Reverse_Arr {
    public static void reverse(Integer[] arr) {
        // Convert the array to a List
        List<Integer> list = Arrays.asList(arr);

        // Use the built-in Collections.reverse() method
        Collections.reverse(list);

        // Convert the list back to an array (optional) and print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        reverse(arr); // Call to reverse the array using Collections.reverse()
    }
}


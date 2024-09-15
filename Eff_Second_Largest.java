import java.util.Scanner; // Fix: You forgot to import Scanner

public class Eff_Second_Largest {
    public static void Check_Second_Largest(int arr[]) {
        int n = arr.length;
        int result = -1; // To store the index of the second largest element
        int largest = 0; // Assume the first element is the largest initially

        // Traverse the array starting from the second element
        for (int i = 1; i < n; i++) {
            // If current element is greater than the current largest
            if (arr[i] > arr[largest]) {
                result = largest; // Update result to store previous largest
                largest = i;      // Update largest to current element
            }
            // If current element is smaller than the largest but larger than second largest
            else if (arr[i] != arr[largest]) {
                if (result == -1 || arr[i] > arr[result]) {
                    result = i; // Update second largest if a larger candidate is found
                }
            }
        }

        // Output the second largest element or handle the case if it doesn't exist
        if (result == -1) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest element is at index " + result + ": " + arr[result]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Fix: Import Scanner and initialize
        System.out.print("Enter the size of the array: "); // Fix: Grammar correction
        int n = sc.nextInt(); // Read the size of the array

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:"); // Prompt for array input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read array elements
        }

        Check_Second_Largest(arr); // Call the method to check the second largest
        sc.close(); // Fix: Close the scanner to avoid resource leak
    }
}

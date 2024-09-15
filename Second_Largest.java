import java.util.Scanner;

public class Second_Largest {
    // Method to check for the second largest element
    public static void Check_Second_Largest(int arr[]) {
        int n = arr.length;
        int result = -1; // Result initialized to -1 (to store index of second largest)
        int max = getLargest(arr); // Fix: Remove the 'int' keyword here; just pass 'arr'
        
        for (int i = 0; i < n; i++) {
            // Check for the second largest element
            if (arr[i] != arr[max]) { // Fix: Compare with arr[max], not arr[i]
                if (result == -1 || arr[i] > arr[result]) { // Fix: Combine both conditions in a single if statement
                    result = i;
                }
            }
        }

        if (result == -1) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + arr[result]);
        }
    }

    // Method to get the index of the largest element
    public static int getLargest(int arr[]) {
        int n = arr.length; // Fix: The 'n' variable was undefined, we declare it here
        int max = 0; // Fix: Start with max as the index 0, not the value arr[0]
        for (int i = 1; i < n; i++) { // Loop starts from 1 since we assume arr[0] is the max initially
            if (arr[i] > arr[max]) { // Fix: Compare values, arr[i] with arr[max], not index i with max
                max = i; // Update max to the index of the largest element
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt(); // Read the array size

        int[] arr = new int[n]; // Create an array of size 'n'
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) { // Loop to input elements into the array
            arr[i] = sc.nextInt();
        }

        Check_Second_Largest(arr); // Call the method to check the second largest element
        sc.close(); // Close the scanner to prevent resource leakage
    }
}

import java.util.Scanner;

public class Navive_Remove_dup {
    public static void remove_duplicates(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return; // Handle cases where the array is empty or has only one element
        }

        int result = 1; // Tracks the number of unique elements
        int temp[] = new int[n]; // Temporary array to store unique elements
        temp[0] = arr[0]; // The first element is always unique

        // Iterate through the array to find unique elements
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) { // Compare with the previous element in arr
                temp[result] = arr[i]; // Store the unique element in temp
                result++;
            }
        }

        // Copy the unique elements back to the original array
        for (int i = 0; i < result; i++) {
            arr[i] = temp[i];
        }

        // Print the array with unique elements
        for (int i = 0; i < result; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Print the total number of unique elements
        System.out.println("The total number of unique elements: " + result);
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        remove_duplicates(arr);
        sc.close(); // Close the scanner to avoid resource leak
    }
}


package QuestionPractices.BasicQuestions;
 import java.util.Arrays;
 

public class ArrayRotateRight {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2; // number of steps to rotate
        int n = arr.length;

        // Handle case when k > n
        // k = k % n;

        // Create new array
        int rotated[] = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Right Rotated by " + k + ": " + Arrays.toString(rotated)); 
    }
}

 
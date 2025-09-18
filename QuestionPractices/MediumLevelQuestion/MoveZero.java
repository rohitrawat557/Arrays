package QuestionPractices.MediumLevelQuestion;
public class MoveZero {
    public static void main(String[] args) {
        int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6};

        int n = arr.length;
        int index = 0; // position to place non-zero elements

        // Step 1: Move non-zero elements forward
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Step 2: Fill remaining positions with 0
        while (index < n) {
            arr[index] = 0;
            index++;
        }

        // Print result
        System.out.print("Array after moving zeros: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

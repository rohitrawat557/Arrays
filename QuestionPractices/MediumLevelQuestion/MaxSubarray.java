// kadane's Algorithm


package QuestionPractices.MediumLevelQuestion;

public class MaxSubarray {
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int currentSum = 0;
        int maxSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];   // add current element

            if (currentSum > maxSum) {           // update max if needed
                maxSum = currentSum;
            }

            if (currentSum < 0) {               // reset if sum goes negative
                currentSum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
}

    

 
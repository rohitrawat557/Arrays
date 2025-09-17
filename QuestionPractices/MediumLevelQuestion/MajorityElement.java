 package QuestionPractices.MediumLevelQuestion;
 
   public class MajorityElement{
    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 2, 2, 2};
        int n = arr.length;

        // Step 1: Find candidate
        int count = 0, candidate = -1;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify candidate
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            System.out.println("Majority element is: " + candidate);
        } else {
            System.out.println("No majority element found.");
        }
    }
}

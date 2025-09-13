package QuestionPractices.BasicQuestions;

class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 4, 4, 5};

        int n = arr.length;
        int j = 0; // index for unique elements

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1]; // add last element

        // print unique elements
        System.out.print("Unique elements: ");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

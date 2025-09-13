package QuestionPractices.BasicQuestions;
public class ArraySorted {
    public static void main(String[] args) {
        int arr[] = {5,10,15,20,25};
        boolean isSorted = true;

        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted)
        System.out.println("Array is sorted in ascending order. ");
        else
        System.out.println("Array is not sorted.");
    }
}

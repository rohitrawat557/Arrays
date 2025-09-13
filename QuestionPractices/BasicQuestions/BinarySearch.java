package QuestionPractices.BasicQuestions;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int li = 0;
        int hi = arr.length-1;
        int element = 60;
        while(li<=hi){
            int mi = (li+hi)/2;
            if(arr[mi]==element){
                System.out.println("Element found at "+mi+" index position");
                break;
            }
            if(element>arr[mi]){
                li = mi + 1;
            }
            else{
                hi = mi - 1;
            }
        }
    }
}

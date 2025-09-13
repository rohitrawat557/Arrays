package QuestionPractices.BasicQuestions;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to found : ");
        int element = sc.nextInt();
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                System.out.println("Element found at "+i+" index position");
               found = true;
                break;
            }
        }
        if(found==false){
            System.out.println("Element not found ");
        }
        sc.close();
    }
}

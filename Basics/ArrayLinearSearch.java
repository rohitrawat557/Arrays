package Basics;

public class ArrayLinearSearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};

        int element = 30;
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                System.out.println("Element is found at "+i+" index position");
                found = true;
                break;
            }
            
        }
        if(found==false){
            System.out.println("Element not found");
        }
    }
}

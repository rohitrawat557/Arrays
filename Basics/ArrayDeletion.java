package Basics;

public class ArrayDeletion {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};

        int indxpos = 2;
        
        int newArry[] = new int[arr.length-1];
        int j=0;

        for(int i=0;i<arr.length;i++){
            if(i==indxpos){
                continue;
            }
            newArry[j] = arr[i];
            j++;
        }
        for(int i=0;i<newArry.length;i++){
            System.out.print(newArry[i]+" ");
        }
    }
}

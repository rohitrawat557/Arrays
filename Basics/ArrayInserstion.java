package Basics;

public class ArrayInserstion {
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50};
        int idxpos = 2;
        int element = 100;
        

        int newArry[] = new int[arr.length+1];
        for(int i=0;i<idxpos;i++){
        newArry[i] = arr[i];
        }
        newArry[idxpos] = element;
        for(int i=idxpos;i<arr.length;i++){
            newArry[i+1] = arr[i];
        }
        for(int i=0;i<newArry.length;i++){
            System.out.print(newArry[i]+" ");
    }
       
    }
}

package Basics;

public class ArrayUpdation {
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50};
        int indxpos = 3;
        int element = 100;

        arr[indxpos] = element;
        for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+ " ");
        }
    }
}

package SortingTechniques;

public class BubbleSort {
    public static void main(String[] args) {
        int arr [] = {55,32,44,25,16};
        int temp;
        for(int i=0;i<arr.length;i++){
            boolean swapped = false;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
        if(swapped==false){
            break;
        }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

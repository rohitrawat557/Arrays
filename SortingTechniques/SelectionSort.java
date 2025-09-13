package SortingTechniques;

public class SelectionSort {
public static void main(String[] args) {
    int arr[] = {40,30,55,33,45};
    int temp;
    for(int i=0;i<arr.length;i++){
        int min = i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[min]>arr[j]){
                min = j;
            }
        }
        temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;

    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}     
}

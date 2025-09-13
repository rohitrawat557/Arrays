package SortingTechniques;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {50,30,10,40,20};
        for(int i=0;i<arr.length;i++){
            int temp = arr[i];    //temp = 30
            int j = i-1;          // j = 0
            while (j>=0 && arr[j]>temp) {  // false (j = -1)
                arr[j+1] = arr[j];        // arr [] ={50,50,10,40,20}
                j--;            // j = -1
            }
            arr[j+1] = temp;      //    arr [] ={30,50,10,40,20}
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}




/*
 * int temp = arr[4];   // temp = 20
int j = 3;           // j = i-1 = 3
while (j>=0 && arr[j] > temp)  
→ (3 >= 0 && arr[3]=50 > 20) true
    arr[j+1] = arr[j]; // arr[4] = 50 → {10, 30, 40, 50, 50}
    j--;               // j = 2
while (j>=0 && arr[j] > temp)  
→ (2 >= 0 && arr[2]=40 > 20) true
    arr[j+1] = arr[j]; // arr[3] = 40 → {10, 30, 40, 40, 50}
    j--;               // j = 1
while (j>=0 && arr[j] > temp)  
→ (1 >= 0 && arr[1]=30 > 20) true
    arr[j+1] = arr[j]; // arr[2] = 30 → {10, 30, 30, 40, 50}
    j--;               // j = 0
while (j>=0 && arr[j] > temp)  
→ (0 >= 0 && arr[0]=10 > 20) false
arr[j+1] = temp; // arr[1] = 20

 */
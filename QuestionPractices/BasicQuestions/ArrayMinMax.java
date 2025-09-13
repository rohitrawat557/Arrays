package QuestionPractices.BasicQuestions;
class ArrayMinMax{
    public static void main(String args[]){
        int arr [] = {12,5,45,7,38,2};
        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
    System.out.println("Smallest : "+ min);
    System.out.println("Largest : "+ max);
    }
}
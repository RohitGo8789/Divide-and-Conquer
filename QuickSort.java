public class QuickSort {
    public static void quickSort(int arr[], int si, int ei){
        //base case
        if(si >= ei){
            return;
        }

        //find last element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1); //left part sorted
        quickSort(arr, pIdx+1, ei); //right part sorted
        

    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; //to make places for elements smaller than pivot

        for(int j = si; j < ei; j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i; // idx of pivot
    }
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        printArray(arr);
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}

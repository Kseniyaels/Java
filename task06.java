import java.util.Arrays;

public class task06{

    public static int[] initialArr = {12, 23, 5, 11, 6, 1};

    public static void main(String[] args) {
        
       
        int[] arr1 = Arrays.copyOf(initialArr, initialArr.length);        
        selectionSort(arr1);
        for (int item : arr1)
            System.out.print(item + " ");
        System.out.println();

        
        int[] arr2 = Arrays.copyOf(initialArr, initialArr.length);
        mergeSort(arr2, 0, arr2.length - 1);
        for (int item : arr2)
            System.out.print(item + " ");
        System.out.println();
    }


  
    public static int[] selectionSort(int[] arr) {
                
        int minIndex, temp;
        for (int i = 0; i < arr.length; i ++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j ++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        
        return arr;
    }



    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (int m = 0; m < temp.length; m++) {
            arr[left + m] = temp[m];
        }
    }
}
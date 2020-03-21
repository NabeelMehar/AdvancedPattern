package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={9,8,7,10,12,3,14,2,1};

        for (int j = 0; j < arr.length; j++) {
        for (int i = 0; i < arr.length-1-j; i++) {
            if ( arr[i] > arr[i + 1]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

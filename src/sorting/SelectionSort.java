package sorting;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr={9,8,7,10,12,3,14,2,1};
        int smallest=0;
        int preSmallest=0;
        int tempr=arr.length;


        while (smallest!=arr.length) {


            for (int i = preSmallest; i < arr.length; i++) {
                if (arr[smallest] > arr[i]) {
                    smallest = i;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[preSmallest];
            arr[preSmallest] = temp;

            preSmallest++;
            smallest = preSmallest;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

}

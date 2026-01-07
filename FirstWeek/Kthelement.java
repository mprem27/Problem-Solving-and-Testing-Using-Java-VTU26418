package FirstWeek;

public class Kthelement {

    public static int kthelement(int[] arr, int k) {

        if (k <= 0 || k > arr.length) {
            return -1;
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] count = new int[max + 1];

        for (int num : arr) {
            count[num]++;
        }

        int kcount = 0;
        for (int i = 0; i <= max; i++) {
            kcount += count[i];
            if (kcount >= k) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 2, 7, 1, 8};
        int k = 3;

        int result = kthelement(arr, k);
        System.out.println("The " + k + "rd smallest element is: " + result);
    }
}



public class SearchRange {

    public static int[] searchRange(int[] arr, int target) {
        int start = -1;
        int end = -1;

        for(int i=0; i < arr.length; i++) {
            if (arr[i] == target) {
                start = i;
                break;
            }
        }

        for (int i = arr.length - 1; i >=0; i--) {
            if (arr[i] == target) {
                end = i;
                break;
            }
        }
        int [] ans = {start, end};
        return ans;
    }

    public static void main(String[] args) {

        // Example 1
        int[] arr1 = {1, 2, 2, 2, 3, 4, 5};
        int[] result1 = searchRange(arr1, 2);
        System.out.println(result1[0] + " " + result1[1]);

        // Example 2
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] result2 = searchRange(arr2, 6);
        System.out.println(result2[0] + " " + result2[1]);

        // Example 3
        int[] arr3 = {2, 2, 2, 2, 2};
        int[] result3 = searchRange(arr3, 2);
        System.out.println(result3[0] + " " + result3[1]);
    }
}
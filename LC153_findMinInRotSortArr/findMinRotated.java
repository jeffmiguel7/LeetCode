/**
 * You are given an sorted array that has been rotated. It will seem sorted, but
 * at some point in the array, the increasing values will suddenly decrement to
 * the minimum value.
 * 
 * I utilized a modified version of binary search.
 * 
 * 1. Instantiate and assign left pointer to first index of array and the right
 * pointer to the last index
 * 
 * 2. Check for only 1 value in array
 * 
 * 3. Check if the the array is fully sorted
 * 
 * 4. While left pointer is less than right pointer, loop
 * 
 * 5. In the loop, find the middle value of that array or subarray
 * 
 * 5. Check values immediately to the left and right of the middle; if the value
 * after the middle is less than the middle value, then mid + 1 = min; if the
 * value before the middle is greater than the middle value, then mid = min
 * 
 * 6. Else move the pointers to get smaller subarrays
 */
public class findMinRotated {
    private static int[] array1 = { 5, 6, 7, 8, 1, 2, 3, 4 };
    private static int[] array2 = { 2, 3, 4, 5, 6, 7, 1 };
    private static int[] array3 = { 7, 1, 2, 3, 4, 5, 6 };
    private static int[] array4 = { 5, 6, 7, 1, 2, 3, 4 };

    public static int minElement(int[] nums) {

        int left = 0, right = nums.length - 1;

        if (nums.length == 1) {
            return nums[0];
        }
        if (nums[right] > nums[left]) {
            return nums[right];
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1])
                return nums[mid + 1];
            if (nums[mid - 1] > nums[mid])
                return nums[mid];
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        System.out.println(minElement(array3));
        // minElement(array1);
    }
}
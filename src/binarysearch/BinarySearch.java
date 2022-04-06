package binarysearch;

public class BinarySearch {

    // nums = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]
    // target = 15
    public int search(int[] nums, int target) {
        int left = 0, mid = 0;
        int right = nums.length - 1;

        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }
        return -1;
    }
}
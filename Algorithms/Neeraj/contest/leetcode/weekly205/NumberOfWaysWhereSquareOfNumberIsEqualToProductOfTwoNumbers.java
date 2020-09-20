package weekly205;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created on:  Sep 05, 2020
 * Questions: https://leetcode.com/problems/number-of-ways-where-square-of-number-is-equal-to-product-of-two-numbers
 */
public class NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println(numTriplets(new int[]{1, 1}, new int[]{1, 1, 1}) + " = 9");
        System.out.println(numTriplets(new int[]{4, 1, 4, 1, 12}, new int[]{3, 2, 5, 4}) + " = 5");
        System.out.println(numTriplets_2(new int[]{1, 1}, new int[]{1, 1, 1}) + " = 9");
        System.out.println(numTriplets_2(new int[]{4, 1, 4, 1, 12}, new int[]{3, 2, 5, 4}) + " = 5");
        System.out.println(numTriplets_2(
                new int[]{100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000},
                new int[]{100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000})
                + " = 14127750");
    }

    public static int numTriplets_2(int[] nums1, int[] nums2) {
        int result = 0;
        Map<Integer, Integer> map1 = new HashMap<>(), map2 = new HashMap<>();
        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
        for (int num : nums1) {
            result += getTriplets(nums2, map2, (long) num * (long) num);
        }
        for (int num : nums2) {
            result += getTriplets(nums1, map1, (long) num * (long) num);
        }
        return result;
    }

    private static int getTriplets(int[] nums, Map<Integer, Integer> map, long target) {
        int res = 0;
        for (int cur : nums) {
            int rem = (int) (target / cur);
            if (target % cur == 0 && map.containsKey(rem)) {
                res += map.get(rem);
                if (cur == rem) res--;
            }
        }
        return res / 2;
    }

    public static int numTriplets(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int result = 0;
        for (int num : nums1) {
            result += hasTriplet(nums2, num * num, 0, nums2.length - 1);
        }
        for (int num : nums2) {
            result += hasTriplet(nums1, num * num, 0, nums1.length - 1);
        }
        return result;
    }

    private static int hasTriplet(int[] nums, long target, int start, int end) {
        if (start >= end) return 0;
        int count = 0;
        while (start < end) {
            long prod = nums[start] * nums[end];
            if (prod == target) {
                count += 1 + hasTriplet(nums, target, start, end - 1) + hasTriplet(nums, target, start + 1, end);
                start++;
                end--;
            } else if (prod < target) start++;
            else end--;
        }
        return count;
    }
}
package sequence;

import java.util.HashSet;
import java.util.Set;

/*

Author: Bhargav Jakkaraju
Partner 1: Min
Partner 2: Sharif

*/

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int n : nums) {
            seen.add(n);
        }

        int longest = 0;

        for (int n : seen) {
            if (!seen.contains(n - 1)) {
                int length = 0;
                while (seen.contains(n + length)) {
                    length += 1;
                }
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
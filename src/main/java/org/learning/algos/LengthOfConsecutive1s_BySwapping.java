package org.learning.algos;

import org.springframework.stereotype.Component;

/**
 * Given a binary string A. It is allowed to do at most one swap between any 0 and 1.
 * Find and return the length of the longest consecutive 1’s that can be achieved.
 *
 * 1 <= length of string <= 1000000
 * A contains only characters 0 and 1.
 */
@Component
public class LengthOfConsecutive1s_BySwapping {

    /**
     * The idea is :
     * 1. Convert String to array
     * 2. Find the total number of ones in the array.
     * 3. For each 0 in the array, count number of 1s on left and right.
     * 4. Add the counts and add 1 to the answer.
     * 5. Choose the max answer.
     * 6. If ans > total number of ones, then ans = ans - 1, else ans is the final ans.
     */
    public void execute(String A) {

    }
}

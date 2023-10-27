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
     *
     * TC will be O(N) -> every 1 will be referred max 2 times
     *      (one time when it is left to a 0 and next time if it is right to a 0)
     */
    public void execute(String A) {
        // convert to array
        char[] binaryArr = A.toCharArray();
        int length = A.length();
        int totalOnes = 0;
        int ans = 0;

        for (int i = 0; i < length; i++) {
            if (binaryArr[i] == '1') {
                totalOnes++;
            }
        }

        if (totalOnes != length) {
            // iterating over the array
            for (int i = 0; i < length; i++) {
                // encountered 0
                if (binaryArr[i] == '0') {
                    int count = 1;
                    // counting 1s to the left
                    for (int j = i - 1; j >= 0; j--) {
                        if (binaryArr[j] == '1') {
                            count++;
                        } else {
                            break;
                        }
                    }
                    // counting 1s to the right
                    for (int j = i + 1; j < length; j++) {
                        if (binaryArr[j] == '1') {
                            count++;
                        } else {
                            break;
                        }
                    }
                    ans = Math.max(ans, count);
                }
            }

            if (ans > totalOnes) {
                ans--;
            }
        }

        System.out.println("the total count of 1s will be : " + ans);
    }
}

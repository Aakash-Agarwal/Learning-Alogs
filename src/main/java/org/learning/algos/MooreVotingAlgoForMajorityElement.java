package org.learning.algos;

import org.springframework.stereotype.Component;

/**
 * Given an array of size N, find the majority element.
 * The majority element is the element that appears more than floor(n/2) times.
 * You may assume that the array is non-empty and the majority element always exists in the array.
 * Problem Constraints
 * 1 <= N <= 5*10^5
 * 1 <= num[i] <= 10^9
 */
@Component
public class MooreVotingAlgoForMajorityElement {
    /**
     * The idea is:
     * 1. Iterate over the array.
     * 2. Find candidate - Increase the votes if same element is found else decrease the votes.
     *                     If votes = 0, choose current element as candidate
     * 3. Find the frequency of candidate element. If frequency > N/2, then candidate is the answer else, no majority.
     */
    public void execute(final int[] input) {
        int candidate = Integer.MAX_VALUE;
        int freq = 0;
        int votes = 0;
        int len = input.length;

        // find candidate
        for (int i = 0; i < len; i++) {
            if (votes == 0) {
                candidate = input[i];
                votes = 1;
            } else {
                if (candidate == input[i]) {
                    votes++;
                } else {
                    votes--;
                }
            }
        }

        // find frequency
        for(int i = 0; i < len; i++) {
            if (candidate == input[i]) {
                freq++;
            }
        }

        if (freq > len/2) {
            System.out.println(candidate + " is the majority element");
        } else {
            System.out.println("No majority element found");
        }
    }
}

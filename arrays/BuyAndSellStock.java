package com.ds.bt.arrays;

/**
 * Skeleton for the "Best Time to Buy and Sell Stock" problem (LeetCode #121).
 *
 * <p><b>Problem statement:</b> Given an array {@code prices} where
 * {@code prices[i]} is the price of a stock on day {@code i}, find the maximum
 * profit you can achieve by choosing a single day to buy and a later day to
 * sell. Return {@code 0} if no profit is possible.
 *
 * <p>Example: {@code arr = [7, 1, 5, 3, 6, 4]}
 * <ul>
 *   <li>Buy on day 2 (price = 1), sell on day 5 (price = 6) → profit = 5.</li>
 * </ul>
 *
 * <p><b>Intended algorithm (greedy / single pass):</b>
 * <ol>
 *   <li>Track the minimum price seen so far ({@code min}).</li>
 *   <li>At each step, compute {@code price - min} and update the max profit.</li>
 *   <li>Update {@code min} whenever a lower price is found.</li>
 * </ol>
 *
 * <p>Time complexity: O(n). Space complexity: O(1).
 *
 * <p><b>Note:</b> This class is currently a work-in-progress; only the minimum
 * price variable has been initialised. The profit calculation loop is not yet
 * implemented.
 */
public class BuyAndSellStock {

    /**
     * Entry point. Sets up the price array and initialises the running minimum.
     *
     * @param args command-line arguments (not used)
     */
    static void main(String[] args) {

        int[] arr = new int[]{7,1,5,3,6,4};

        int min = arr[0];
    }
}

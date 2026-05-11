package com.ds.bt.arrays;

/**
 * Placeholder for the "Remove Duplicates from Sorted Array" problem (LeetCode #26).
 *
 * <p><b>Problem statement:</b> Given a sorted integer array {@code nums} in
 * non-decreasing order, remove the duplicates <em>in-place</em> so that each
 * unique element appears only once. Return the number of unique elements {@code k}.
 * The first {@code k} elements of {@code nums} should hold the result; the
 * remaining elements do not matter.
 *
 * <p>Example:
 * <ul>
 *   <li>Input:  {@code [1, 1, 2, 3, 3, 4]}</li>
 *   <li>Output: {@code k = 4}, array becomes {@code [1, 2, 3, 4, ...]}</li>
 * </ul>
 *
 * <p><b>Intended algorithm (two-pointer):</b>
 * <ol>
 *   <li>Keep a slow pointer {@code k = 1} pointing to the last unique position.</li>
 *   <li>Walk a fast pointer {@code i} from index 1 to the end.</li>
 *   <li>Whenever {@code nums[i] != nums[k-1]}, copy {@code nums[i]} to
 *       {@code nums[k]} and increment {@code k}.</li>
 *   <li>Return {@code k}.</li>
 * </ol>
 *
 * <p>Time complexity: O(n). Space complexity: O(1).
 *
 * <p><b>Status: not yet implemented.</b>
 */
public class RemoveDuplicatesfromSortedArray {
}

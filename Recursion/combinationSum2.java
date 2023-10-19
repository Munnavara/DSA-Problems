package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class combinationSum2 {
    private List<List<Integer>> resultList;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        getTargetCombination(candidates, 0, target, new ArrayList<>());
        return resultList;
    }

    public void getTargetCombination(int[] arr, int position, int currentTarget, List<Integer> result) {

        /**
         * Base case
         * 1. If currentTarget is reaching to Zero
         * 2. Current Position is equal to the length of the Array
         */
        if (currentTarget == 0) {
            // Collections.sort(result);
            if (!resultList.contains(result)) {
                resultList.add(new ArrayList<>(result));
            }
            return;
        }
        if (position == arr.length) {
            return;
        }

        /**
         * There are two cases
         * 1. Pick the current value if the current value (i.e arr[position]) is less
         * than or equal to the currentTarget
         * value then use the same attribute by passing the same position
         *
         * 2. Not picking up the current element by not reducing the currentTarget value
         * and increasing the position
         */
        if (arr[position] <= currentTarget) {
            result.add(arr[position]);
            getTargetCombination(arr, position + 1, currentTarget - arr[position], result);
            // removing the last element because post adding of the value the call came back
            result.remove(result.size() - 1);
            // this brings all combinations
            while (position + 1 < arr.length && arr[position] == arr[position + 1])
                position += 1;

        }
        // not picked
        getTargetCombination(arr, position + 1, currentTarget, result);
    }

}

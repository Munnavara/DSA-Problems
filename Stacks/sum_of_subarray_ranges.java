public class sum_of_subarray_ranges{

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        long ans = subArrayRanges(nums);
        System.out.println(ans);
    }
    public static long subArrayRanges(int[] nums) {
        int n = nums.length;
        long sum=0;
        int max, min;
        for(int si=0;si<n;si++){
            max = nums[si];
            min = nums[si];
            for(int ei=si+1;ei<n;ei++){
                max = Math.max(max, nums[ei]);
                min = Math.min(min, nums[ei]);
                sum+=(max-min);
            }
        }
        return sum;
    }
}
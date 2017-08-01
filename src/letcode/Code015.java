package letcode;

import java.util.*;

/**
 * Created by ZK on 2017/7/27.
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 */
public class Code015 {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i=nums.length-1;i>=2;i--){
            if (i<nums .length-1&&nums[i]==nums[i+1]){
                continue;
            }
            int j=0,k=i-1;
            while (j<k){
                if (nums[j]+nums[k]==-nums[i]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
                    j++;
                    k--;
                    while (j>0&&j<k&&nums[j]==nums[j-1]){
                        j++;
                    }
                    while (j<k&&nums[k]==nums[k+1]){
                        k--;
                    }
                }else if (nums[j]+nums[k]<-nums[i]){
                    j++;
                }else if (nums[j]+nums[k]>-nums[i]){
                    k--;
                }
            }
        }
        return result;
    }

}

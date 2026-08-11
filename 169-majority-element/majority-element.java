class Solution {
    public int majorityElement(int[] nums) {
        // Aaryan verma
        int elemant = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(count == 0){
                elemant = nums[i];
            }
            if(nums[i]==elemant){
                count++;
            }else 
                count--;
        }
        return elemant;
    }
}
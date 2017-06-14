public class Solution {
    public String optimalDivision(int[] nums) {
        String result=String.valueOf(nums[0]);
        switch(nums.length){
            case 1:
               return result;
            case 2:
                result+="/"+nums[1];
                break;  
            default:
                 result+="/("+nums[1];
            for(int i=2;i<nums.length;i++){
                result+="/"+nums[i];
            }
            result+=")";
                break;
        }
        
        return result;
    }
}

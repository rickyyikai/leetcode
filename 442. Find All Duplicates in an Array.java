public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1]>0){
                nums[Math.abs(nums[i])-1]=-nums[Math.abs(nums[i])-1];
            }
            else{
                list.add(Math.abs(nums[i]));
            }
        }
        
       /*雖然accepted，但遇到特殊test可能會出錯，且用到1個額外空間
       for(int i=0;i<4;i++){
            for(int i=0;i<nums.length;i++){
                int temp=0;
                if(nums[i]>0){
                    if(nums[nums[i]-1]>0){
                        temp=nums[i];
                        nums[i]=nums[nums[i]-1];
                        nums[temp-1]=0;
                    } 
                    else if(nums[nums[i]-1]==0){
                     nums[nums[i]-1]=-1;
                    }
                }
            
            }
        }
          
        for(int i=0;i<nums.length;i++){
            if(nums[i]==-1)
            list.add(i+1);
        }
        */

        
     
        return list;
    }
}

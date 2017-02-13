public class Solution {
    public void sortColors(int[] nums) {
        int head=0;
        int end=nums.length-1;
        int temp;
        
      for(int i=0;i<=end;i++){
              
            if(nums[i]==0){
                temp=nums[i];
                nums[i]=nums[head];
                nums[head]=temp;
                head++;
            }
            else if(nums[i]==2){
                temp=nums[i];
                nums[i]=nums[end];
                nums[end]=temp;
                end--;
                i--;
            }
            
      }
         
         
        /*
        int redNums=0;
        int whiteNums=0;
        int blueNums=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                redNums++;
            }
            else if(nums[i]==1){
                whiteNums++;
            }
            else{
                blueNums++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i<redNums){
                nums[i]=0;
            }
            else if(i<redNums+whiteNums){
               nums[i]=1; 
            }
            else{
               nums[i]=2;  
            }
        }*/
    }
}

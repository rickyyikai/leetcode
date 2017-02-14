public class Solution {
    public int nthUglyNumber(int n) {
        int []nums=new int[n];
        nums[0]=1;
        int count2=0,count3=0,count5=0;
        int multiple2=2,multiple3=3,multiple5=5;
        
        for(int i=1;i<n;i++){
                int min=Integer.MAX_VALUE;
                min=multiple2<min?multiple2:min;
                min=multiple3<min?multiple3:min;
                min=multiple5<min?multiple5:min;
                nums[i]=min;
                if(multiple2==min){
                    count2++;
                    multiple2=2*nums[count2];
                }
                if(multiple3==min){
                     count3++;
                    multiple3=3*nums[count3];
                }
                if(multiple5==min){
                    count5++;
                    multiple5=5*nums[count5];
                }
        }
        return nums[nums.length-1];
        
        /*較慢
        long[] nums=new long[n];
        nums[0]=1;
        int count=1;
        long n2=2;
                long n3=3;
                long n5=5;
        while(count<n){
        
            long min=Integer.MAX_VALUE;
            for(int i=0;i<count;i++){
                
                n2=2*nums[i]>nums[count-1]?2*nums[i]:Integer.MAX_VALUE;
                n3=3*nums[i]>nums[count-1]?3*nums[i]:Integer.MAX_VALUE;
                n5=5*nums[i]>nums[count-1]?5*nums[i]:Integer.MAX_VALUE;
                min=n2<min?n2:min;
                min=n3<min?n3:min;
                min=n5<min?n5:min;
                
            }
            
                nums[count]=min;
            
            count++;
            
        }
        
         return  (int)nums[n-1];*/
    }
}

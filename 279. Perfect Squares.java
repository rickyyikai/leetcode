public class Solution {
    public int numSquares(int n) {
        int oNum=(int)Math.sqrt((double)n);
        int[] minCount = new int[n+1];
        
        minCount[1]=1;
        for(int i=2;i<minCount.length;i++){
            minCount[i]=Integer.MAX_VALUE;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=oNum;j++){
                 if(j*j<=i && minCount[i-j*j]!=Integer.MAX_VALUE){
                   minCount[i] = Math.min(minCount[i], minCount[i-j*j]+1);
                }
               
            }
        }
        
        return minCount[n];
    }

}

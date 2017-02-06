public class Solution {
    public boolean canWinNim(int n) {
        int x=n>>>2;
        x=x<<2;
        if(x==n)
            return false;
        else
            return true;
            
        //  Accepted
        //用modㄧ次還ok  0ms
        // if(n%4==0){
        //     return false;
        // }
        // else 
        // return true;
        
        
        
        //  Time Limit Exceeded
        // boolean [] mustWinNums=new boolean[3];
        // // boolean isYourTurn=true;
        // if(n==1||n==2||n==3){
        //     return true;
        // }
        // mustWinNums[0]=true;
        // mustWinNums[1]=true;
        // mustWinNums[2]=true;
        // while(n>3){
        //     if(mustWinNums[0]&&mustWinNums[1]&&mustWinNums[2]){
        //         mustWinNums[0]=mustWinNums[1];
        //         mustWinNums[1]=mustWinNums[2];
        //         mustWinNums[2]=false;
                
        //     }
        //     else{
        //         mustWinNums[0]=mustWinNums[1];
        //         mustWinNums[1]=mustWinNums[2];
        //         mustWinNums[2]=true;
                
        //     }
            
        //     n--;
        // }
        // return mustWinNums[2];
       
        
        //  Memory Limit Exceeded
        // boolean [] mustWinNums=new boolean[n+1];
        // // boolean isYourTurn=true;
        // if(n==1||n==2||n==3){
        //     return true;
        // }
        // mustWinNums[1]=true;
        // mustWinNums[2]=true;
        // mustWinNums[3]=true;
        // for(int i=4;i<=n;i++){
        //     if(mustWinNums[i-1]&&mustWinNums[i-2]&&mustWinNums[i-3]){
        //         mustWinNums[i]=false;
        //     }
        //     else{
        //         mustWinNums[i]=true;
        //     }
            
        // }
        // return mustWinNums[n];
    }
}

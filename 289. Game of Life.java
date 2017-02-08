public class Solution {
    public void gameOfLife(int[][] board) {
        
        
        
        for(int i=0;i<board.length;i++){
             for(int j=0;j<board[i].length;j++){
                
                 int count=0;
                 //計算周圍鄰居有幾個live--------------------------------------
                 if(i!=0){//九宮格第一列
                     if(j!=0&&Math.abs(board[i-1][j-1])==1){
                         count++;
                     }
                     if(Math.abs(board[i-1][j])==1){
                         count++;
                     }
                     if(j!=board[i].length-1&&Math.abs(board[i-1][j+1])==1){
                         count++;
                     }
                 }
                 //九宮格第二列
                 if(j!=0&&Math.abs(board[i][j-1])==1){
                         count++;
                     }
                 if(j!=board[i].length-1&&Math.abs(board[i][j+1])==1){
                         count++;
                     }
                  //九宮格第三列  
                if(i!=board.length-1){
                     if(j!=0&&Math.abs(board[i+1][j-1])==1){
                         count++;
                     }
                     if(Math.abs(board[i+1][j])==1){
                         count++;
                     }
                     if(j!=board[i].length-1&&Math.abs(board[i+1][j+1])==1){
                         count++;
                     }
                 }
                //----------------------------------------------------------------
                //inplace紀錄life改變(-1為live->dead, 2為dead->live)
                 if(board[i][j]==1&&(count<2||count>3)){//live->dead
                     board[i][j]=-1;
                 }
                 else if(board[i][j]==0&&count==3){//dead->live
                     board[i][j]=2;
                 }
             }
        }
        
         for(int i=0;i<board.length;i++){//運用先前紀錄,產生下一代結果
             for(int j=0;j<board[i].length;j++){
                 if(board[i][j]==2){
                    board[i][j]=1; 
                 }
                 else if(board[i][j]==-1){
                    board[i][j]=0;  
                 }
             }
             
         }
        
    }
}

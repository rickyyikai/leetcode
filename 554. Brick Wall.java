public class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> map = new HashMap<>();
        for(List<Integer> wallRow:wall){
            for(int i=0;i<wallRow.size()-1;i++){
                if (i!=0)
                wallRow.set(i,wallRow.get(i-1)+wallRow.get(i));
                
                Integer wallRowItem = wallRow.get(i);
                if(map.containsKey(wallRowItem)){
                    map.put(wallRowItem,map.get(wallRowItem)+1);
                }else{
                    map.put(wallRowItem,1);
                }
            }
        }
        
        int max=0;
        for(int n:map.values()){
            max= (max>n)?max:n;
        }
        
        return wall.size()-max;
        
    }
}

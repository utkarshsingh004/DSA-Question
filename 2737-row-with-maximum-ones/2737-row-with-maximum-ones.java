class Solution {
    
    public int[] rowAndMaximumOnes(int[][] mat) {
        
        int[] result = new int[2];
      
        for (int rowIndex = 0; rowIndex < mat.length; rowIndex++) {
            
            int onesCount = 0;
            for (int element : mat[rowIndex]) {
                onesCount += element;  
            }
          
            
            if (result[1] < onesCount) {
                result[0] = rowIndex;     
                result[1] = onesCount;    
            }
        }
      
        return result;
    }
}
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int h=matrix[0].length-1,l=0;
        
        while(l<matrix.length && h >= 0)
        {
            if(matrix[l][h] == target){
                return true;
            }
            else if(matrix[l][h] < target) {
                l++;
            }
            else{
                h--;
            }
        }
        return false;
    }
}
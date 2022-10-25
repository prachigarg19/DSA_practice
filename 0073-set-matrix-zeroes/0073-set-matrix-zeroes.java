class Solution {
    public void setZeroes(int[][] matrix) {
            //setting initial value of any row and column as a flag
        
        int firstRow=0, firstCol=0;
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i]==0){
                firstRow++;
                break;
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0){
                firstCol++;
                break;
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                //if it's row or col is 0
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        //we have to seperate row and col as is we directly set them to 0 our calculations for other index also suffers
        //if we deal with them after calculating for other index then 0 at one index can also suffer other indexes.
        if(firstRow>0){
            for(int i=0;i<matrix[0].length;i++)
                matrix[0][i]=0;
        }
        if(firstCol>0){
            for(int i=0;i<matrix.length;i++)
                matrix[i][0]=0;
        }
    }
} 
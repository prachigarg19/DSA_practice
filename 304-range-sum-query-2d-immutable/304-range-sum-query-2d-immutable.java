class NumMatrix {
    int[][] nmatrix;

    public NumMatrix(int[][] matrix) {
        nmatrix= new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                
                if(j==0) {
                    nmatrix[i][j]=matrix[i][j];
                    continue;
                }
                
                nmatrix[i][j] = matrix[i][j] + nmatrix[i][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int tsum=0;
        
        for(int j=row1;j<=row2;j++){
           if(col1==0){
               tsum+=nmatrix[j][col2];
           }
        else{
            tsum+=nmatrix[j][col2]-nmatrix[j][col1-1];
        }
        }
            
        return tsum;
    }
}
/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */

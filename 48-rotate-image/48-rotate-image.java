class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n/2;i++)
        {
            for(int j=i;j<n-1-i;j++)
            {
                 swap(matrix,i,j,j,n-1-i);
                 swap(matrix,i,j,n-1-j,i);
                 swap(matrix,n-1-j,i,n-1-i,n-1-j);
            }
        }
    }
    public void swap(int[][] matrix,int r1,int c1,int r2,int c2)
    {
        int temp=matrix[r1][c1];
        matrix[r1][c1]=matrix[r2][c2];
        matrix[r2][c2]=temp;
    }
} 
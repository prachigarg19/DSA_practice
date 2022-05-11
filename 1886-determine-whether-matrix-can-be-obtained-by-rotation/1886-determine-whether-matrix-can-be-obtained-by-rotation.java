class Solution {
    public boolean findRotation(int[][] matrix, int[][] target) {
         int n=matrix.length;
        boolean flag=true;
        int count=0;
    while(count<=3)
    {      int val=0;
            for(int i=0;i<n/2;i++)
        {
            for(int j=i;j<n-1-i;j++)
            {
                 swap(matrix,i,j,j,n-1-i);
                 swap(matrix,i,j,n-1-j,i);
                 swap(matrix,n-1-j,i,n-1-i,n-1-j);
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==target[i][j])
                {
                    val++;
                    // break;
                }
            }
            
        }
        // System.out.println(val);
         if(val==(long)n*n) return true;
         count++;
    }
        return false;
    }
     public void swap(int[][] matrix,int r1,int c1,int r2,int c2)
    {
        int temp=matrix[r1][c1];
        matrix[r1][c1]=matrix[r2][c2];
        matrix[r2][c2]=temp;
    }
}
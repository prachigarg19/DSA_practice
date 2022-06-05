class Solution {
    public int totalNQueens(int n) {
        int m[][]=new int[n][n];
        int ans=0;
        
        return place(m,0,n,ans);
    }
    public int place(int[][] m,int row,int n,int ans){
        if(row==n)
        {ans++; 
         return ans;
        }
        for(int j=0;j<n;j++){
           
            if(isValid(m,row,j,n))
            {m[row][j]=1;
            ans=place(m,row+1,n,ans);
             
            m[row][j]=0;}
        }
        return ans;
    }
    public boolean isValid(int[][] m,int row,int column,int n){
       
        //column up
        int temprow=row;
        while(temprow>=0){
            if(m[temprow][column]==1)
                return false;
            temprow--;
        }
        //left side diagonal
        temprow=row;
        int tempcolumn=column;
        while(temprow>=0&&tempcolumn>=0){
           
            if(m[temprow][tempcolumn]==1)
                return false;
            temprow--;tempcolumn--;
          
        }
        //right side diagonal
        temprow=row; tempcolumn=column;
        while(temprow>=0&&tempcolumn<n){
            if(m[temprow][tempcolumn]==1)
                return false;
            temprow--;tempcolumn++;
        }
        return true;
    }
}
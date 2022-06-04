class Solution {
    public List<List<String>> solveNQueens(int n) {
        int m[][]=new int[n][n];
        List<List<String>> ans=new ArrayList<>();
        place(m,0,n,ans);
        return ans;
    }
    public void place(int[][] m,int row,int n,List<List<String>> ans){
        if(row==n)
        {List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                String str="";
                for(int j=0;j<n;j++){
                    if(m[i][j]==1)
                        str+='Q';
                    else str+=".";
                }
               temp.add(str);    
                
            }
            ans.add(temp);  
        
         return;
        }
        for(int j=0;j<n;j++){
            // System.out.println(row+"+"+j+" "+isValid(m,row,j,n));
            // System.out.println("next");
            if(isValid(m,row,j,n))
            {m[row][j]=1;
            place(m,row+1,n,ans);
            m[row][j]=0;}
        }
        
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
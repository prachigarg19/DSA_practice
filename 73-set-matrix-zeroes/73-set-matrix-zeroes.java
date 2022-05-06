class Solution {
    public void setZeroes(int[][] matrix) {
        List<Pair<Integer,Integer>> al=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                    al.add(new Pair(i,j));
            }
        }
        for(int i=0;i<al.size();i++)
        {
            int r=al.get(i).getKey();
            int c=al.get(i).getValue();
            for(int k=0;k<matrix[r].length;k++)
                matrix[r][k]=0;
            for(int k=0;k<matrix.length;k++)
                matrix[k][c]=0;
        }
        
    }
}
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int j = n-1;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=mat[i][i];
            if(i!=j){
                sum+=mat[i][j];
            }
            j--;
        }
        return sum;
    }
}

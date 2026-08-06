class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j+1==n){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}
class Solution1 {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
            sum+=mat[i][n-i-1];
        }
        if(n%2!=0)return sum-mat[n-2][n-2];
        else return sum;
    }
}
class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int row = 0;row<matrix.length;row++){
        int start = 0;
        int end = matrix[0].length-1;
    
        while(start<end){
            int temp = matrix[row][start];
            matrix[row][start] = matrix[row][end];
            matrix[row][end] = temp;
            start++;
            end--;
        }
        }
        
    }
}
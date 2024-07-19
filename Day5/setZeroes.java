class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] row = new int[rows];
        int[] column = new int[columns];

        for(int i=0; i < rows; i++) {
            for(int j=0; j < columns; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = -1;
                    column[j] = -1;
                }
            }
        }
        for(int i=0; i < rows; i++) {
            for(int j=0; j< columns; j++) {
                if(row[i] == -1 || column[j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

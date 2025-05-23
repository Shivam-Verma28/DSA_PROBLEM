class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean rows = new boolean[m];
        boolean cols = new boolean[n];

        // Step 1: Mark rows and columns to be zeroed
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Step 2: Set rows to zero
        for(int i = 0; i < m; i++) {
            if(rows[i]) {
                for(int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Set columns to zero
        for(int j = 0; j < n; j++) {
            if(cols[j]) {
                for(int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

class Solution {
    public boolean hasValidPath(int[][] grid) {
        /*
        1 which means a street connecting the left cell and the right cell.
        2 which means a street connecting the upper cell and the lower cell.
        3 which means a street connecting the left cell and the lower cell.
        4 which means a street connecting the right cell and the lower cell.
        5 which means a street connecting the left cell and the upper cell.
        6 which means a street connecting the right cell and the upper cell.F
         */
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        return check(0,0,grid, dp);
    }
    static boolean check(int i, int j, int[][] grid, int[][] dp){
        int m = grid.length;
        int n = grid[0].length;
        if(i == m - 1&& j == n - 1)
            return true;
        int l = j == 0? -1 : grid[i][j - 1];
        int r = j == n - 1? -1 : grid[i][j + 1];

        int u = i == 0? -1 : grid[i - 1][j];
        int d = i == m - 1? -1 : grid[i + 1][j];

        dp[i][j] = 1;

        if(grid[i][j] == 1){
            // l - 4,6 r-3,5
            boolean res1 = false;
            boolean res2 = false;
            if((l == 4 || l == 6 || l == 1) && dp[i][j - 1] != 1){
                res1 = check(i, j - 1, grid, dp.clone());
            }
            if((r == 3 || r == 5 || r == 1) && dp[i][j + 1] != 1){
                res2 = check(i, j + 1, grid, dp.clone());
            }
            return res1 || res2;
        }
        else if(grid[i][j] == 2){
            boolean res1 = false;
            boolean res2 = false;
            if((u == 3 || u == 4 || u == 2) && dp[i - 1][j] != 1){
                res1 = check(i - 1, j, grid, dp.clone());
            }
            if((d == 5 || d == 6 || d == 2) && dp[i + 1][j] != 1){
                res2 = check(i + 1, j, grid, dp.clone());
            }
            return res1 || res2;
        }
        else if(grid[i][j] == 3){
            boolean res1 = false;
            boolean res2 = false;
            if((l == 1 || l == 4 || l == 6) && dp[i][j - 1] != 1){
                res1 = check(i, j - 1, grid, dp.clone());
            }
            if((d == 2 || d == 6 || d == 5) && dp[i + 1][j] != 1){
                res2 = check(i + 1, j, grid, dp.clone());
            }
            return res1 || res2;
        }
        else if(grid[i][j] == 4){
            boolean res1 = false;
            boolean res2 = false;
            if((r == 3 || r == 1 || r == 5) && dp[i][j + 1] != 1){
                res1 = check(i, j + 1, grid, dp.clone());
            }
            if((d == 5 || d == 6 || d == 2) && dp[i + 1][j] != 1){
                res2 = check(i + 1, j, grid, dp.clone());
            }
            return res1 || res2;
        }
        else if(grid[i][j] == 5){
            boolean res1 = false;
            boolean res2 = false;
            if((u == 3 || u == 4 || u == 2) && dp[i - 1][j] != 1){
                res1 = check(i - 1, j, grid, dp.clone());
            }
            if((l == 1 || l == 4 || l == 6) && dp[i][j - 1] != 1){
                res2 = check(i, j - 1, grid, dp.clone());
            }
            return res1 || res2;
        }
        else if(grid[i][j] == 6){
            boolean res1 = false;
            boolean res2 = false;
            if((u == 3 || u == 4 || u == 2) && dp[i - 1][j] != 1){
                res1 = check(i - 1, j, grid, dp.clone());
            }
            if((r == 5 || r == 1 || r == 3) && dp[i][j + 1] != 1){
                res2 = check(i, j + 1, grid, dp.clone());
            }
            return res1 || res2;
        }
        return false;
    }
}
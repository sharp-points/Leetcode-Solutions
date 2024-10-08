class Solution {
    public int numMagicSquaresInside(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        int j = 0;
        int i = 0;

        if (rows < 3 || cols < 3) {
            return count;
        }

        while (i <= rows - 3 && j <= cols - 3) {
            int sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2];
            boolean unique = false;
            HashSet<Integer> nums = new HashSet<>();
            nums.add(grid[i][j]);
            nums.add(grid[i][j + 1]);
            nums.add(grid[i][j + 2]);
            nums.add(grid[i + 1][j]);
            nums.add(grid[i + 1][j + 1]);
            nums.add(grid[i + 1][j + 2]);
            nums.add(grid[i + 2][j]);
            nums.add(grid[i + 2][j + 1]);
            nums.add(grid[i + 2][j + 2]);

            if (
                grid[i + 1][j] + grid[i + 1][j + 1] + grid[i + 1][j + 2] == sum &&
                grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2] == sum &&
                grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2] == sum &&
                grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j] == sum &&
                grid[i][j] + grid[i + 1][j] + grid[i + 2][j] == sum &&
                grid[i][j + 1] + grid[i + 1][j + 1] + grid[i + 2][j + 1] == sum &&
                grid[i][j + 2] + grid[i + 1][j + 2] + grid[i + 2][j + 2] == sum
            ) {
                if (
                    nums.contains(1) &&
                    nums.contains(2) &&
                    nums.contains(3) &&
                    nums.contains(4) &&
                    nums.contains(5) &&
                    nums.contains(6) &&
                    nums.contains(7) &&
                    nums.contains(8) &&
                    nums.contains(9)
                ) {
                    count++;
                }
               
            }

            if (j < cols - 3) {
                j++;
            } else if (j == cols - 3 && i < rows - 3) {
                j = 0;
                i++;
            } else if (j == cols - 3 && i == rows - 3) {
                break;
            }

        }

        return count;
     
    }
}
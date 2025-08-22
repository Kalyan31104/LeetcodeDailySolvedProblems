/*3195. Find the Minimum Area to Cover All Ones I
You are given a 2D binary array grid. Find a rectangle with horizontal and vertical sides with the smallest area, such that all the 1's in grid lie inside this rectangle.
Return the minimum possible area of the rectangle.

Example 1:
Input: grid = [[0,1,0],[1,0,1]]
Output: 6
Explanation:
The smallest rectangle has a height of 2 and a width of 3, so it has an area of 2 * 3 = 6.

Example 2:
Input: grid = [[1,0],[0,0]]
Output: 1
Explanation:
The smallest rectangle has both height and width 1, so its area is 1 * 1 = 1.

Constraints:
1 <= grid.length, grid[i].length <= 1000
grid[i][j] is either 0 or 1.
The input is generated such that there is at least one 1 in grid.*/

//solution

class Solution {
    public int minimumArea(int[][] grid) {
        ArrayList<Integer>rows=new ArrayList<>();
        ArrayList<Integer>columns=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<columns.size();i++){
            if(columns.get(i)>max){
                max=columns.get(i);
            }
            if(columns.get(i)<min){
                min=columns.get(i);
            }
        }
        int c=(max-min)+1;
        int r=(rows.get(rows.size()-1)-rows.get(0))+1;
        return c*r;
    }
}

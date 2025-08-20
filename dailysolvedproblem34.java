/*1277. Count Square Submatrices with All Ones
Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.

Example 1:
Input: matrix =
[
  [0,1,1,1],
  [1,1,1,1],
  [0,1,1,1]
]
Output: 15
Explanation: 
There are 10 squares of side 1.
There are 4 squares of side 2.
There is  1 square of side 3.
Total number of squares = 10 + 4 + 1 = 15.

Example 2:
Input: matrix = 
[
  [1,0,1],
  [1,1,0],
  [1,1,0]
]
Output: 7
Explanation: 
There are 6 squares of side 1.  
There is 1 square of side 2. 
Total number of squares = 6 + 1 = 7.

Constraints:
1 <= arr.length <= 300
1 <= arr[0].length <= 300
0 <= arr[i][j] <= 1*/

//solution
class Solution {
    public int countSquares(int[][] matrix) {
        int count=0;
        int inc=2;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==1){
                    count++;
                }
            }
        }
        while(inc<=Math.min(matrix.length,matrix[0].length)){
            int step=inc;
            for(int i=0;i<= matrix.length - step;i++){
                int start=0;
                int j=start+step;
                while(j<=matrix[i].length){
                    boolean flag=true;
                    for(int row=i;row<i+step;row++){
                        boolean b1=find_ones(row,start,j,matrix);
                        if(!b1){
                            flag=false;
                            break;
                        }
                    }
                    
                    if(flag){
                        count++;
                    }
                    else{
                    }
                    j++;
                    start++;
                }
            }
            inc++;
        }
        return count;
        
    }
    static boolean find_ones(int a,int start,int end,int [][] matrix){
        boolean flag=true;
        for(int i=start;i<end;i++){
            if(matrix[a][i]!=1){
                flag=false;
                break; 
            }
        }
        return flag;
    }
}

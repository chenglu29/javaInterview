
import java.util.*;
/*
Number of Islands
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
*/

class numberofisland{
	public static void main(String[] args){
		int[][] M = {{1, 1, 0, 0, 0},
                             {1, 1, 0, 0, 1},
                     	     {1, 0, 0, 1, 1},
                     	     {0, 0, 0, 0, 1},
                             {1, 0, 1, 0, 1}};
        int height=M.length;
        int width=M[0].length;
        int numberofislands=0;
        for (int j=0;j<height;j++){
        	for(int k=0;k<width;k++){
        		if(M[j][k]==1){
        			change(j,k,M);
        			numberofislands+=1;
        		}
        	}
        }
        System.out.println(numberofislands);
	}
	public static void changezero(int i,int j, int [][]M){
		if(i==M.length || j==M[0].length || i<0 || j<0 || M[i][j]!='1')
			return;
		M[i][j]=2;

		change(i+1,j,M);//check downward
		change(i, i+1,M); //check right
		change(i-1, j,M); //check upward
		change(i,j-1,M); //chec left

	}
}

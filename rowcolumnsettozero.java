
import java.util.*;

//Write an algorithm such that if an element in an MxN matrix is 0, 
//its entire row and column is set to 0

class rowcolumnsettozero{
	public static void main(String[] args){
		int matrix[][] = {{0,1,2,3,4,5},{1,1,2,3,4,5},{1,1,2,3,4,5}};
		int rowsize=matrix.length;
		int columnsize=matrix[0].length;
		System.out.println(rowsize);
		System.out.println(columnsize);
		int[] rowmarker=new int[rowsize];
		int[] columnmarker=new int[columnsize];

		for(int i=0;i<rowsize;i++)
        {
            for(int j=0;j<columnsize;j++)
            {
                if(matrix[i][j]==0)
                {
                    rowmarker[i]=1; // i used here to mark the row no.
                    columnmarker[j]=1; //j used here to mark the column no.
                }
            }
        }
        for(int i=0;i<rowsize;i++)
        {
            for(int j=0;j<columnsize;j++)
            {
                /*The below if looks for any row or column(not particular position) that has 1,if found that entire row/column is marked zero courtesy of the or operator */
                if(rowmarker[i]==1 || columnmarker[j]==1 )
                matrix[i][j]=0;
            }
        }    

		for(int i = 0; i<rowsize; i++)
		{
    		for(int j = 0; j<columnsize; j++)
    		{
        		System.out.print(matrix[i][j]);
    		}
    			System.out.println();
		}

	}
}


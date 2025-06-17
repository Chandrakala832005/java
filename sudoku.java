public class sudoku
{
	public static void main(String[] args) {
	    int[][] arr={
	            {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}

	    };
	    if(solve(arr))
	    {
	        print(arr);
	    }
	    else{
	  	System.out.println("not possible");
	}
}
static void print(int [][] arr)
{
    for(int i=0;i<arr.length;i++)
    {
        for( int j=0;j<arr[0].length;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
static boolean solve(int[][] arr)
{
     for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[0].length;j++)
        {
            if(arr[i][j]==0)
            {
                for(int k=1;k<10;k++)
                {
                    if(safe(arr,i,j,k))
                    {
                        arr[i][j]=k;
                        if(solve(arr))
                        {
                            return true;
                        }
                        arr[i][j]=0;
                    }
                }
                return false;
            }
        }
    }
    return true;
}
            static boolean safe(int [][] arr,int r,int c,int k)
            {            
                for(int i=0;i<arr.length;i++)
                {
                    if(arr[i][c]==k)return false;
                }
                for(int i=0;i<arr.length;i++)
                {
                  if(arr[r][i]==k)return false;  
                }
                int row=r-(r%3);
                int col=c-(c%3);
                for(int q=row;q<row+3;q++)
                {
                     for(int a=col;a<col+3;a++)
                {
                    if(arr[q][a]==k)return false;
                }
                }
                 return true;
            }
        }
      
    
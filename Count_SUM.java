package mellisai;

import java.util.Scanner;

public class Count_SUM {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			Scanner cm=new Scanner(System.in);
			int M=cm.nextInt();
			int N=cm.nextInt();
			int ar[][]=new int[M][N];
			for(int i=0;i<M;i++) {
				for(int j=0;j<N;j++) {
					ar[i][j]=cm.nextInt();
				}
			}
			  for(int i = 0; i < N; i++)
			   {    
		          int   colSum = 0;    
		          
		          
		            for(int j = 0; j < M; j++)
		            {    
		            	colSum = colSum + ar[j][i];    
		            }    
		            System.out.println( colSum);    
		        }    

	}

}

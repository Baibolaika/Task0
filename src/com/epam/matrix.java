package com.epam;

public class matrix {
			
	public static int[][] umnojenie(int[][] matrixA, int[][] matrixB)
    {       
        int m = matrixA.length;
        int n = matrixA[0].length;
        int k = matrixB.length;
        int l = matrixB[0].length;
        if (n != k)
        {
            System.out.println ("Нельзя умножить эти матрицы!");
        }
        int[][] matrixC = new int[m][l];  
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<l; j++)
            {
            	matrixC[i][j] = 0;
                for (int s=0; s<n; s++)
                {
                	matrixC[i][j] += matrixA[i][s] * matrixB[s][j];  	
                }
                
            }
        }
        
        return matrixC;
    }
	public static void main(String[] args) 
    {
        int[][] A = {{1, 2},
                     {3, 4},};
        int[][] B = {{5, 6},
                     {7, 8},};
        int [][] matrixSub = umnojenie(A, B);
    
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
	        System.out.print(matrixSub[i][j]+"\t");
	        }
	        System.out.println();
	     }
    }
    
    
}

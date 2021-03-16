
public class Main {
	   
	public static void main(String[] args) {
	     int [][]first = {
	        {0 , 3 , 0 , 4 },
	        {0 , 5 , 7 , 0 },
	        {0 , 0 , 0 , 0 },
	        {2 , 6 , 0 , 0 }
	    };

//	    int [][]second={
//	       {0 , 1 , 1 , 0},
//	       {2 , 0 , 0 , 5},
//	       {0 , 0 , 4 , 4},
//	       {1 , 8 , 0 , 0}
//   	   };
	     int [][]second = {
	    	       {1 , 0 , 0 , 0},
	    	       {0 , 1 , 0 , 0},
	    	       {0 , 0 , 1 , 0},
	    	       {0 , 0 , 0 , 1}
				};

	    Matrix initialMatrix = new Matrix(first);
	    
	    System.out.println("\nThe Sparse Matrix given here is : ");
	    initialMatrix.show();
	    
	    System.out.println("\nThe Transposed Matrix is : ");
	    int trans[][] = initialMatrix.transpose();
	    int row = initialMatrix.getcol();
	    int col = initialMatrix.getrow();
	    
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.printf("%5d", trans[i][j]);
			}
			System.out.println("\n");
		}
		
	    
	    System.out.println("\n");
	    
	    Matrix secondMatrix = new Matrix(second);
	    System.out.println("\nThe second matrix is :");
	    secondMatrix.show();
	    
	    boolean result;
	    result = secondMatrix.isSym();
	    if(result){
	    	System.out.println("\nThe second matrix is symmetric ");
	    }
	    else{
	    	System.out.println("\nThe second matrix is not symmetric");
	    } 
	    System.out.println("\nThe addition of first & second matrices is :");

	    int add[][] = initialMatrix.Add(secondMatrix);
	    row = initialMatrix.getrow();
	    col = secondMatrix.getcol();
	    for(int i = 0; i<row; i++){
	    	for(int j=0; j<col; j++){
	    		System.out.printf("%5d",add[i][j]);
			}
			System.out.println("\n");
		}
	    
	    
	    System.out.println("\nThe multiplication of first & second matrices is :");
	    int mul[][] = initialMatrix.Mul(secondMatrix);
	    row = initialMatrix.getrow();
	    col = secondMatrix.getcol();
	    for(int i = 0; i<row; i++){
	    	for(int j=0; j<col; j++){
	    		System.out.printf("%5d", mul[i][j]);
			}
			System.out.println("\n");
		}
	}
}


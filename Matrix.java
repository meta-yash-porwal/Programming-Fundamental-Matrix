/**
 * this class is used for Matrix 
 * to show Matrix, add Matrices, multiply Matrices
 * check that matrix is symmetric or not 
 * @author yash.porwal_metacube
 *
 */
public class Matrix {
	private final int row;
	private final int col;
	private final int[][]mat;

	public int getrow() {
		return row;
	}
	public int getcol() {
		return col;
	}


	/**
	 * this constructor is used to allot size 
	 * to array of respective row and column
	 * @param row of the matrix
	 * @param col of the matrix
	 */
	public Matrix(int row,int col) {
		this.row = row;
		this.col = col;
		mat = new int[row][col];
	}
	

	/**
	 * this is used to initialize values an 2-D array (matrix) to 
	 * Matrix object 2-D array
	 * @param mat an initialized integer matrix (2D array)
	 */
	public Matrix(int[][] mat) {
		row = mat.length;
		col = mat[0].length;
		this.mat = new int[row][col];
		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				this.mat[i][j] = mat[i][j];
	}
	
	
	/**
	 * this method transpose the matrix means
	 * Rows = Columns & Columns = Rows
	 * @return the transposed matrix (2D integer array)
	 */
	public int[][] transpose() {
		int transposed[][] = new int[col][row];
		for(int i=0; i < row; i++)
			for(int j=0; j<col; j++)
				transposed[j][i] = this.mat[i][j];
		return transposed;
	}
	
	/**
	 * this method Add two matrices 
	 * @param second, this is second matrix to be added in the first matrix 
	 * @return the added matrix (2D integer array)
	 */
	public int[][] Add(Matrix second) {
		Matrix first = this;
		if(second.row != first.row || second.col != first.col) {
			System.out.println("Sorry!, Illegal matrix Dimensions");
			System.exit(0);
		}
		
		int[][] Sum = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				Sum[i][j] = first.mat[i][j] + second.mat[i][j];
			}
		}
		return Sum;
	}
	
	
	  /**
	   * this method Multiply two matrices
	   * @param second, this is second matrix to be multiplied with the first matrix 
	   * @return the multiplied matrix (2D integer array) 
	   */
	public int[][] Mul(Matrix second) {
		Matrix first = this;
		if(first.col != second.row) {
			System.out.println("Sorry!, Illegal Matrix Dimension");
			System.exit(0);
		}
		
		int[][] multiply = new int[first.row][second.col]; 

		for(int i=0; i<first.row; i++) {

			for(int j=0; j < second.col; j++) {

				multiply[i][j] = 0;
				for(int k=0; k < first.col; k++){

					multiply[i][j] += (first.mat[i][k]*second.mat[k][j]);
				}
			}
		}
		return multiply;
	}
	 

	   /**
	    * to check whether a matrix is symmetric or not
	    * @return boolean, the true(if symmetric) or false (not symmetric)
	    */
	public boolean isSym() {
		if (row != col) {
			System.out.println("It Can't be Symmetric since not square!!! ");
			return false;
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(this.mat[i][j] != this.mat[j][i])
					return false;
			}
		}
		return true;
	}
	
	
	/**
	 * to display the matrix
	 */
	public void show() {
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.printf("%5d",mat[i][j]);
			}
			System.out.println("\n");
		}
	}
}
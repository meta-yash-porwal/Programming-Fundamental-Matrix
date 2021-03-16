import static org.junit.Assert.*;

import org.junit.*;


public class TestMatrix {
	
	int[][] arr1 = {{5,0,3},
				   {0,0,2},
				   {0,1,0}};
	
	int[][] arr2 = {{1,0,0},
				   {0,2,0},
				   {0,0,1}};


	Matrix sm1 = new Matrix(arr1);
	Matrix sm2 = new Matrix(arr2);
	
	/**
	 * Test transpose method
	 */
	@Test
	public void testTranspose() {
		int transpose1 [][] = sm1.transpose();
		int smt1[][] = {{5,0,0},
					   {0,0,1},
					   {3,2,0}
					   };
					   
		assertArrayEquals(smt1, transpose1);
		
		int transpose2[][] = sm2.transpose();
		int smt2 [][] = {{1,0,0},
						 {0,2,0},
						 {0,0,1}
						};
		assertArrayEquals(smt2, transpose2);
	}
	
	/*
	 * test for sparse matrix symmetry
	 */
	@Test
	public void testSymmetric() {
		assertEquals(false, sm1.isSym());
		assertEquals(true, sm2.isSym());
	}

	/*
	 * test to add sparse matrix
	 */
	@Test
	public void testAdd() {
		int[][] add = sm1.Add(sm2);
		int[][] result ={{6,0,3},
						{0,2,2},
						{0,1,1}};
						
		assertArrayEquals(result, add);
	}
	

	/*
	 * test to multiply sparse matrix
	 */
	@Test
	public void testMultiply() {

		int mul[][]= sm1.Mul(sm2);
		int[][] result ={{5,0,3},
						{0,0,2},
						{0,2,0}};

		assertArrayEquals(result, mul);
	}
	
}

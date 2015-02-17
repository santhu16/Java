//Multidimensional Arrays
// Indexing starts from 0.

public class Application {
	public static void main(String[] args) {

		// 1D array
		int[] values = { 3, 5, 2343 }; 

		// Only need 1 index to access values.
		System.out.println(values[2]);

		// 2D array (grid or table)
		int[][] grid = { 
				{ 3, 5, 2343 },  //1st row   {[0,0],[0,1],[0,2]}
				{ 2, 4 },        //2nd row   {[1,0],[1,1],[1,2]}
				{ 1, 2, 3, 4 }   //3rd row   {[2,0],[2,1],[2,2]}
				}; 

		// Need 2 indices to access values
		System.out.println(grid[1][1]); //first row is indexed as 0; Therefore syntax is grid[row][column];
		                                // Therefore grid[1][1] returns 2nd element in 2nd row.
		System.out.println(grid[0][2]); //Grid[0][2] returns 3rd element in 1st row

		// Can also create without initializing.
		String[][] texts = new String[2][3];
		texts[0][1] = "Hey";
		System.out.println(texts[0][1]);

		// How to iterate through 2D arrays.
		// first iterate through rows, then for each row
		// go through the columns.
		for (int row = 0; row < grid.length; row++) {            // Printing multidimensional arrays
			for (int col = 0; col < grid[row].length; col++) {
				System.out.print(grid[row][col] + "\t"); // \t displays the array in the form of table.
			}
			System.out.println();
		}

		// The last array index is optional.
		String[][] words = new String[2][];

		// Each sub-array is null.
		System.out.println(words[0]); // Without initializing, the array prints out Null.

		// We can create the sub-arrays 'manually'.
		words[0] = new String[3];

		// Can set a values in the sub-array we just created.
		words[0][1] = "Football";
		System.out.println(words[0][1]);
	}
}

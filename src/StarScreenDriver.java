/*
 * StarScreenDriver.java
 * Usage: java StarScreenDriver
 * Driver class for StarScreen.
 * This class creates simple StarScreen objects and assumes rows and cols > 0.
 * The following text is printed to standard out:

[*][ ][ ]
[ ][ ][ ]

[ ][ ][ ][ ][ ]
[ ][ ][ ][*][ ]
[ ][ ][ ][ ][ ]
[ ][ ][ ][ ][ ]

[ ][ ][ ][ ][ ][ ][ ][ ][ ][*]

[*][*]
[*][*]

[*][*][*][*][*][*][*]
[*][ ][ ][ ][ ][ ][*]
[*][ ][ ][ ][ ][ ][*]
[*][ ][ ][ ][ ][ ][*]
[*][*][*][*][*][*][*]

[*][*][*]
[*][*][*]
[*][*][*]
*/
public class StarScreenDriver {

	public static void main(String[] args) {

		// Screen with 2 rows, 3 cols and a star at row=0, col=0
		simpleScreen(2, 3, 0, 0);

		// Screen with 4 rows, 5 cols and a star at row=1, col=3
		simpleScreen(4, 5, 1, 3);

		// Screen with 1 row, 10 cols and a star at row=0, col=9
		simpleScreen(1, 10, 0, 9);

		// Screens with a star border
		border(2, 2);
		border(5, 7);

		// Screen filled with stars
		fill(3, 3);
	}

	/*
	 * Uses the given number of rows and cols to create a screen and print it
	 * with a star at the desired location.
	 */
	public static void simpleScreen(int rows, int cols, int row, int col) {
		StarScreen screen = new StarScreen(rows, cols);
		screen.copyInto(row, col);
		screen.print();
	}

	/*
	 * Prints a screen that has a border of stars. Note that the area may not be
	 * square.
	 */
	public static void border(int rows, int cols) {
		StarScreen screen = new StarScreen(rows, cols);
		// put stars in the first and last columns.
		for (int i = 0; i < rows; i++) {
			screen.copyInto(i, 0);
			screen.copyInto(i, cols - 1);
		}
		// put stars in the first and last rows
		for (int i = 0; i < cols; i++) {
			screen.copyInto(0, i);
			screen.copyInto(rows - 1, i);
		}
		screen.print();
	}

	//Prints a screen with all rows and cols filled with stars.
	public static void fill(int rows, int cols) {
		StarScreen screen = new StarScreen(rows, cols);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				screen.copyInto(i, j);
			}
		}
		screen.print();
	}
}

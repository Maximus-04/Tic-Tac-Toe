/**
 * The initializeGrid class represents a grid with a minimum size constraint.
 * It ensures that the number of rows and columns does not fall below a specified limit.
 */
public class initializeGrid {
    /** The number of rows in the grid. */
    public int rows;
    /** The number of columns in the grid. */
    public int cols;
    /** The minimum allowed size for rows and columns. */
    public final int size = 4;

    /**
     * Constructs an initializeGrid object with the specified dimensions.
     * If the given dimensions are smaller than the minimum size, they are set to the minimum.
     *
     * @param rows the number of rows in the grid
     * @param cols the number of columns in the grid
     */
    public initializeGrid(int rows, int cols) {
        this.rows = (rows >= size) ? rows : size;
        this.cols = (cols >= size) ? cols : size;
    }

    /**
     * Returns the number of rows in the grid.
     *
     * @return the number of rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * Returns the number of columns in the grid.
     *
     * @return the number of columns
     */
    public int getCols() {
        return cols;
    }

    /**
     * Returns the minimum allowed size for rows and columns.
     *
     * @return the minimum grid size
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the number of rows in the grid if it meets the minimum size requirement.
     * Prints an error message if the value is too small.
     *
     * @param rows the new number of rows
     */
    public void setRows(int rows) {
        if (rows >= size) {
            this.rows = rows;
        } else {
            System.out.println("Out-of-bounds!");
        }
    }

    /**
     * Sets the number of columns in the grid if it meets the minimum size requirement.
     * Prints an error message if the value is too small.
     *
     * @param cols the new number of columns
     */
    public void setCols(int cols) {
        if (cols >= size) {
            this.cols = cols;
        } else {
            System.out.println("Out-of-bounds!");
        }
    }
}

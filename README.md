 **Here's the documentation for the CodeReuse class:**

**Class Name:**

* CodeReuse

**Description:**

* This class provides utility methods for array and matrix operations, including sorting, calculating statistics, and performing matrix addition.

**Methods:**

* **sortAscending(int[] arr):**
    * Sorts the elements of an integer array in ascending order using the bubble sort algorithm.
    * Parameters:
        * arr: The integer array to be sorted.
    * Returns: None (void).
* **calculateStats(int[] arr):**
    * Calculates the maximum, minimum, and average values of an integer array.
    * Parameters:
        * arr: The integer array for which to calculate statistics.
    * Returns: A double array containing the maximum value (index 0), minimum value (index 1), and average value (index 2).
* **matrixAddition(int[][] matrix1, int[][] matrix2, int rows, int columns):**
    * Performs element-wise addition of two matrices.
    * Parameters:
        * matrix1: The first matrix to be added.
        * matrix2: The second matrix to be added.
        * rows: The number of rows in the matrices.
        * columns: The number of columns in the matrices.
    * Returns: A new integer matrix containing the sum of the input matrices.

**Example Usage:**

```java
int[] myArray = {5, 2, 8, 1, 9};
// Sort the array in ascending order
CodeReuse.sortAscending(myArray);

// Calculate statistics for the array
double[] stats = CodeReuse.calculateStats(myArray);
System.out.println("Maximum value: " + stats[0]);
System.out.println("Minimum value: " + stats[1]);
System.out.println("Average value: " + stats[2]);

// Perform matrix addition
int[][] matrix1 = {{1, 2}, {3, 4}};
int[][] matrix2 = {{5, 6}, {7, 8}};
int[][] resultMatrix = CodeReuse.matrixAddition(matrix1, matrix2, 2, 2);
System.out.println("Resultant matrix:");
for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 2; j++) {
        System.out.print(resultMatrix[i][j] + " ");
    }
    System.out.println();
}
```

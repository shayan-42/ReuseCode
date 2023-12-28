public class CodeReuse {
    

        // Method to sort array in ascending order
        public void sortAscending(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    
        // Method to calculate statistics: max, min, and average
        public double[] calculateStats(int[] arr) {
            double[] stats = new double[3]; // Array to hold max, min, and average
    
            if (arr.length == 0) {
                // Handle empty array case
                return stats; // All values will remain 0.0
            }
    
            // Finding maximum and minimum values
            int max = arr[0];
            int min = arr[0];
            double sum = arr[0];
    
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
                sum += arr[i];
            }
    
            // Calculating average
            double average = sum / arr.length;
    
            // Storing max, min, and average in the stats array
            stats[0] = max;
            stats[1] = min;
            stats[2] = average;
    
            return stats;
        }
    

    

    // Other methods here...

    // Method for matrix addition
    public int[][] matrixAddition(int[][] matrix1, int[][] matrix2, int rows, int columns) {
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
        }
    
}

    
    


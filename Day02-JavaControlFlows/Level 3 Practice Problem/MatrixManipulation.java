// Here import all classes so that we can use their inbuilt functions
import java.util.*;

// Create a class MatrixManipulation to perform matrix manipulation operations like addition, subtraction, multiplication, and transpose
public class MatrixManipulation {

    // Create a method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int columns) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        
        // Fill the matrix with random values between 1 and 10
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(10) + 1;  // Random values between 1 and 10
            }
        }
        return matrix;
    }

    // Create a method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];
        
        // Add corresponding elements of both matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Create a method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];
        
        // Subtract corresponding elements of the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Create a method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;
        
        // Ensure the number of columns in matrix1 equals the number of rows in matrix2
        if (columns1 != rows2) {
            System.out.println("Matrix multiplication not possible. Invalid dimensions.");
            return new int[0][0];
        }
        
        int[][] result = new int[rows1][columns2];
        
        // Multiply the matrices
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                result[i][j] = 0;
				
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Create a method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transpose = new int[columns][rows];
        
        // Swap rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Create a method to find the determinant of a 2x2 matrix
    public static int determinant(int[][] matrix) {
        if (matrix.length == 2 && matrix[0].length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        return 0;  // For matrices larger than 2x2, this method should be extended
    }

    // Create a method to find the inverse of a 2x2 matrix
    public static double[][] inverseMatrix(int[][] matrix) {
        int d = determinant(matrix);
        
        if (d == 0) {
            System.out.println("Matrix is singular, cannot find inverse.");
            return new double[0][0]; // Inverse does not exist if determinant is zero
        }

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) d;
        inverse[0][1] = -matrix[0][1] / (double) d;
        inverse[1][0] = -matrix[1][0] / (double) d;
        inverse[1][1] = matrix[0][0] / (double) d;

        return inverse;
    }

    // Create a method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 2, columns = 2;

        // Generate two random matrices
        int[][] matrix1 = createRandomMatrix(rows, columns);
        int[][] matrix2 = createRandomMatrix(rows, columns);

        // Print the generated matrices
        System.out.println("Matrix 1 : ");
        printMatrix(matrix1);
		
        System.out.println("Matrix 2 : ");
        printMatrix(matrix2);

        // Matrix of addition
        int[][] sumMatrix = addMatrices(matrix1, matrix2);
        System.out.println("Matrix Addition Result : ");
        printMatrix(sumMatrix);

        // Matrix of subtraction
        int[][] diffMatrix = subtractMatrices(matrix1, matrix2);
        System.out.println("Matrix Subtraction Result : ");
        printMatrix(diffMatrix);

        // Matrix of multiplication
        int[][] prodMatrix = multiplyMatrices(matrix1, matrix2);
        System.out.println("Matrix Multiplication Result : ");
        printMatrix(prodMatrix);

        // Matrix of transpose
        int[][] transposeMatrix = transposeMatrix(matrix1);
        System.out.println("Transpose of Matrix 1 : ");
        printMatrix(transposeMatrix);

        // Determinant of 2x2 matrix
        int d = determinant(matrix1);
        System.out.println("Determinant of Matrix 1 : " + d);

        // Inverse of 2x2 matrix
        double[][] inverse = inverseMatrix(matrix1);
        System.out.println("Inverse of Matrix 1 : ");
        for (int i = 0; i < inverse.length; i++) {
            for (int j = 0; j < inverse[i].length; j++) {
                System.out.print(inverse[i][j] + " ");
            }
            System.out.println();
        }
    }
}

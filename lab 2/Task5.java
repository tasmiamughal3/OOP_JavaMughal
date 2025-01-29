public class Task5 {
    public static void main(String[] args)
 {
 int matrix[][] = {{1, 1, 0, 0, 1},{1, 0, 1, 0, 1},{1, 0, 0, 1, 1},{1, 0, 0, 0, 1}};
 int matrix2[][] = {{1, 1, 0, 0, 1},{1, 0, 1, 0, 1},{1, 0, 0, 1, 1},{1, 0, 0, 0, 1}};
        boolean isTrue = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix2[i][j]) {
                    isTrue = false;
                }
            }
        }

        if (isTrue) {
            System.out.println("The matrix contains the letter 'N'.");
        }
        else
        {
            System.out.println("The matrix doesn't contains the letter 'N'.");

        } 
    }
}
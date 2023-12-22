public class Main {
    public static void main(String[] args) {
        GenericClass<Integer, Float, String> genericClass = new GenericClass<>(10, 10.5f , "Hello");
        genericClass.printClassNames();

        Integer[] array = {1, 2, 3, 4, 5};
        MinMax<Integer> minMax = new MinMax<>(array);
        System.out.println("Min: " + minMax.findMin());
        System.out.println("Max: " + minMax.findMax());

        System.out.println("Sum: " + Calculator.sum(8, 4));
        System.out.println("Multiply: " + Calculator.multiply(8, 4));
        System.out.println("Divide: " + Calculator.divide(8, 4));
        System.out.println("Subtraction: " + Calculator.subtraction(8, 4));

        Integer[][] matrix1 = {{1, 1}, {1, 1}};
        Integer[][] matrix2 = {{1, 1}, {1, 1}};
        Matrix<Integer> matrixA = new Matrix<>(matrix1);
        Matrix<Integer> matrixB = new Matrix<>(matrix2);
        Matrix<Integer> matrixC = matrixA.add(matrixB);
        System.out.println("Matrix C:");
        for (int i = 0; i < matrixC.getLenght(); i++) {
            for (int j = 0; j < matrixC.getLenght(); j++) {
                System.out.print(matrixC.getElement(i, j) + " ");
            }
            System.out.println();
        }
    }
}
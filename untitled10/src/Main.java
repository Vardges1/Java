public class Main {
    public static void main(String[] args) {
        var recursions = new Recursions();

        System.out.println("GetTriangleSequence(5): " + recursions.GetTriangleSequence(5));
        System.out.println("FromOneToN(5): " + recursions.FromOneToN(5));
        System.out.println("FromAToB(2, 7): " + Recursions.FromAToB(2, 7));
        System.out.println("SumOfNumbers(0, 0, 0, 10): " + recursions.SumOfNumbers(0, 0, 0, 10));
        System.out.println("SumOfNumbersFromNumber(123): " + recursions.SumOfNumbersFromNumber(123));
        System.out.println("IsSimple(7, 2): " + recursions.IsSimple(7, 2));
//        System.out.print("Factorization(84): ");
//        recursions.Factorization(84, 2);
//        System.out.println();
        System.out.println("Palindrom(\"racecar\"): " + recursions.Palindrom("racecar"));
        System.out.println("WithoutTwoZero(2, 3): " + recursions.WithoutTwoZero(2, 3));
        System.out.println("Reverse(12345, 0): " + recursions.Reverse(12345, 0));
        System.out.println("CountOne(): " + Recursions.CountOne());
        System.out.print("OddNumbers(): ");
        recursions.OddNumbers();
        System.out.println();
        System.out.print("OddIndexes(): ");
        recursions.OddIndexes();
        System.out.println();

        System.out.println("FromLeftToRight(12345): " + recursions.FromLeftToRight(12345));

        System.out.print("FromRightToLeft(12345): ");
        recursions.FromRightToLeft(12345);
        System.out.println();

        System.out.print("CountElementsEqualsMax(5, 0): ");
        recursions.CountElementsEqualsMax(5, 0);
        System.out.println();

        System.out.println("MaxSequence(): " + Recursions.MaxSequence());
    }
}

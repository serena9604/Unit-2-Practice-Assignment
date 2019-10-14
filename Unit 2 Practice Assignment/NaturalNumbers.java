

public class NaturalNumbers
{
    public static void main (String args[]) {
        int squareNatNum = 0;
        int natNum = 0;
        int sumSquares = 0;
        int sum = 0;
        int squareSums = 0;
        for (int i = 1; i <= 100; i ++) {
            squareNatNum = (int) Math.pow(i, 2);
            sumSquares = sumSquares + squareNatNum;
        }
        for (int k = 1; k <= 100; k++) {
            natNum = k;
            sum = sum + natNum;
        }
        squareSums = (int) Math.pow (sum, 2);
        /*
        System.out.println("sumSqaures: " + sumSquares);
        System.out.println("sum: " + sum);
        System.out.println("squareSums: " + squareSums);
        */
        System.out.println("difference: " + (squareSums - sumSquares));

    }
}

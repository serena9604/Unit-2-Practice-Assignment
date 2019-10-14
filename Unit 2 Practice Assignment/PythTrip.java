
public class PythTrip
{
    public static void main(String args[]) {
        int a = 0;
        int b = 0;
        int c = 0;
        int abc = 0;
        int sumAbc = 0;
        int cSquared = 0;

        for (int i = 0; i < 1000; i ++) {
            c = i;
            for (int beta = 0; beta < c; beta ++) {
                b = beta;
                for (int alpha = 0; alpha < b; alpha ++) {
                    a = alpha;
                    sumAbc = a + b + c;
                    cSquared = (a*a) + (b*b);
                    if (sumAbc == 1000 && cSquared == c*c) {
                        abc = a*b*c;
                        System.out.println("abc: " + abc);
                    }

                }
            }   
        }
    }
}


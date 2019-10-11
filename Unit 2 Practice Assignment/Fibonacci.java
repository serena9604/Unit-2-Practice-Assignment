
public class Fibonacci
{
    public static void main (String [] args) {
        int prevTerm1 = 1;
        int prevTerm2 = 2;
        int currentTerm = 0;
        int total = 2;
        int i = 2;
        while(currentTerm < 4000000) {
            currentTerm = prevTerm1 + prevTerm2;
            prevTerm1 = prevTerm2;
            prevTerm2 = currentTerm;
            if (currentTerm % 2 == 0) {
                total = total + currentTerm;
            }
            i++;
        } 
        System.out.print(total);

    }
}

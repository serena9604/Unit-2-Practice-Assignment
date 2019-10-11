
/*
 * Write a description of class ListNum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListNum
{
    public static void main (String args[]) {
        int mult3 = 0; //variable to see whether number is multiple of 3
        int mult5 = 0; //variable to see whether number is multiple of 5
        int total = 0;
        for (int i = 1; i < 1000; i ++) {
            if (i % 3 == 0 && i != 0) { //checking to see if number is multiple of 3
                mult3 = i;
                total = total + mult3;
            } else if (i % 5 == 0 && i != 0) {
                mult5 = i; 
                total = total + mult5;
            }
            //total = total + mult3 + mult5;
        }
        System.out.println("total: " + total);
    }

}

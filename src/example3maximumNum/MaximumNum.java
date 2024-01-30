package example3maximumNum;

public class MaximumNum {

    public static void main(String[] args) {
        int a = -10;
        int b = -30;
        int c = -35;

        int max = Integer.MIN_VALUE;
        //int min = Integer.MAX_VALUE;




        if (a > b) { //10 > 20
            max = a;
        } else {
            max = b; //max = 20
        }

        if (c > max)  { //30 > 20
           max = c ; //max 30
        }

        System.out.println(max);

    }

}

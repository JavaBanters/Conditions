package example6;

public class Reverse {

    public static void main(String[] args) {
        String name = "Anant"; //last index is 4
        char [] a = name.toCharArray();
        //System.out.println(a[4]);
        for(int i = 4; i >= 0; i--) {
            System.out.print(a[i]+ " ");
        }
    }
}

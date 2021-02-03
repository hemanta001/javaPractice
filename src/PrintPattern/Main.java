package PrintPattern;

public class Main {

    public static void main(String[] args) {

        int i;//declaring variable
        int j;
        int row = 6;//value initialize
        for (i = 0; i < row; i++) {
            for (j = 0; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


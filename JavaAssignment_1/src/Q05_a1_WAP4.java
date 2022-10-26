public class Q05_a1_WAP4 {
    public static void main(String[] args) {
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14; j++) {
                if (
                        i == 0 || j == 0 || i == 13 ||
                                (i == 1 && j < 6) || (i == 2 && j < 5) || (i == 3 && j < 4) || (i == 4 && j < 3) || (i == 5 && j < 2) ||
                  (i == 7 && j < 2) || (i == 8 && j < 3) || (i == 9 && j < 4) || (i == 10 && j < 5) || (i == 11 && j < 6)
                                || (i == 12 && j < 7)
                        ) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
public class Q04_a1_Wap3 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            for (int j = i + 1; j < 7; j++) {
                System.out.print(" ");
            }
            for (int j = 6; j < 13 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 13; j > 13 - i - 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Q03_a1_Wap2 {
    public static void main(String[] args) {
        for(int i=0;i<14;i++){
            for(int j=0;j<14;j++){
                if(
                        i==0 || i==13 || j==0 || j==13 ||
                                (j==1&&i<7-j) || (j==2&&i<7-j) || (j==3&&i<7-j) || (j==4&&i<7-j) ||(j==5&&i<7-j) || (j==7&&i<2) || (j==8&&i<3) || (j==9&&i<4) || (j==10&&i<5) || (j==11&&i<6) || (j==12&&i<7)
                )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

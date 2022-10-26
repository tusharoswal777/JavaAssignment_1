public class Q01_a1_Wap {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=0;j<29;j++){

                if(
                        ((i==0&&j<3) || (i==3&&j<3) || j==1 ) ||     //Printing I
                        (j==4 || j==7 || i==1&&j==5 || i==2 && j==6) ||   //Printing N
                        (j==9 || j==11 || (i==3&&j>8&&j<12)) ||        //Printing U
                        (j==13 || (i==0&&j>12&&j<16) || (i==1&&j>12&&j<16) || (i==3&&j>12&&j<16)) || //Printing E
                        (j==17 ||(i==0&&j>16&&j<20) || (i==1&&j>16&&j<20) || (i==2&&j==18) || (i==3&&j==19))  || //Printing R
                        (j==21 || j==23 || (i==0&&j>20&&j<24) || (i==3&&j>20&&j<24)) || //Printing O
                        (j==25 || j==28 || i==1&&j==26 || (i==2&&j==27)) //Printing N

                )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

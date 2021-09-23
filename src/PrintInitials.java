public class PrintInitials {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 6; i++) {
            for (j = 6; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i=1;i<=6;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("**");
            }
            System.out.println( );
        }

        //D star pattern
        for (i=0;i<=11;i++)
        {
            for (j=0;j<2;j++)
            {
                System.out.print("*");
            }
            for (k=1;k<=5;k++)
            {
                if (i>=0 && i<2 || i>9 && i<=11 || k==5)
                {
                    System.out.print("**");
                }
                else {
                    System.out.println("  "); //two spaces
                }
            }
            for (j=0;j<=i;j++)
            {
                if (i>=0 && i<2 || i>9 && i<=11 )
                {
                    System.out.println(" "); // one space

                }
                else
                {

                }
            }
            System.out.println(); //new line
        }

    }
}



















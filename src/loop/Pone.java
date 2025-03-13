package loop;

public class Pone {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int k = 0; k < 7; k++)
        {
            for (int l = 0; l <= k; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++)
        {
            int j = 0;
            while (j <= 5)
            {
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
        }

    }

}

public class Main {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("--------------------");

        int[] array = new int[11];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
        System.out.println("-------------------------");
        int[] bb;
        bb = new int[]{3, 5, 4};

        int sum = bb[0];
        for (int i = 1; i < bb.length; i++) {
            sum += bb[i];
        }
        System.out.println(sum);
        int pos = 0;
        for (int i = 0; i < bb.length; i++) {
            if (bb[i] > 0)
                pos += bb[i];
        }
        System.out.println(pos);
        System.out.println("---------------------");
        int mult = bb[0];
        for (int i = 1; i < bb.length; i++)
            mult *= bb[i];
        {
            System.out.println(mult);
        }
        int min = bb[0];
        for (int i = 1; i < bb.length; i++) {
            if (bb[i] < min)
                min = bb[i];
        }
        System.out.println(min);
        System.out.println("-------------------------------");
        int[] gg = new int[]{-123, 87, -23, 7, 6, 34, 4};
        int zz = 0;
        int counterOfFors = 0;
        boolean whileIfIsGoingIn = true;
        while (whileIfIsGoingIn) {
            whileIfIsGoingIn = false;
            for (int i = 0; i < gg.length - 1 - counterOfFors; i++) {
                if (gg[i] > gg[i + 1]) {
                    zz = gg[i];
                    gg[i] = gg[i + 1];
                    gg[i + 1] = zz;
                    whileIfIsGoingIn = true;
                }
            }
            counterOfFors++;
        }
        for (int a : gg)
            System.out.print(a + " ");


    }
}


//        int alone=gg[0];
//        for (int i = 1; i < gg.length ;  i++) {
//            alone=alone ^ gg[i];        }
//        System.out.println(alone);
//        System.out.println("----------------------");
//
//



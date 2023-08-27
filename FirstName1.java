public class FirstName1 {
    public static void main(String[] args) {

        int[] mas = new int[8];

        for (int x = mas.length; x > -1; x--) {

            System.out.println("От большего к меньшему = " + x);
        }
        System.out.println("   ");
        int[] mas1 = {
                4, 6, 7, 5, 4, 3, 7, 7, 5, 4};

        for (int s = 0; s < mas1.length; s++) {

            System.out.println("От меньшего к большему = " + s);
        }
        System.out.println("   ");

        int[] sum = new int[mas.length + mas1.length];
        int e = 0;

        for (int i = 0; i < mas.length; i++) {
            sum[i] = mas[i];
            e++;
        }
        for (int j = 0; j < mas1.length; j++) {
            sum[e++] = mas1[j];
        }
        for (int i = 0; i < sum.length; i++)

            System.out.print("+" + sum[i]);
    }
}

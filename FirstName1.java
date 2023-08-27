public class FirstName1 {
    public static void main(String[] args) {

        int[] massiv = new int[8];

        for (int i = massiv.length; i > -1; i--) {

            System.out.println("От большего к меньшему = " + i);
        }
        System.out.println("   ");
        int[] massiv1 = {
                4, 6, 7, 5, 4, 3, 7, 7, 5, 4};

        for (int i = 0; i < massiv1.length; i++) {

            System.out.println("От меньшего к большему = " + i);
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = new int[3][4];
        Scanner scanner = new Scanner(System.in);

        System.out.println("************* Kramer usuli *************");

        System.out.println();
        System.out.println("  | a11 x1 + a12 x2 + a13 x3 = b1");
        System.out.println(" {  a21 x1 + a22 x2 + a23 x3 = b2");
        System.out.println("  | a31 x1 + a32 x2 + a33 x3 = b3");
        System.out.println();

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.print((i + 1) + "-qator " + (j + 1) + "-elementni kiriting: ");
                matrix[i][j] = scanner.nextInt();
            }

        }

        System.out.println();
        System.out.println("  | " + matrix[0][0] + " x1 + " + matrix[0][1] + " x2 + " + matrix[0][2] + " x3 = " + matrix[0][3]);
        System.out.println(" {  " + matrix[1][0] + " x1 + " + matrix[1][1] + " x2 + " + matrix[1][2] + " x3 = " + matrix[1][3]);
        System.out.println("  | " + matrix[2][0] + " x1 + " + matrix[2][1] + " x2 + " + matrix[2][2] + " x3 = " + matrix[2][3]);
        System.out.println();

        int del = (matrix[0][0] * matrix[1][1] * matrix[2][2] + matrix[1][0] * matrix[2][1] * matrix[0][2] + matrix[0][1] * matrix[1][2] * matrix[2][0])
                - (matrix[0][2] * matrix[1][1] * matrix[2][0] + matrix[1][2] * matrix[2][1] * matrix[0][0] + matrix[0][1] * matrix[1][0] * matrix[2][2]);

        int delx1 = (matrix[0][3] * matrix[1][1] * matrix[2][2] + matrix[1][3] * matrix[2][1] * matrix[0][2] + matrix[0][1] * matrix[1][2] * matrix[2][3])
                - (matrix[0][2] * matrix[1][1] * matrix[2][3] + matrix[1][2] * matrix[2][1] * matrix[0][3] + matrix[0][1] * matrix[1][3] * matrix[2][2]);

        int delx2 = (matrix[0][0] * matrix[1][3] * matrix[2][2] + matrix[1][0] * matrix[2][3] * matrix[0][2] + matrix[0][3] * matrix[1][2] * matrix[2][0])
                - (matrix[0][2] * matrix[1][3] * matrix[2][0] + matrix[1][2] * matrix[2][3] * matrix[0][0] + matrix[0][3] * matrix[1][0] * matrix[2][2]);

        int delx3 = (matrix[0][0] * matrix[1][1] * matrix[2][3] + matrix[1][0] * matrix[2][1] * matrix[0][3] + matrix[0][1] * matrix[1][3] * matrix[2][0])
                - (matrix[0][3] * matrix[1][1] * matrix[2][0] + matrix[1][3] * matrix[2][1] * matrix[0][0] + matrix[0][1] * matrix[1][0] * matrix[2][3]);

        if ((del == 0) && (delx1 == 0) && (delx2 == 0) && (delx3 == 0)) {
            System.out.println("Sistema cheksiz ko'p yechimga ega !");
        } else if ((del == 0 && delx1 != 0) || (del == 0 && delx2 != 0) || (del == 0 && delx3 != 0)) {
            System.out.println("Sistema yechimga ega emas !");
        } else {
            System.out.println("***************** Javob *****************");
            System.out.println("x1 = " + delx1 / del + ";");
            System.out.println("x2 = " + delx2 / del + ";");
            System.out.println("x3 = " + delx3 / del + ";");
        }

    }
}

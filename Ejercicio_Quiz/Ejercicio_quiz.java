package Ejercicio_Quiz;

public class Ejercicio_quiz {

    public void quiz_piramide(int n) {
        for (int i = 1; i <= n; i++) {
            // Controla los espacios vacios
            for (int j = m; j <= n - i; j++) {
                //Controla los *s de la piramide
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

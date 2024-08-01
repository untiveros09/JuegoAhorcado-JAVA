import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Clase escanner permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentoMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Bucle
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Estructura de control interactiva
        while (!palabraAdivinada && intentos < intentoMaximos) {
            System.out.println("Adivina la palabra: " + String.valueOf(letrasAdivinadas)+" ("
            +palabraSecreta.length()+" letras )");
            System.out.println("Introduce una letra ");

            // Pedimos una letra con la clase escanner
            char letra = scanner.next().charAt(0);

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                // Estructura de control condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("Incorrecto!!! Te quedan : " + (intentoMaximos - intentos) + " intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades!!! Adivinaste la palabra secreta : " + palabraSecreta);
            }
        }

        if (!palabraAdivinada) {
            System.out.println("Te quedaste sin intentos!!!!");
        }

        scanner.close();
    }
}

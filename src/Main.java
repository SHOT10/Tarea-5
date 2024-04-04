import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int figueleg, operacion;
        double result, radi, diamet, lad, altu, base, lado1, lado2, lado3, semiperim, longi, anchu;
        int contador = 0;

        while (contador < 10) {
            System.out.println("\nCalculadora Geométrica");
            System.out.println("Elija una figura:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.print("Ingrese el número de tu elección: ");

            try {
                figueleg = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Error: ingrese una opción válida.");
                scanner.next();
                continue;
            }

            System.out.println("Escoja una figura:");
            System.out.println("1. Área");
            System.out.println("2. Perímetro");
            System.out.print("Ingresa el número de tu elección: ");

            try {
                operacion = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Error: ingrese una opción válida.");
                scanner.next();
                continue;
            }

            result = 0;
            switch (figueleg) {
                case 1:
                    if (operacion == 1) {

                        System.out.print("Ingresa el radio del círculo: ");
                        radi = scanner.nextDouble();
                        result = 3.1416 * radi * radi;

                        System.out.println("\nEl área del círculo es: " + result);
                    } else {
                        System.out.print("Ingresa el diámetro del círculo: ");
                        diamet = scanner.nextDouble();
                        result = 3.1416 * diamet;

                        System.out.println("\nEl perímetro del círculo es: " + result * 2);
                    }
                    break;
                case 2:
                    if (operacion == 1) {

                        System.out.print("Ingresa la longitud del lado del cuadrado: ");
                        double lado = scanner.nextDouble();
                        result = lado * lado;

                        System.out.println("\nEl área del cuadrado es: " + result);
                    } else {
                        System.out.print("Ingresa la longitud de un lado del cuadrado: ");
                        double lado = scanner.nextDouble();
                        result = 4 * lado;

                        System.out.println("\nEl perímetro del cuadrado es: " + result);
                    }
                    break;
                case 3:
                    if (operacion == 1) {

                        System.out.print("Ingresa la base y la altura del triángulo (separados por un espacio): ");
                        base = scanner.nextDouble();
                        altu = scanner.nextDouble();
                        result = 0.5 * base * altu;
                        System.out.println("\nEl área del triángulo es: " + result);
                    } else {
                        System.out.print("Ingresa la longitud de los tres lados del triángulo (separados por un espacio): ");
                        lado1 = scanner.nextDouble();
                        lado2 = scanner.nextDouble();
                        lado3 = scanner.nextDouble();
                        semiperim = (lado1 + lado2 + lado3) / 2;
                        result = lado1 + lado2 + lado3;

                        System.out.println("\nEl perímetro del triángulo es: " + result);
                    }
                    break;
                case 4:
                    if (operacion == 1) {

                        System.out.print("Ingresa la longitud y el ancho del rectángulo (separados por un espacio): ");
                        longi = scanner.nextDouble();
                        anchu = scanner.nextDouble();
                        result = longi * anchu;
                        System.out.println("\nEl área del rectángulo es: " + result);

                    } else {

                        System.out.print("Ingresa la longitud y el ancho del rectángulo (separados por un espacio): ");
                        longi = scanner.nextDouble();
                        anchu = scanner.nextDouble();
                        result = 2 * (longi + anchu);
                        System.out.println("\nEl perímetro del rectángulo es: " + result);
                    }
                    break;
                case 5:

                    if (operacion == 1) {
                        System.out.print("Ingresa la longitud de un lado del pentágono: ");
                        lad = scanner.nextDouble();
                        result = 0.5 * lad * lad * (2.2361 + 5) * 0.2;
                        System.out.println("\nEl área del pentágono es: " + result);

                    } else {

                        System.out.print("Ingresa la longitud de un lado del pentágono: ");
                        lad = scanner.nextDouble();
                        result = 5 * lad;
                        System.out.println("\nEl perímetro del pentágono es: " + result);
                        break;
                    }
            }
        }

    }
}
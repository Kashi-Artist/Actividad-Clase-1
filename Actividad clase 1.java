import java.util.Scanner;

public class Coordenadas {

    public static void main(String[] args) {
        int x, y;
        double radio, angulo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Opciones:");
        System.out.println("1. Coordenadas rectangulares a polares.");
        System.out.println("2. Coordenadas polares a rectangulares.");
        System.out.print("Elija una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Digite coordenada X: ");
                x = scanner.nextInt();
                System.out.print("Digite coordenada Y: ");
                y = scanner.nextInt();
                radio = Math.sqrt(x * x + y * y);
                angulo = Math.toDegrees(Math.atan2(y, x));
                System.out.println("Coordenadas polares: ");
                System.out.println("Radio: " + radio);
                System.out.println("Ángulo: " + angulo + " grados");
                break;
            case 2:
                System.out.print("Digite radio: ");
                radio = scanner.nextDouble();
                System.out.print("Digite ángulo (en grados): ");
                angulo = scanner.nextDouble();
                x = (int) (radio * Math.cos(Math.toRadians(angulo)));
                y = (int) (radio * Math.sin(Math.toRadians(angulo)));
                System.out.println("Coordenadas rectangulares: ");
                System.out.println("X: " + x);
                System.out.println("Y: " + y);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }
}
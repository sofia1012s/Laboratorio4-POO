import java.util.*;

public class Vista {
    private Scanner scan;

    public Vista() {
        scan = new Scanner(System.in);
    }

    public void Inicio() {

        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + "\n\t\t\t\t\t\t\t\tSimulador de radio");
    }

    public void apagada() {

        System.out.println("-----La radio se encuentra apagada.-----");
    }

    public int Menu1() {
        String Mensaje = "\nQue desea hacer?\n" + "1. Encender la radio\n" + "2. Salir\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    public void fueraMenu() {
        System.out.println("\nPor favor, selecciona una opcion correcta.\n");
    }

    public int tipoRadio() {
        String Mensaje = "\nEscoja un modelo de carro\n" + "1. Clase S\n" + "2. Clase A\n" + "3. Clase C\n"
                + "4. Salir del simulador\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    public void Salida() {
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + "\t\t\t\t\t\t\t\tRegresa Pronto!"
                        + "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
    }

    public int modoRadio() {
        String Mensaje = "\nEn que modo desea comenzar su radio?\n" + "1. Modo Radio\n" + "2. Modo Reproduccion\n"
                + "3. Modo telefono\n" + "4. Modo Productividad\n" + "5. Cambiar clase radio";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    public void pantallaRadio(double emisora, String AM, int volumen) {
        String Mensaje = "\n----- Modo Radio -----\n" + "\n" + emisora + " - " + AM + "\n" + "Volumen: " + volumen;
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
    }

    public int menuRadio() {
        String Mensaje = "\nQue desea hacer?\n" + "1. Cambiar de FM a AM\n" + "2. Cambiar emisora\n"
                + "3. Guardar emisora\n" + "4. Cargar emisora\n" + "5. Cambiar volumen\n" + "6. Salir modo radio";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    public int menuVolumen() {
        String Mensaje = "\nQue desea hacer?\n" + "1. Subir Volumen\n" + "2. Bajar Volumen\n" + "3. Salir de opcion\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    public int menuEmisora() {
        String Mensaje = "\nHacia donde desea cambiar?\n" + "1. Arriba\n" + "2. Abajo\n" + "3. Salir de opcion\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    public double guardarEmisora() {
        String Mensaje = "\nEscriba la emisora que desea guardar (desde 80.0 hasta 110.0)\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        double opcion = scan.nextDouble();
        return opcion;
    }

    public int otraEmisora() {
        String Mensaje = "\nDesea guardar otra emisora?\n" + "1. Si\n" + "2. No\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    public void guardadoExito() {
        System.out.println("Se ha guardado la emisora con exito!");
    }

    public void emisorasGuardadas(List<Double> emisorasGuardadas) {
        for (int i = 0; i < emisorasGuardadas.size(); i++) {
            System.out.println("\n(" + (i + 1) + ") " + emisorasGuardadas.get(i));
        }

    }

    public int escogida() {
        System.out.println("\nCual emisora desea cargar?");
        int opcion = scan.nextInt();
        return opcion;

    }

    public void noEmisoras() {
        System.out.println("\nNo hay emisoras guardadas.");
    }

}

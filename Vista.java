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
                + "3. Modo telefono\n" + "4. Modo Productividad\n" + "5. Cambiar clase radio\n";
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

    public void pantallaReproduccion(int numeroDeLista, String[] miLista, int volumen) {
        String Mensaje = "\n----- Modo Reproduccion -----\n" + "\nLista de reproduccion: " + numeroDeLista
                + " \n-Cancion: " + miLista[0] + "\n-Duracion: " + miLista[1] + "\n-Autor: " + miLista[2]
                + "\n-Genero: " + miLista[3] + "\n-Volumen: " + volumen;
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
    }

    public int menuReproduccion() {
        String Mensaje = "\nQue desea hacer?\n" + "1. Seleccionar lista de reproduccion\n" + "2. Cambiar cancion\n"
                + "3. Escuchar cancion\n" + "4. Cambiar volumen\n" + "5. Salir modo reproduccion";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    public int seleccionarLista() {
        String Mensaje = "\nCual lista desea escoger?\n" + "1. Lista 1\n" + "2. Lista 2\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    public void miLista(int numero) {
        System.out.println("\nHa seleccionado la lista: " + numero);

    }

    public int cambiarCancion() {
        String Mensaje = "\nHacia donde desea cambiar?\n" + "1. Arriba\n" + "2. Abajo\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    public void listaReproduccion(int numLista, String[] nombreCancion1, String[] duracion1, String[] nombreCancion2,
            String[] duracion2) {
        if (numLista == 1) {
            System.out.println("\nLista de reproduccion # 1");

            for (int i = 0; i < nombreCancion1.length; i++) {
                System.out.println("\n(" + (i + 1) + ") " + nombreCancion1[i] + " - " + duracion1[i]);
            }

        } else if (numLista == 2) {
            System.out.println("\nLista de reproduccion # 2");
            for (int i = 0; i < nombreCancion2.length; i++) {
                System.out.println("\n(" + (i + 1) + ") " + nombreCancion2[i] + " - " + duracion2[i]);
            }

        }
    }

    public int cancionEscogida() {
        System.out.println("\nCual cancion desea escoger?");
        int opcion = scan.nextInt();
        return opcion;
    }

    public void noTelefono() {

        System.out.println("----- No se encuentra ningun telefono conectado-----");
    }

    public int Menu3() {
        String Mensaje = "\nQue desea hacer?\n" + "1. Conectar Telefono\n" + "2. Salir\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    public void imprimir(String string) {
        System.out.println(string);
    }

    public int Menu4S() {
        String Mensaje = "\nQue desea hacer?\n" + "1. Mostrar contactos\n" + "2. Llamar a contacto\n"
                + "3. Finalizar llamada\n" + "4. Cambiar a bocinas o auriculares\n" + "5. Subir volumen\n"
                + "6. Salir modo telefono\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    public int Menu4A() {
        String Mensaje = "\nQue desea hacer?\n" + "1. Mostrar contactos\n" + "2. Llamar a contacto\n"
                + "3. Finalizar llamada\n" + "4. Llamar al ultimo contacto que se llamo\n" + "5. Subir volumen\n"
                + "6. Salir modo telefono\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    public int Menu4C() {
        String Mensaje = "\nQue desea hacer?\n" + "1. Mostrar contactos\n" + "2. Llamar a contacto\n"
                + "3. Finalizar llamada\n" + "4. Colocar llamada en espera\n" + "5. Subir volumen\n"
                + "6. Salir modo telefono\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    public int llamar() {
        String Mensaje = "\nA cual contacto desea llamar?\n" + "1. Juanito\n" + "2. Papa\n" + "3. Mama\n"
                + "4. Abuelo\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    public void pantallaTelefono(String telefono, String contacto, String bocinasAuriculares, int volumen) {
        String Mensaje = "\n----- Modo Telefono -----\n" + "\nTelefono conectado : " + telefono + " \n-" + contacto
                + "\n-Llamando por : " + bocinasAuriculares + "\n-Volumen: " + volumen;
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
    }

    public void pantallaTelefonoA(String telefono, String contacto, int volumen) {
        String Mensaje = "\n----- Modo Telefono -----\n" + "\nTelefono conectado : " + telefono + " \n-" + contacto
                + "\n-Volumen: " + volumen;
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
    }

    public void pantallaTelefonoC(String telefono, String contacto, String espera, int volumen) {
        String Mensaje = "\n----- Modo Telefono -----\n" + "\nTelefono conectado : " + telefono + " \n-" + contacto
                + " \n-" + espera + "\n-Volumen: " + volumen;
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
    }

    public void pantallaProductividadS(String viaje, String viajeA, int volumen) {
        String Mensaje = "\n----- Modo Productividad -----\n" + " \n-Viaje actual: " + viajeA + "\n-Proximo viaje : "
                + viaje + "\n-Volumen: " + volumen;
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
    }

    public int viajar() {
        String Mensaje = "\nQue desea hacer?\n" + "1. Planificar viaje\n" + "2. Viajar a lugar planificado\n"
                + "3. Subir volumen\n" + "4. Salir Modo Productividad\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    public String destino() {
        System.out.println("\nEscriba a donde desea ir: ");
        scan.nextLine();
        String nombre = scan.nextLine();

        return nombre;
    }

    public int productividadA() {
        String Mensaje = "\nQue desea hacer?\n" + "1. Ver tarjeta de presentacion\n" + "2. Subir Volumen\n"
                + "3. Salir Modo Productividad\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    public void pantallaProductividadA(int c, int volumen) {
        String contacto = " ";
        switch (c) {
        case 1:
            contacto = "juanito";
            break;

        case 2:
            contacto = "papa";
            break;

        case 3:
            contacto = "mama";
            break;

        case 4:
            contacto = "abuelo";
            break;

        default:
            break;
        }

        String Mensaje = "\n----- Modo Productividad -----\n" + " \n-Observando tarjeta de presentacion actual de : "
                + contacto + "\n-Volumen: " + volumen;
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
    }

    public int mostrar() {
        String Mensaje = "\nDe cual contacto desea ver la tarjeta de presentacion?\n" + "1. Juanito\n" + "2. Papa\n"
                + "3. Mama\n" + "4. Abuelo\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    public void pantallaProductividadC(String tiempo, int volumen) {
        String Mensaje = "\n----- Modo Productividad -----\n" + tiempo + "\n-Volumen: " + volumen;
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
    }

    public int tiempo() {
        String Mensaje = "\nQue desea hacer?\n" + "1. Refrescar pronostico del tiempo\n" + "2. Subir volumen\n"
                + "3. Salir modo productividad\n" ;
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }
}

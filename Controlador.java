import java.util.*;

public class Controlador {
    public static void main(String[] args) {
        Vista vis = new Vista();

        boolean salir = false;
        boolean encendido = false;
        boolean p = false;

        int opMenu1 = 0;
        boolean bMenu1 = true;
        boolean bMenu2 = true;
        int tipoRadio = 0;
        int modoRadio = 0;
        RadioA radioA;
        RadioC radioC;
        RadioS radioS;

        vis.Inicio();

        while (salir == false) {
            vis.apagada();

            while (bMenu1 == true) {
                do {
                    try {
                        vis = new Vista();
                        opMenu1 = vis.Menu1();
                        p = true;
                    } catch (InputMismatchException ex) {
                        System.out.println("\nPor favor, ingresa un numero\n");
                        p = false;
                    }
                } while (!p);

                if (opMenu1 == 1) {
                    encendido = true;
                    bMenu1 = false;

                } else if (opMenu1 == 2) {
                    salir = true;
                    bMenu1 = false;
                } else {
                    vis.fueraMenu();
                    bMenu1 = true;
                }
            }

            while (encendido == true) {
                bMenu2 = true;
                do {
                    try {
                        vis = new Vista();
                        tipoRadio = vis.tipoRadio();
                        p = true;
                    } catch (InputMismatchException ex) {
                        System.out.println("\nPor favor, ingresa un numero\n");
                        p = false;
                    }
                } while (!p);

                switch (tipoRadio) {
                case 1: // Carro tipo S
                    radioS = new RadioS();

                    while (bMenu2) {
                        do {
                            try {
                                vis = new Vista();
                                modoRadio = vis.modoRadio();
                                p = true;
                            } catch (InputMismatchException ex) {
                                System.out.println("\nPor favor, ingresa un numero\n");
                                p = false;
                            }
                        } while (!p);

                        switch (modoRadio) {
                        case 1: // Radio
                            boolean banderaRadio = true;
                            int opRadio = 0;
                            String AM = "FM";

                            while (banderaRadio) {

                                vis.pantallaRadio(radioS.getEmisora(), AM, radioS.getVolumen());

                                do {
                                    try {
                                        vis = new Vista();
                                        opRadio = vis.menuRadio();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero\n");
                                        p = false;
                                    }
                                } while (!p);
                                boolean bRadio = true;

                                while (bRadio) {
                                    vis.pantallaRadio(radioS.getEmisora(), AM, radioS.getVolumen());
                                    switch (opRadio) {
                                    case 1: // Cambiar de FM a AM
                                        if (AM == "FM") {
                                            AM = "AM";
                                        } else {
                                            AM = "FM";
                                        }

                                        bRadio = false;
                                        break;

                                    case 2: // Cambiar emisoras
                                        boolean bemisora = true;
                                        while (bemisora) {
                                            int opEmisora = 0;
                                            do {
                                                try {
                                                    vis = new Vista();
                                                    opEmisora = vis.menuEmisora();
                                                    p = true;
                                                } catch (InputMismatchException ex) {
                                                    System.out.println("\nPor favor, ingresa un numero\n");
                                                    p = false;
                                                }
                                            } while (!p);

                                            if (opEmisora == 1) {
                                                radioS.cambiarEmisora(1);
                                                bemisora = false;
                                            } else if (opEmisora == 2) {
                                                radioS.cambiarEmisora(2);
                                                bemisora = false;
                                            } else if (opEmisora == 3) {
                                                bemisora = false;

                                            } else {
                                                vis.fueraMenu();
                                            }
                                        }

                                        bRadio = false;
                                        break;

                                    case 3: // Guardar emisoras
                                        boolean bGuardar = true;
                                        while (bGuardar) {
                                            double emisora = 0;
                                            do {
                                                try {
                                                    vis = new Vista();
                                                    emisora = vis.guardarEmisora();
                                                    p = true;
                                                } catch (Exception ex) {
                                                    System.out.println("\nPor favor, ingresa un numero\n");
                                                    p = false;
                                                }
                                            } while (!p);

                                            if (emisora > 110.0 || emisora < 80.0) {
                                                vis.fueraMenu();
                                            } else {
                                                radioS.guardarEmisora(emisora);
                                                vis.guardadoExito();
                                                boolean bandera2 = true;
                                                while (bandera2) {
                                                    int op = 0;
                                                    do {
                                                        try {
                                                            vis = new Vista();
                                                            op = vis.otraEmisora();
                                                            p = true;
                                                        } catch (InputMismatchException ex) {
                                                            System.out.println("\nPor favor, ingresa un numero\n");
                                                            p = false;
                                                        }
                                                    } while (!p);

                                                    if (op == 1) {
                                                        bandera2 = false;

                                                    } else if (op == 2) {
                                                        bandera2 = false;
                                                        bGuardar = false;
                                                    }

                                                    else {
                                                        vis.fueraMenu();

                                                    }
                                                }
                                            }

                                        }
                                        bRadio = false;
                                        break;

                                    case 4: // Cargar emisora
                                        vis.emisorasGuardadas(radioS.getEmisorasGuardadas());
                                        if (radioS.getEmisorasGuardadas().size() == 0) {
                                            vis.noEmisoras();

                                        } else {
                                            int escogida = 0;
                                            boolean bandera2 = true;
                                            while (bandera2) {
                                                do {
                                                    try {
                                                        vis = new Vista();
                                                        escogida = vis.escogida();
                                                        p = true;
                                                    } catch (InputMismatchException ex) {
                                                        System.out.println("\nPor favor, ingresa un numero\n");
                                                        p = false;
                                                    }
                                                } while (!p);

                                                if (escogida > radioS.getEmisorasGuardadas().size()) {
                                                    vis.fueraMenu();
                                                }

                                                else {
                                                    radioS.cargarEmisora(escogida);
                                                    bandera2 = false;
                                                }
                                            }

                                        }

                                        bRadio = false;
                                        break;

                                    case 5: // Cambiar volumen
                                        boolean bVolumen = true;
                                        while (bVolumen) {
                                            int opVolumen = 0;
                                            do {
                                                try {
                                                    vis = new Vista();
                                                    opVolumen = vis.menuVolumen();
                                                    p = true;
                                                } catch (InputMismatchException ex) {
                                                    System.out.println("\nPor favor, ingresa un numero\n");
                                                    p = false;
                                                }
                                            } while (!p);

                                            if (opVolumen == 1) {
                                                radioS.cambiarVolumen(1);
                                                bVolumen = false;
                                            } else if (opVolumen == 2) {
                                                radioS.cambiarVolumen(2);
                                                bVolumen = false;
                                            } else if (opVolumen == 3) {
                                                bVolumen = false;

                                            } else {
                                                vis.fueraMenu();
                                            }
                                        }
                                        bRadio = false;
                                        break;

                                    case 6: // Salir
                                        bRadio = false;
                                        banderaRadio = false;

                                        break;

                                    default:
                                        vis.fueraMenu();
                                        bRadio = false;
                                        break;
                                    }

                                }
                            }
                            break;

                        case 2: // Reproduccion
                            boolean banderaReproduccion = true;
                            int menuReproduccion = 0;

                            while (banderaReproduccion) {
                                vis.pantallaReproduccion(radioS.getNumeroDeLista(),
                                        radioS.getLista(radioS.getNumeroDeLista()), radioS.getVolumen());

                                do {
                                    try {
                                        vis = new Vista();
                                        menuReproduccion = vis.menuReproduccion();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero\n");
                                        p = false;
                                    }
                                } while (!p);

                                switch (menuReproduccion) {
                                case 1: // Seleccionar lista de reproducción
                                    boolean bandera3 = true;
                                    int numLista = 0;
                                    while (bandera3) {
                                        do {
                                            try {
                                                vis = new Vista();
                                                numLista = vis.seleccionarLista();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero\n");
                                                p = false;
                                            }
                                        } while (!p);

                                        if (numLista > 2) {
                                            vis.fueraMenu();

                                        } else {
                                            vis.miLista(numLista);
                                            radioS.seleccionarLista(numLista);
                                            bandera3 = false;
                                        }

                                    }

                                    break;

                                case 2: // Cambiar canción
                                    boolean bandera4 = true;
                                    while (bandera4) {
                                        int siguienteAnerior = 0;

                                        do {
                                            try {
                                                vis = new Vista();
                                                siguienteAnerior = vis.cambiarCancion();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero\n");
                                                p = false;
                                            }
                                        } while (!p);

                                        if (siguienteAnerior > 2) {
                                            vis.fueraMenu();

                                        } else {
                                            radioS.cambiarCancion(siguienteAnerior);
                                            bandera4 = false;

                                        }

                                    }
                                    break;

                                case 3: // Escuchar canción
                                    boolean bandera5 = true;
                                    while (bandera5) {
                                        int nLista = 0;

                                        do {
                                            try {
                                                vis = new Vista();
                                                nLista = vis.seleccionarLista();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero\n");
                                                p = false;
                                            }
                                        } while (!p);

                                        if (nLista > 2) {
                                            vis.fueraMenu();

                                        } else {
                                            radioS.seleccionarLista(nLista);
                                            int cancion = 0;
                                            vis.listaReproduccion(nLista, radioS.getNombreCancion1(),
                                                    radioS.getAutor1(), radioS.getNombreCancion2(), radioS.getAutor2());

                                            boolean bandera6 = true;

                                            while (bandera6) {
                                                do {
                                                    try {
                                                        vis = new Vista();
                                                        cancion = vis.cancionEscogida();
                                                        p = true;
                                                    } catch (InputMismatchException ex) {
                                                        System.out.println("\nPor favor, ingresa un numero\n");
                                                        p = false;
                                                    }
                                                } while (!p);

                                                if (cancion > 4) {
                                                    vis.fueraMenu();

                                                } else {
                                                    radioS.setContadorCancion(cancion - 1);
                                                    bandera6 = false;
                                                    bandera5 = false;
                                                }

                                            }

                                        }
                                    }
                                    break;

                                case 4: // cambiar volumen
                                    boolean bVolumen = true;
                                    while (bVolumen) {
                                        int opVolumen = 0;
                                        do {
                                            try {
                                                vis = new Vista();
                                                opVolumen = vis.menuVolumen();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero\n");
                                                p = false;
                                            }
                                        } while (!p);

                                        if (opVolumen == 1) {
                                            radioS.cambiarVolumen(1);
                                            bVolumen = false;
                                        } else if (opVolumen == 2) {
                                            radioS.cambiarVolumen(2);
                                            bVolumen = false;
                                        } else if (opVolumen == 3) {
                                            bVolumen = false;

                                        } else {
                                            vis.fueraMenu();
                                        }
                                    }

                                    break;

                                case 5: // Salir
                                    banderaReproduccion = false;

                                    break;

                                default:
                                    vis.fueraMenu();
                                    break;
                                }

                            }

                            break;

                        case 3: // Telefono
                            vis.noTelefono();
                            int telefono = 0;
                            boolean bandera7 = true;

                            while (bandera7) {
                                do {
                                    try {
                                        vis = new Vista();
                                        telefono = vis.Menu3();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero\n");
                                        p = false;
                                    }
                                } while (!p);

                                if (telefono == 1) {
                                    vis.imprimir(radioS.conectarTelefono(telefono));
                                    boolean conectado = true;
                                    int op = 0;
                                    int contacto = 0;
                                    String bA = "Bocinas";
                                    while (conectado) {
                                        vis.pantallaTelefono("Iphone 13", radioS.llamarContacto(contacto), bA,
                                                radioS.getVolumen());

                                        do {
                                            try {
                                                vis = new Vista();
                                                op = vis.Menu4S();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero\n");
                                                p = false;
                                            }
                                        } while (!p);

                                        switch (op) {
                                        case 1: // Mostrar contactos
                                            vis.imprimir("Lista de contactos");
                                            vis.imprimir(radioS.mostrarContactos());

                                            break;
                                        case 2: // Llamar a contacto
                                            vis.imprimir(radioS.mostrarContactos());
                                            boolean bandera8 = true;

                                            while (bandera8) {

                                                do {
                                                    try {
                                                        vis = new Vista();
                                                        contacto = vis.llamar();
                                                        p = true;
                                                    } catch (InputMismatchException ex) {
                                                        System.out.println("\nPor favor, ingresa un numero\n");
                                                        p = false;
                                                    }
                                                } while (!p);

                                                if (contacto > 4) {
                                                    vis.fueraMenu();

                                                } else {
                                                    vis.imprimir(radioS.llamarContacto(contacto));
                                                    bandera8 = false;
                                                }

                                            }
                                            break;
                                        case 3: // Finalizar llamada
                                            contacto = 0;
                                            vis.imprimir(radioS.finalizarLlamada(1));

                                            break;
                                        case 4: // Cambiar a bocinas o auriculares
                                            if (bA == "Bocinas") {
                                                bA = "Auriculares";

                                            } else if (bA == "Auriculares") {
                                                bA = "Bocinas";

                                            }

                                            break;

                                        case 5: // Volumen
                                            boolean bVolumen = true;
                                            while (bVolumen) {
                                                int opVolumen = 0;
                                                do {
                                                    try {
                                                        vis = new Vista();
                                                        opVolumen = vis.menuVolumen();
                                                        p = true;
                                                    } catch (InputMismatchException ex) {
                                                        System.out.println("\nPor favor, ingresa un numero\n");
                                                        p = false;
                                                    }
                                                } while (!p);

                                                if (opVolumen == 1) {
                                                    radioS.cambiarVolumen(1);
                                                    bVolumen = false;
                                                } else if (opVolumen == 2) {
                                                    radioS.cambiarVolumen(2);
                                                    bVolumen = false;
                                                } else if (opVolumen == 3) {
                                                    bVolumen = false;

                                                } else {
                                                    vis.fueraMenu();
                                                }
                                            }

                                            break;

                                        case 6: // Salir
                                            conectado = false;
                                            bandera7 = false;
                                            break;

                                        default:
                                            vis.fueraMenu();
                                            break;
                                        }
                                    }
                                    bandera7 = false;

                                } else if (telefono == 2) {
                                    bandera7 = false;
                                }

                                else {
                                    vis.fueraMenu();
                                }
                            }
                            break;

                        case 4: // Productividad
                            String destinoA = "No hay viaje planificado";
                            boolean bandera9 = true;
                            int opcion = 0;

                            while (bandera9) {
                                vis.pantallaProductividadS(radioS.getDestino(), destinoA, radioS.getVolumen());
                                do {
                                    try {
                                        vis = new Vista();
                                        opcion = vis.viajar();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero\n");
                                        p = false;
                                    }
                                } while (!p);

                                switch (opcion) {
                                case 1:
                                    radioS.setDestino(vis.destino());
                                    break;
                                case 2:
                                    destinoA = radioS.getDestino();
                                    radioS.setDestino("No hay viaje planificado");
                                    break;
                                case 3:
                                    boolean bVolumen = true;
                                    while (bVolumen) {
                                        int opVolumen = 0;
                                        do {
                                            try {
                                                vis = new Vista();
                                                opVolumen = vis.menuVolumen();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero\n");
                                                p = false;
                                            }
                                        } while (!p);

                                        if (opVolumen == 1) {
                                            radioS.cambiarVolumen(1);
                                            bVolumen = false;
                                        } else if (opVolumen == 2) {
                                            radioS.cambiarVolumen(2);
                                            bVolumen = false;
                                        } else if (opVolumen == 3) {
                                            bVolumen = false;

                                        } else {
                                            vis.fueraMenu();
                                        }
                                    }
                                    break;

                                case 4:
                                    bandera9 = false;
                                    break;

                                default:
                                    vis.fueraMenu();
                                    break;
                                }

                            }

                            break;

                        case 5: // Salir
                            bMenu2 = false;
                            break;

                        default:
                            vis.fueraMenu();
                            break;
                        }
                    }

                    break;

                case 2: // Carro tipo A
                    radioA = new RadioA();
                    while (bMenu2) {
                        do {
                            try {
                                vis = new Vista();
                                modoRadio = vis.modoRadio();
                                p = true;
                            } catch (InputMismatchException ex) {
                                System.out.println("\nPor favor, ingresa un numero\n");
                                p = false;
                            }
                        } while (!p);

                        switch (modoRadio) {
                        case 1: // Radio
                            boolean banderaRadio = true;
                            int opRadio = 0;
                            String AM = "FM";

                            while (banderaRadio) {

                                vis.pantallaRadio(radioA.getEmisora(), AM, radioA.getVolumen());

                                do {
                                    try {
                                        vis = new Vista();
                                        opRadio = vis.menuRadio();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero\n");
                                        p = false;
                                    }
                                } while (!p);
                                boolean bRadio = true;

                                while (bRadio) {
                                    vis.pantallaRadio(radioA.getEmisora(), AM, radioA.getVolumen());
                                    switch (opRadio) {
                                    case 1: // Cambiar de FM a AM
                                        if (AM == "FM") {
                                            AM = "AM";
                                        } else {
                                            AM = "FM";
                                        }

                                        bRadio = false;
                                        break;

                                    case 2: // Cambiar emisoras
                                        boolean bemisora = true;
                                        while (bemisora) {
                                            int opEmisora = 0;
                                            do {
                                                try {
                                                    vis = new Vista();
                                                    opEmisora = vis.menuEmisora();
                                                    p = true;
                                                } catch (InputMismatchException ex) {
                                                    System.out.println("\nPor favor, ingresa un numero\n");
                                                    p = false;
                                                }
                                            } while (!p);

                                            if (opEmisora == 1) {
                                                radioA.cambiarEmisora(1);
                                                bemisora = false;
                                            } else if (opEmisora == 2) {
                                                radioA.cambiarEmisora(2);
                                                bemisora = false;
                                            } else if (opEmisora == 3) {
                                                bemisora = false;

                                            } else {
                                                vis.fueraMenu();
                                            }
                                        }

                                        bRadio = false;
                                        break;

                                    case 3: // Guardar emisoras
                                        boolean bGuardar = true;
                                        while (bGuardar) {
                                            double emisora = 0;
                                            do {
                                                try {
                                                    vis = new Vista();
                                                    emisora = vis.guardarEmisora();
                                                    p = true;
                                                } catch (Exception ex) {
                                                    System.out.println("\nPor favor, ingresa un numero\n");
                                                    p = false;
                                                }
                                            } while (!p);

                                            if (emisora > 110.0 || emisora < 80.0) {
                                                vis.fueraMenu();
                                            } else {
                                                radioA.guardarEmisora(emisora);
                                                vis.guardadoExito();
                                                boolean bandera2 = true;
                                                while (bandera2) {
                                                    int op = 0;
                                                    do {
                                                        try {
                                                            vis = new Vista();
                                                            op = vis.otraEmisora();
                                                            p = true;
                                                        } catch (InputMismatchException ex) {
                                                            System.out.println("\nPor favor, ingresa un numero\n");
                                                            p = false;
                                                        }
                                                    } while (!p);

                                                    if (op == 1) {
                                                        bandera2 = false;

                                                    } else if (op == 2) {
                                                        bandera2 = false;
                                                        bGuardar = false;
                                                    }

                                                    else {
                                                        vis.fueraMenu();

                                                    }
                                                }
                                            }

                                        }
                                        bRadio = false;
                                        break;

                                    case 4: // Cargar emisora
                                        vis.emisorasGuardadas(radioA.getEmisorasGuardadas());
                                        if (radioA.getEmisorasGuardadas().size() == 0) {
                                            vis.noEmisoras();

                                        } else {
                                            int escogida = 0;
                                            boolean bandera2 = true;
                                            while (bandera2) {
                                                do {
                                                    try {
                                                        vis = new Vista();
                                                        escogida = vis.escogida();
                                                        p = true;
                                                    } catch (InputMismatchException ex) {
                                                        System.out.println("\nPor favor, ingresa un numero\n");
                                                        p = false;
                                                    }
                                                } while (!p);

                                                if (escogida > radioA.getEmisorasGuardadas().size()) {
                                                    vis.fueraMenu();
                                                }

                                                else {
                                                    radioA.cargarEmisora(escogida);
                                                    bandera2 = false;
                                                }
                                            }

                                        }

                                        bRadio = false;
                                        break;

                                    case 5: // Cambiar volumen
                                        boolean bVolumen = true;
                                        while (bVolumen) {
                                            int opVolumen = 0;
                                            do {
                                                try {
                                                    vis = new Vista();
                                                    opVolumen = vis.menuVolumen();
                                                    p = true;
                                                } catch (InputMismatchException ex) {
                                                    System.out.println("\nPor favor, ingresa un numero\n");
                                                    p = false;
                                                }
                                            } while (!p);

                                            if (opVolumen == 1) {
                                                radioA.cambiarVolumen(1);
                                                bVolumen = false;
                                            } else if (opVolumen == 2) {
                                                radioA.cambiarVolumen(2);
                                                bVolumen = false;
                                            } else if (opVolumen == 3) {
                                                bVolumen = false;

                                            } else {
                                                vis.fueraMenu();
                                            }
                                        }
                                        bRadio = false;
                                        break;

                                    case 6: // Salir
                                        bRadio = false;
                                        banderaRadio = false;

                                        break;

                                    default:
                                        vis.fueraMenu();
                                        bRadio = false;
                                        break;
                                    }

                                }
                            }
                            break;

                        case 2: // Reproduccion
                            boolean banderaReproduccion = true;
                            int menuReproduccion = 0;

                            while (banderaReproduccion) {
                                vis.pantallaReproduccion(radioA.getNumeroDeLista(),
                                        radioA.getLista(radioA.getNumeroDeLista()), radioA.getVolumen());

                                do {
                                    try {
                                        vis = new Vista();
                                        menuReproduccion = vis.menuReproduccion();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero\n");
                                        p = false;
                                    }
                                } while (!p);

                                switch (menuReproduccion) {
                                case 1: // Seleccionar lista de reproducción
                                    boolean bandera3 = true;
                                    int numLista = 0;
                                    while (bandera3) {
                                        do {
                                            try {
                                                vis = new Vista();
                                                numLista = vis.seleccionarLista();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero\n");
                                                p = false;
                                            }
                                        } while (!p);

                                        if (numLista > 2) {
                                            vis.fueraMenu();

                                        } else {
                                            vis.miLista(numLista);
                                            radioA.seleccionarLista(numLista);
                                            bandera3 = false;
                                        }

                                    }

                                    break;

                                case 2: // Cambiar canción
                                    boolean bandera4 = true;
                                    while (bandera4) {
                                        int siguienteAnerior = 0;

                                        do {
                                            try {
                                                vis = new Vista();
                                                siguienteAnerior = vis.cambiarCancion();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero\n");
                                                p = false;
                                            }
                                        } while (!p);

                                        if (siguienteAnerior > 2) {
                                            vis.fueraMenu();

                                        } else {
                                            radioA.cambiarCancion(siguienteAnerior);
                                            bandera4 = false;

                                        }

                                    }
                                    break;

                                case 3: // Escuchar canción
                                    boolean bandera5 = true;
                                    while (bandera5) {
                                        int nLista = 0;

                                        do {
                                            try {
                                                vis = new Vista();
                                                nLista = vis.seleccionarLista();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero\n");
                                                p = false;
                                            }
                                        } while (!p);

                                        if (nLista > 2) {
                                            vis.fueraMenu();

                                        } else {
                                            radioA.seleccionarLista(nLista);
                                            int cancion = 0;
                                            vis.listaReproduccion(nLista, radioA.getNombreCancion1(),
                                                    radioA.getAutor1(), radioA.getNombreCancion2(), radioA.getAutor2());

                                            boolean bandera6 = true;

                                            while (bandera6) {
                                                do {
                                                    try {
                                                        vis = new Vista();
                                                        cancion = vis.cancionEscogida();
                                                        p = true;
                                                    } catch (InputMismatchException ex) {
                                                        System.out.println("\nPor favor, ingresa un numero\n");
                                                        p = false;
                                                    }
                                                } while (!p);

                                                if (cancion > 4) {
                                                    vis.fueraMenu();

                                                } else {
                                                    radioA.setContadorCancion(cancion - 1);
                                                    bandera6 = false;
                                                    bandera5 = false;
                                                }

                                            }

                                        }
                                    }
                                    break;

                                case 4: // cambiar volumen
                                    boolean bVolumen = true;
                                    while (bVolumen) {
                                        int opVolumen = 0;
                                        do {
                                            try {
                                                vis = new Vista();
                                                opVolumen = vis.menuVolumen();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero\n");
                                                p = false;
                                            }
                                        } while (!p);

                                        if (opVolumen == 1) {
                                            radioA.cambiarVolumen(1);
                                            bVolumen = false;
                                        } else if (opVolumen == 2) {
                                            radioA.cambiarVolumen(2);
                                            bVolumen = false;
                                        } else if (opVolumen == 3) {
                                            bVolumen = false;

                                        } else {
                                            vis.fueraMenu();
                                        }
                                    }

                                    break;

                                case 5: // Salir
                                    banderaReproduccion = false;

                                    break;

                                default:
                                    vis.fueraMenu();
                                    break;
                                }

                            }

                            break;

                        case 3: // Telefono
                            vis.noTelefono();
                            int telefono = 0;
                            boolean bandera7 = true;

                            while (bandera7) {
                                do {
                                    try {
                                        vis = new Vista();
                                        telefono = vis.Menu3();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero\n");
                                        p = false;
                                    }
                                } while (!p);

                                if (telefono == 1) {
                                    vis.imprimir(radioA.conectarTelefono(telefono));

                                    boolean conectado = true;
                                    int op = 0;
                                    int contacto = 0;
                                    int contactoUltimo = 0;

                                    while (conectado) {
                                        vis.pantallaTelefonoA("Iphone 13", radioA.llamarContacto(contacto),
                                                radioA.getVolumen());

                                        do {
                                            try {
                                                vis = new Vista();
                                                op = vis.Menu4A();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero\n");
                                                p = false;
                                            }
                                        } while (!p);

                                        switch (op) {
                                        case 1: // Mostrar contactos
                                            vis.imprimir("Lista de contactos");
                                            vis.imprimir(radioA.mostrarContactos());

                                            break;
                                        case 2: // Llamar a contacto
                                            vis.imprimir(radioA.mostrarContactos());
                                            boolean bandera8 = true;

                                            while (bandera8) {

                                                do {
                                                    try {
                                                        vis = new Vista();
                                                        contacto = vis.llamar();
                                                        p = true;
                                                    } catch (InputMismatchException ex) {
                                                        System.out.println("\nPor favor, ingresa un numero\n");
                                                        p = false;
                                                    }
                                                } while (!p);

                                                if (contacto > 4) {
                                                    vis.fueraMenu();

                                                } else {
                                                    vis.imprimir(radioA.llamarContacto(contacto));
                                                    contactoUltimo = contacto;
                                                    bandera8 = false;
                                                }

                                            }
                                            break;
                                        case 3: // Finalizar llamada
                                            contacto = 0;
                                            vis.imprimir(radioA.finalizarLlamada(1));

                                            break;
                                        case 4: // Llamar al ultimo contacto que se llamo
                                            vis.imprimir(radioA.llamarContacto(contactoUltimo));
                                            contacto = contactoUltimo;

                                            break;

                                        case 5: // Volumen
                                            boolean bVolumen = true;
                                            while (bVolumen) {
                                                int opVolumen = 0;
                                                do {
                                                    try {
                                                        vis = new Vista();
                                                        opVolumen = vis.menuVolumen();
                                                        p = true;
                                                    } catch (InputMismatchException ex) {
                                                        System.out.println("\nPor favor, ingresa un numero\n");
                                                        p = false;
                                                    }
                                                } while (!p);

                                                if (opVolumen == 1) {
                                                    radioA.cambiarVolumen(1);
                                                    bVolumen = false;
                                                } else if (opVolumen == 2) {
                                                    radioA.cambiarVolumen(2);
                                                    bVolumen = false;
                                                } else if (opVolumen == 3) {
                                                    bVolumen = false;

                                                } else {
                                                    vis.fueraMenu();
                                                }
                                            }

                                            break;

                                        case 6: // Salir
                                            conectado = false;
                                            bandera7 = false;
                                            break;

                                        default:
                                            vis.fueraMenu();
                                            break;
                                        }
                                    }
                                    bandera7 = false;

                                } else if (telefono == 2) {
                                    bandera7 = false;
                                }

                                else {
                                    vis.fueraMenu();
                                }

                            }

                            break;

                        case 4: // Productividad
                            boolean bandera10 = true;
                            int contacto = 0;
                            int opcion2 = 0;

                            while (bandera10) {
                                vis.pantallaProductividadA(contacto, radioA.getVolumen());
                                do {
                                    try {
                                        vis = new Vista();
                                        opcion2 = vis.productividadA();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero\n");
                                        p = false;
                                    }
                                } while (!p);

                                switch (opcion2) {
                                case 1:
                                    vis.imprimir(radioA.mostrarContactos());
                                    boolean b = true;
                                    while (b) {

                                        do {
                                            try {
                                                vis = new Vista();
                                                contacto = vis.mostrar();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero\n");
                                                p = false;
                                            }
                                        } while (!p);

                                        if (contacto > 4) {
                                            vis.fueraMenu();
                                        } else {
                                            b = false;
                                        }
                                    }

                                    break;
                                case 2:
                                    boolean bVolumen = true;
                                    while (bVolumen) {
                                        int opVolumen = 0;
                                        do {
                                            try {
                                                vis = new Vista();
                                                opVolumen = vis.menuVolumen();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero\n");
                                                p = false;
                                            }
                                        } while (!p);

                                        if (opVolumen == 1) {
                                            radioA.cambiarVolumen(1);
                                            bVolumen = false;
                                        } else if (opVolumen == 2) {
                                            radioA.cambiarVolumen(2);
                                            bVolumen = false;
                                        } else if (opVolumen == 3) {
                                            bVolumen = false;

                                        } else {
                                            vis.fueraMenu();
                                        }
                                    }
                                    break;

                                case 3:
                                    bandera10 = false;
                                    break;

                                default:
                                    vis.fueraMenu();
                                    break;
                                }

                            }
                            break;

                        case 5: // Salir
                            bMenu2 = false;
                            break;

                        default:
                            vis.fueraMenu();
                            break;
                        }
                    }

                    break;

                case 3: // Carro tipo C
                    radioC = new RadioC();

                    while (bMenu2) {
                        do {
                            try {
                                vis = new Vista();
                                modoRadio = vis.modoRadio();
                                p = true;
                            } catch (InputMismatchException ex) {
                                System.out.println("\nPor favor, ingresa un numero\n");
                                p = false;
                            }
                        } while (!p);

                        switch (modoRadio) {
                        case 1: // Radio
                            boolean banderaRadio = true;
                            int opRadio = 0;
                            String AM = "FM";

                            while (banderaRadio) {

                                vis.pantallaRadio(radioC.getEmisora(), AM, radioC.getVolumen());

                                do {
                                    try {
                                        vis = new Vista();
                                        opRadio = vis.menuRadio();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero\n");
                                        p = false;
                                    }
                                } while (!p);
                                boolean bRadio = true;

                                while (bRadio) {
                                    vis.pantallaRadio(radioC.getEmisora(), AM, radioC.getVolumen());
                                    switch (opRadio) {
                                    case 1: // Cambiar de FM a AM
                                        if (AM == "FM") {
                                            AM = "AM";
                                        } else {
                                            AM = "FM";
                                        }

                                        bRadio = false;
                                        break;

                                    case 2: // Cambiar emisoras
                                        boolean bemisora = true;
                                        while (bemisora) {
                                            int opEmisora = 0;
                                            do {
                                                try {
                                                    vis = new Vista();
                                                    opEmisora = vis.menuEmisora();
                                                    p = true;
                                                } catch (InputMismatchException ex) {
                                                    System.out.println("\nPor favor, ingresa un numero\n");
                                                    p = false;
                                                }
                                            } while (!p);

                                            if (opEmisora == 1) {
                                                radioC.cambiarEmisora(1);
                                                bemisora = false;
                                            } else if (opEmisora == 2) {
                                                radioC.cambiarEmisora(2);
                                                bemisora = false;
                                            } else if (opEmisora == 3) {
                                                bemisora = false;

                                            } else {
                                                vis.fueraMenu();
                                            }
                                        }

                                        bRadio = false;
                                        break;

                                    case 3: // Guardar emisoras
                                        boolean bGuardar = true;
                                        while (bGuardar) {
                                            double emisora = 0;
                                            do {
                                                try {
                                                    vis = new Vista();
                                                    emisora = vis.guardarEmisora();
                                                    p = true;
                                                } catch (Exception ex) {
                                                    System.out.println("\nPor favor, ingresa un numero\n");
                                                    p = false;
                                                }
                                            } while (!p);

                                            if (emisora > 110.0 || emisora < 80.0) {
                                                vis.fueraMenu();
                                            } else {
                                                radioC.guardarEmisora(emisora);
                                                vis.guardadoExito();
                                                boolean bandera2 = true;
                                                while (bandera2) {
                                                    int op = 0;
                                                    do {
                                                        try {
                                                            vis = new Vista();
                                                            op = vis.otraEmisora();
                                                            p = true;
                                                        } catch (InputMismatchException ex) {
                                                            System.out.println("\nPor favor, ingresa un numero\n");
                                                            p = false;
                                                        }
                                                    } while (!p);

                                                    if (op == 1) {
                                                        bandera2 = false;

                                                    } else if (op == 2) {
                                                        bandera2 = false;
                                                        bGuardar = false;
                                                    }

                                                    else {
                                                        vis.fueraMenu();

                                                    }
                                                }
                                            }

                                        }
                                        bRadio = false;
                                        break;

                                    case 4: // Cargar emisora
                                        vis.emisorasGuardadas(radioC.getEmisorasGuardadas());
                                        if (radioC.getEmisorasGuardadas().size() == 0) {
                                            vis.noEmisoras();

                                        } else {
                                            int escogida = 0;
                                            boolean bandera2 = true;
                                            while (bandera2) {
                                                do {
                                                    try {
                                                        vis = new Vista();
                                                        escogida = vis.escogida();
                                                        p = true;
                                                    } catch (InputMismatchException ex) {
                                                        System.out.println("\nPor favor, ingresa un numero\n");
                                                        p = false;
                                                    }
                                                } while (!p);

                                                if (escogida > radioC.getEmisorasGuardadas().size()) {
                                                    vis.fueraMenu();
                                                }

                                                else {
                                                    radioC.cargarEmisora(escogida);
                                                    bandera2 = false;
                                                }
                                            }

                                        }

                                        bRadio = false;
                                        break;

                                    case 5: // Cambiar volumen
                                        boolean bVolumen = true;
                                        while (bVolumen) {
                                            int opVolumen = 0;
                                            do {
                                                try {
                                                    vis = new Vista();
                                                    opVolumen = vis.menuVolumen();
                                                    p = true;
                                                } catch (InputMismatchException ex) {
                                                    System.out.println("\nPor favor, ingresa un numero\n");
                                                    p = false;
                                                }
                                            } while (!p);

                                            if (opVolumen == 1) {
                                                radioC.cambiarVolumen(1);
                                                bVolumen = false;
                                            } else if (opVolumen == 2) {
                                                radioC.cambiarVolumen(2);
                                                bVolumen = false;
                                            } else if (opVolumen == 3) {
                                                bVolumen = false;

                                            } else {
                                                vis.fueraMenu();
                                            }
                                        }
                                        bRadio = false;
                                        break;

                                    case 6: // Salir
                                        bRadio = false;
                                        banderaRadio = false;

                                        break;

                                    default:
                                        vis.fueraMenu();
                                        bRadio = false;
                                        break;
                                    }

                                }
                            }
                            break;

                        case 2: // Reproduccion
                            boolean banderaReproduccion = true;
                            int menuReproduccion = 0;

                            while (banderaReproduccion) {
                                vis.pantallaReproduccion(radioC.getNumeroDeLista(),
                                        radioC.getLista(radioC.getNumeroDeLista()), radioC.getVolumen());

                                do {
                                    try {
                                        vis = new Vista();
                                        menuReproduccion = vis.menuReproduccion();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero\n");
                                        p = false;
                                    }
                                } while (!p);

                                switch (menuReproduccion) {
                                case 1: // Seleccionar lista de reproducción
                                    boolean bandera3 = true;
                                    int numLista = 0;
                                    while (bandera3) {
                                        do {
                                            try {
                                                vis = new Vista();
                                                numLista = vis.seleccionarLista();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero\n");
                                                p = false;
                                            }
                                        } while (!p);

                                        if (numLista > 2) {
                                            vis.fueraMenu();

                                        } else {
                                            vis.miLista(numLista);
                                            radioC.seleccionarLista(numLista);
                                            bandera3 = false;
                                        }

                                    }

                                    break;

                                case 2: // Cambiar canción
                                    boolean bandera4 = true;
                                    while (bandera4) {
                                        int siguienteAnerior = 0;

                                        do {
                                            try {
                                                vis = new Vista();
                                                siguienteAnerior = vis.cambiarCancion();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero\n");
                                                p = false;
                                            }
                                        } while (!p);

                                        if (siguienteAnerior > 2) {
                                            vis.fueraMenu();

                                        } else {
                                            radioC.cambiarCancion(siguienteAnerior);
                                            bandera4 = false;

                                        }

                                    }
                                    break;

                                case 3: // Escuchar canción
                                    boolean bandera5 = true;
                                    while (bandera5) {
                                        int nLista = 0;

                                        do {
                                            try {
                                                vis = new Vista();
                                                nLista = vis.seleccionarLista();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero\n");
                                                p = false;
                                            }
                                        } while (!p);

                                        if (nLista > 2) {
                                            vis.fueraMenu();

                                        } else {
                                            radioC.seleccionarLista(nLista);
                                            int cancion = 0;
                                            vis.listaReproduccion(nLista, radioC.getNombreCancion1(),
                                                    radioC.getAutor1(), radioC.getNombreCancion2(), radioC.getAutor2());

                                            boolean bandera6 = true;

                                            while (bandera6) {
                                                do {
                                                    try {
                                                        vis = new Vista();
                                                        cancion = vis.cancionEscogida();
                                                        p = true;
                                                    } catch (InputMismatchException ex) {
                                                        System.out.println("\nPor favor, ingresa un numero\n");
                                                        p = false;
                                                    }
                                                } while (!p);

                                                if (cancion > 4) {
                                                    vis.fueraMenu();

                                                } else {
                                                    radioC.setContadorCancion(cancion - 1);
                                                    bandera6 = false;
                                                    bandera5 = false;
                                                }

                                            }

                                        }
                                    }
                                    break;

                                case 4: // cambiar volumen
                                    boolean bVolumen = true;
                                    while (bVolumen) {
                                        int opVolumen = 0;
                                        do {
                                            try {
                                                vis = new Vista();
                                                opVolumen = vis.menuVolumen();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero\n");
                                                p = false;
                                            }
                                        } while (!p);

                                        if (opVolumen == 1) {
                                            radioC.cambiarVolumen(1);
                                            bVolumen = false;
                                        } else if (opVolumen == 2) {
                                            radioC.cambiarVolumen(2);
                                            bVolumen = false;
                                        } else if (opVolumen == 3) {
                                            bVolumen = false;

                                        } else {
                                            vis.fueraMenu();
                                        }
                                    }

                                    break;

                                case 5: // Salir
                                    banderaReproduccion = false;

                                    break;

                                default:
                                    vis.fueraMenu();
                                    break;
                                }

                            }

                            break;

                        case 3: // Telefono
                            vis.noTelefono();
                            int telefono = 0;
                            boolean bandera7 = true;

                            while (bandera7) {
                                do {
                                    try {
                                        vis = new Vista();
                                        telefono = vis.Menu3();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero\n");
                                        p = false;
                                    }
                                } while (!p);

                                if (telefono == 1) {
                                    vis.imprimir(radioC.conectarTelefono(telefono));

                                    boolean conectado = true;
                                    int op = 0;
                                    int contacto = 0;
                                    String espera = "No se tiene ninguna llamada en espera";

                                    while (conectado) {
                                        vis.pantallaTelefonoC("Iphone 13", radioC.llamarContacto(contacto), espera,
                                                radioC.getVolumen());

                                        do {
                                            try {
                                                vis = new Vista();
                                                op = vis.Menu4C();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero\n");
                                                p = false;
                                            }
                                        } while (!p);

                                        switch (op) {
                                        case 1: // Mostrar contactos
                                            vis.imprimir("Lista de contactos");
                                            vis.imprimir(radioC.mostrarContactos());

                                            break;
                                        case 2: // Llamar a contacto
                                            vis.imprimir(radioC.mostrarContactos());
                                            boolean bandera8 = true;

                                            while (bandera8) {

                                                do {
                                                    try {
                                                        vis = new Vista();
                                                        contacto = vis.llamar();
                                                        p = true;
                                                    } catch (InputMismatchException ex) {
                                                        System.out.println("\nPor favor, ingresa un numero\n");
                                                        p = false;
                                                    }
                                                } while (!p);

                                                if (contacto > 4) {
                                                    vis.fueraMenu();

                                                } else {
                                                    vis.imprimir(radioC.llamarContacto(contacto));
                                                    bandera8 = false;
                                                }

                                            }
                                            break;
                                        case 3: // Finalizar llamada
                                            contacto = 0;
                                            espera = "No se tiene ninguna llamada en espera";
                                            vis.imprimir(radioC.finalizarLlamada(1));

                                            break;
                                        case 4: // Colocar llamada en espera
                                            if (contacto > 0 && espera == "No se tiene ninguna llamada en espera") {
                                                // vis.imprimir(radioC.cambiarLlamadaEspera(1));
                                                espera = "La llamada se encuentra en espera";

                                            } else if (contacto > 0 && espera == "La llamada se encuentra en espera") {
                                                espera = "No se tiene ninguna llamada en espera";

                                            }

                                            break;

                                        case 5: // Volumen
                                            boolean bVolumen = true;
                                            while (bVolumen) {
                                                int opVolumen = 0;
                                                do {
                                                    try {
                                                        vis = new Vista();
                                                        opVolumen = vis.menuVolumen();
                                                        p = true;
                                                    } catch (InputMismatchException ex) {
                                                        System.out.println("\nPor favor, ingresa un numero\n");
                                                        p = false;
                                                    }
                                                } while (!p);

                                                if (opVolumen == 1) {
                                                    radioC.cambiarVolumen(1);
                                                    bVolumen = false;
                                                } else if (opVolumen == 2) {
                                                    radioC.cambiarVolumen(2);
                                                    bVolumen = false;
                                                } else if (opVolumen == 3) {
                                                    bVolumen = false;

                                                } else {
                                                    vis.fueraMenu();
                                                }
                                            }

                                            break;

                                        case 6: // Salir
                                            conectado = false;
                                            bandera7 = false;
                                            break;

                                        default:
                                            vis.fueraMenu();
                                            break;
                                        }
                                    }
                                    bandera7 = false;

                                } else if (telefono == 2) {
                                    bandera7 = false;
                                }

                                else {
                                    vis.fueraMenu();
                                }

                            }

                            break;

                        case 4: // Productividad
                            boolean aa = true;
                            String tiempo = radioC.pronosticoTiempo(1);

                            while (aa) {

                                vis.pantallaProductividadC(tiempo, radioC.getVolumen());
                                int ya = 0;

                                do {
                                    try {
                                        vis = new Vista();
                                        ya = vis.tiempo();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero\n");
                                        p = false;
                                    }
                                } while (!p);

                                switch (ya) {
                                case 1:
                                    tiempo = radioC.pronosticoTiempo(1);
                                    break;
                                case 2:
                                    boolean bVolumen = true;
                                    while (bVolumen) {
                                        int opVolumen = 0;
                                        do {
                                            try {
                                                vis = new Vista();
                                                opVolumen = vis.menuVolumen();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero\n");
                                                p = false;
                                            }
                                        } while (!p);

                                        if (opVolumen == 1) {
                                            radioC.cambiarVolumen(1);
                                            bVolumen = false;
                                        } else if (opVolumen == 2) {
                                            radioC.cambiarVolumen(2);
                                            bVolumen = false;
                                        } else if (opVolumen == 3) {
                                            bVolumen = false;

                                        } else {
                                            vis.fueraMenu();
                                        }
                                    }
                                    break;

                                case 3:
                                    aa = false;
                                    break;

                                default:
                                    vis.fueraMenu();
                                    break;
                                }

                            }
                            break;

                        case 5: // Salir
                            bMenu2 = false;
                            break;

                        default:
                            vis.fueraMenu();
                            break;
                        }
                    }

                    break;

                case 4: // Salir
                    encendido = false;
                    salir = true;
                    break;

                default:
                    vis.fueraMenu();
                    break;
                }

            }

        }
        vis.Salida();
    }

}

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

                            break;

                        case 3: // Telefono

                            break;

                        case 4: // Productividad

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

                            break;

                        case 3: // Telefono

                            break;

                        case 4: // Productividad

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

                            break;

                        case 3: // Telefono

                            break;

                        case 4: // Productividad

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

package EscapeRoom;

import java.util.Arrays;
import java.util.Scanner;

import static EscapeRoom.Main.Pistas;
import static EscapeRoom.Main.Salas;

public class Code {
    public static void crearSala() {
        Scanner sc = new Scanner(System.in);

        //.....NOMBRE
        int eleccionNombre = 0;
        System.out.println("Introduzca el nombre de la sala: ");
        String nombreSalaIntroducido = sc.nextLine();
        do {
            System.out.println("¿El nombre introducido es correcto? --> " + nombreSalaIntroducido +
                    "SI --> 1 // NO --> 2");
            eleccionNombre = sc.nextInt();
            //Necesario limpiar Scanner para que no salte error!!
            System.out.println("Presione nuevamente Enter: ");
            nombreSalaIntroducido = sc.nextLine();
            if (eleccionNombre != 1) {
                nombreSalaIntroducido = sc.nextLine();
                System.out.println("Indique nuevamente el nombre: ");
                nombreSalaIntroducido = sc.nextLine();
            }
        } while (eleccionNombre != 1);

        //.....ID DE LA SALA

        int eleccionIdSala = 0;
        int idSalaIntroducido;
        do {
            System.out.println("Introduce el id que desees darle.(Debe de ser un numero entero: ");
            idSalaIntroducido = sc.nextInt();
            System.out.println("¿El id introducido es correcto? --> " + idSalaIntroducido +
                    "SI --> 1 // NO --> 2");
            eleccionIdSala = sc.nextInt();
        } while (eleccionIdSala != 1);

        //.....DIFICULTAD
        int eleccionDificultad = 0;
        int nivelDificultadIntroducido;
        do {
            System.out.println("Seleccione la dificultad del 1 y el 5: ");
            nivelDificultadIntroducido = sc.nextInt();
            System.out.println("Quieres que la dificultad sea nivel " + nivelDificultadIntroducido +
                    "\nSI --> 1\n NO --> 2");
            eleccionDificultad = sc.nextInt();
        } while (eleccionDificultad != 1);

        //.....PRECIO
        int eleccionPrecio = 0;
        System.out.println("Indique el precio en formato XX.XXX,XX: ");
        float precioSalaIntroducido = sc.nextFloat();
        do {
            System.out.println("Valor de la sala --> " + precioSalaIntroducido +
                    "SI --> 1 // NO --> 2");
            eleccionPrecio = sc.nextInt();
            if (eleccionPrecio != 1) {
                System.out.println("Indique nuevamente el valor: ");
                precioSalaIntroducido = sc.nextFloat();
                eleccionPrecio = 0;
            }
        } while (eleccionPrecio != 1);
        SalaTematica salaTematica = new SalaTematica(precioSalaIntroducido, nivelDificultadIntroducido, nombreSalaIntroducido,
                idSalaIntroducido);
        Salas.add(salaTematica);
        salaTematica.toString();
    }

    public static void anyadirPista() {
        Scanner sc = new Scanner(System.in);
        //.....ID INVENTARIO
        int eleccionIdInventario = 0;
        do {
            System.out.println("Introduce el id que desees darle.(Debe de ser un numero entero: ");
            int idPistaIntroducido = sc.nextInt();
            System.out.println("¿El id introducido es correcto? --> " + idPistaIntroducido +
                    "SI --> 1 // NO --> 2");
            eleccionIdInventario = sc.nextInt();
        } while (eleccionIdInventario != 1);

        //.....NOMBRE
        int eleccionNombre = 0;
        System.out.println("Introduzca el nombre de la pista: ");
        String nombrePistaIntroducido = sc.nextLine();
        do {
            System.out.println("¿El nombre introducido es correcto? --> " + nombrePistaIntroducido +
                    "SI --> 1 // NO --> 2");
            eleccionNombre = sc.nextInt();
            //Necesario limpiar Scanner para que no salte error!!
            System.out.println("Presione nuevamente Enter: ");
            nombrePistaIntroducido = sc.nextLine();
            if (eleccionNombre != 1) {
                nombrePistaIntroducido = sc.nextLine();
                System.out.println("Indique nuevamente el nombre: ");
                nombrePistaIntroducido = sc.nextLine();
            }
        } while (eleccionNombre != 1);

        //.....PRECIO
        int eleccionPrecio = 0;
        System.out.println("Indique el precio en formato XX.XXX,XX sin IVA: ");
        float precioPistaIntroducido = sc.nextFloat();
        do {
            System.out.println("Valor de la pista --> " + precioPistaIntroducido +
                    "SI --> 1 // NO --> 2");
            eleccionPrecio = sc.nextInt();
            if (eleccionPrecio != 1) {
                System.out.println("Indique nuevamente el valor: ");
                precioPistaIntroducido = sc.nextFloat();
                eleccionPrecio = 0;
            }
        } while (eleccionPrecio != 1);

        //.....ID de la SALA
        boolean encontrado = false;
        int idSalaIntroducido;
        do {
            System.out.println("Introduce el id de la sala a la que pertenece");
            idSalaIntroducido = sc.nextInt();
            for (SalaTematica sala : Salas) {
                if (sala.getIdSala() == idSalaIntroducido) {
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                System.out.println("El id de sala está en la lista.");
            } else {
                System.out.println("El id de sala no está en la lista.");
            }
        } while (!encontrado);

        //.....TIEMPO ESTIMADO
        int eleccionTiempo = 0;
        System.out.println("Indique el tiempo estimado en formato hora(HH.MM): ");
        float tiempoEstimadoPistaIntroducido = sc.nextFloat();
        do {
            System.out.println("Teimpo estimado de la pista --> " + tiempoEstimadoPistaIntroducido +
                    "SI --> 1 // NO --> 2");
            eleccionPrecio = sc.nextInt();
            if (eleccionPrecio != 1) {
                System.out.println("Indique nuevamente tiempo: ");
                precioPistaIntroducido = sc.nextFloat();
                eleccionPrecio = 0;
            }
        } while (eleccionPrecio != 1);
        Pista pista = new Pista(eleccionIdInventario, nombrePistaIntroducido, precioPistaIntroducido, idSalaIntroducido, tiempoEstimadoPistaIntroducido);
        Pistas.add(pista);
    }

    public static void anyadirObjeto(){
        Scanner sc = new Scanner(System.in);
        //.....ID INVENTARIO
        System.out.println("Introduce ahora el id que desees darle.(Debe de ser un numero entero del 1-100");
        int idObjetoIntroducido = sc.nextInt();
        do {
            System.out.println("El número introducido debe de ser del 1-100. Vuelva a intentarlo: ");
            idObjetoIntroducido = sc.nextInt();
        } while (idObjetoIntroducido < 1 && idObjetoIntroducido > 100);

        //.....NOMBRE
        int eleccionNombre = 0;
        System.out.println("Introduzca el nombre de la pista: ");
        String nombreObjetoIntroducido = sc.nextLine();
        do {
            System.out.println("¿El nombre introducido es correcto? --> " + nombreObjetoIntroducido +
                    "SI --> 1 // NO --> 2");
            eleccionNombre = sc.nextInt();
            //Necesario limpiar Scanner para que no salte error!!
            System.out.println("Presione nuevamente Enter: ");
            nombreObjetoIntroducido = sc.nextLine();
            if (eleccionNombre != 1){
                nombreObjetoIntroducido = sc.nextLine();
                System.out.println("Indique nuevamente el nombre: ");
                nombreObjetoIntroducido = sc.nextLine();
            }
        } while (eleccionNombre != 1);

        //.....PRECIO
        int eleccionPrecio = 0;
        System.out.println("Indique el precio en formato XX.XXX,XX sin IVA: ");
        float precioObjetoIntroducido = sc.nextFloat();
        do {
            System.out.println("Valor de la pista --> " + precioObjetoIntroducido +
                    "SI --> 1 // NO --> 2");
            eleccionPrecio = sc.nextInt();
            if (eleccionPrecio != 1) {
                System.out.println("Indique nuevamente el valor: ");
                precioObjetoIntroducido = sc.nextFloat();
                eleccionPrecio = 0;
            }
        }while (eleccionPrecio != 1);

        //.....ID de la SALA
        boolean encontrado = false;
        do {
            System.out.println("Introduce el id de la sala a la que pertenece");
            int idSalaIntroducido = sc.nextInt();
            for (SalaTematica sala : Salas) {
                if (sala.getIdSala() == idSalaIntroducido) {
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                System.out.println("El id de sala está en la lista.");
            } else {
                System.out.println("El id de sala no está en la lista.");
            }
        } while (!encontrado);

        //.....TIPO DE MATERIAL
        int eleccionMaterial = 0;
        System.out.println("Introduzca el nombre de la pista: ");
        String materialObjetoIntroducido = sc.nextLine();
        do {
            System.out.println("¿El nombre introducido es correcto? --> " + materialObjetoIntroducido +
                    "SI --> 1 // NO --> 2");
            eleccionMaterial = sc.nextInt();
            //Necesario limpiar Scanner para que no salte error!!
            System.out.println("Presione nuevamente Enter: ");
            materialObjetoIntroducido = sc.nextLine();
            if (eleccionMaterial != 1){
                materialObjetoIntroducido = sc.nextLine();
                System.out.println("Indique nuevamente el nombre: ");
                materialObjetoIntroducido = sc.nextLine();
            }
        } while (eleccionMaterial != 1);
    }

}


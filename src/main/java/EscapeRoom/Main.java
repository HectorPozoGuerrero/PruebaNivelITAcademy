package EscapeRoom;

import java.util.ArrayList;
import java.util.Scanner;

import static EscapeRoom.Code.*;

public class Main {

    static ArrayList<SalaTematica> Salas = new ArrayList<SalaTematica>();
    static ArrayList<Pista> Pistas = new ArrayList<Pista>();
    static ArrayList<Objeto> objetos = new ArrayList<Objeto>();

    public static void main(String[] args) {

        int eleccion = 0;
        Scanner sc1 = new Scanner(System.in);
        do{
            System.out.println("*MENU DE SELECCIÓN*" +
                                "\n1 --> CREAR NUEVA SALA" +
                                        "\n2 --> AÑADIR PISTA A SALA ESPECÍFICA" +
                                        "\n3 --> AÑADIR OBJETO A SALA ESPECÍFICA" +
                                        "\n4 --> MOSTRAR INVENTARIO" +
                                        "\n5 --> RETIRAR PISTA/OBJETO DEL INVENTARIO" +
                                        "\n6 --> SALIR");
            eleccion = sc1.nextInt();
            switch (eleccion){
                case 1:
                    crearSala();
                    break;
                case 2:
                    anyadirPista();
                    break;
                case 3:
                    anyadirObjeto();
                    break;
                case 4:
                    System.out.println("*LAMENTO COMUNICAR QUE DICHA OPCIÓN AÚN NO ESTÁ IMPLEMENTADA*");
                    break;
                case 5:
                    System.out.println("Lista de Salas:");
                    for (int i = 0; i < Salas.size(); i++) {
                        System.out.println((i + 1) + ". Id de Sala: " + Salas.get(i).getIdSala());
                    }
                    break;
                default:
                    System.out.println("Opción incorrecta! Vuelva a provar:");
            }
        } while (eleccion != 6);
        System.out.println("Cerrando programa....\n¡Adiós!");
    }
}

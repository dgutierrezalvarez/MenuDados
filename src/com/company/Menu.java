package com.company;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        menuPrincipal();
    }

    private void menuPrincipal() {
        int opcion;
        int contWin = 0;
        int contLose = 0;

        do {

            System.out.println("------------------------------------------ ");
            System.out.println("Selecciona el juego al que desea jugar!!");

            System.out.println();

            System.out.println("1. Parchís");
            System.out.println("2. Dados");
            System.out.println("3. Pac Man");
            System.out.println("0. Salir");

            System.out.println();

            System.out.println("--->");
            opcion = scanner.nextInt();



            switch (opcion) {

                case 1:
                    proximamente();
                    break;
                case 2:
                    JuegoDados juegoDados = new JuegoDados();
                    juegoDados.juego();
                    boolean ganado = juegoDados.jugar();

                    System.out.println(juegoDados);
                    System.out.println();

                    if (ganado) {
                        System.out.println("Has Ganado");
                        contWin++;
                    } else{
                        System.out.println("Sigue intentando");
                        contLose++;
                    }

                    break;
                case 3:
                    proximamente();
                    break;
                case 0:
                    System.out.println("Veces ganadas: " + contWin );
                    System.out.println("Veces perdidas: " + contLose );
                    break;
                default:
                    System.out.println("ATENCION NO HAS SELECCIONADO NIGUNA OPCION");
            }
        } while (opcion != 0);
    }

    void proximamente() {
        System.out.println("Fuera de servicio");
    }
}


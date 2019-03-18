package com.codebay.EjercicioInterfaces;

import com.codebay.EjercicioTeclado.Teclado;

public class Aplicacion {

    public static Jugable[] iniciaJuegos (){
        JuegoAdivinaNumero juego = new JuegoAdivinaNumero(3, 5);
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3, 6);
        JuegoAdivinaNumero juegoImpar = new JuegoAdivinaNumero(3, 7);
        Jugable arrayJuegos[] = {juego, juegoPar, juegoImpar};
        return arrayJuegos;
    }

    public static Jugable menu (){
        Jugable juegos[] = iniciaJuegos();
        int eleccion;
        do{
            System.out.println("Seleccione el juego deseado: ");
            System.out.println("0.- Adivina un número.");
            System.out.println("1.- Adivina un número par.");
            System.out.println("2.- Adivina un número impar.");
            System.out.print("Introduzca la opción deseada: ");
            eleccion = Teclado.leeEntero();

        }while((eleccion < 0) || (eleccion >= juegos.length));
        return juegos[eleccion];
    }

    public static void main (String args[]){
        String respuesta;
        do {
            Jugable juegoEscogido = menu();
            juegoEscogido.muestraNombre();
            juegoEscogido.muestraInfo();
            juegoEscogido.juega();

            System.out.print("\n¿Desea volver a jugar? (y/n): ");
            respuesta = Teclado.leeCadena();
        }while(respuesta.equals("y"));
    }
}

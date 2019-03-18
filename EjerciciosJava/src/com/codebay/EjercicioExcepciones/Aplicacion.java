package com.codebay.EjercicioExcepciones;

import com.codebay.EjercicioApi.*;
import com.codebay.EjercicioTeclado.Teclado;

import java.util.Vector;

public class Aplicacion {

    public static Vector<Jugable> iniciaJuegos (){
        try {
            JuegoAdivinaNumero juego = new JuegoAdivinaNumero(3);
            JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
            JuegoAdivinaNumero juegoImpar = new JuegoAdivinaImpar(3);
            JuegoAhorcado juegoAhorcado = new JuegoAhorcado(3, "1234");
            Jugable arrayJuegos[] = {juego, juegoPar, juegoImpar, juegoAhorcado};
            Vector<Jugable> games = new Vector<Jugable>(arrayJuegos.length, 2);
            games.clear();

            for (int i = 0; i < arrayJuegos.length; i++) {
                games.add(arrayJuegos[i]);
            }
            infoVector(games);
            return games;
        }
        catch(Exception e){
            throw e;
        }
    }

    public static Jugable menu (){
        Vector<Jugable> juegos = iniciaJuegos();
        int eleccion;
        do{
            System.out.println("Seleccione el juego deseado: ");
            System.out.println("0.- Adivina un número.");
            System.out.println("1.- Adivina un número par.");
            System.out.println("2.- Adivina un número impar.");
            System.out.println("3.- Adivina una palabra.");
            System.out.print("Introduzca la opción deseada: ");
            eleccion = Teclado.leeEntero();

        }while((eleccion < 0) || (eleccion >= juegos.size()));
        return juegos.get(eleccion);
    }

    public static void infoVector(Vector vector){
        System.out.println("Vector -> [Capacidad: " + vector.capacity() + ", Tamaño: " + vector.size() + " ]");
    }

    public static void main (String args[]){
        try {
            String respuesta;
            do {
                Jugable juegoEscogido = menu();
                juegoEscogido.muestraInfo();
                //juegoEscogido.muestraNombre();
                juegoEscogido.juega();

                System.out.print("\n¿Desea volver a jugar? (y/n): ");
                respuesta = Teclado.leeCadena();
            } while (respuesta.equals("y"));
        }
        catch (Exception e){
            ExceptionGame exception = new ExceptionGame("Se produjo un error");
        }
        finally {
            System.out.println("Fin del Programa");
        }
    }
}

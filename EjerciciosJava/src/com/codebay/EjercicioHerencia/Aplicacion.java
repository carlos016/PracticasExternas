package com.codebay.EjercicioHerencia;

public class Aplicacion {
    public static void main (String args[]){
        JuegoAdivinaNumero juego = new JuegoAdivinaNumero(3, 5);
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3, 6);
        JuegoAdivinaNumero juegoImpar = new JuegoAdivinaNumero(3, 7);
        juego.juega();
        juegoPar.juega();
        juegoImpar.juega();
    }
}

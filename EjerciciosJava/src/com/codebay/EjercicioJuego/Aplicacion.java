package com.codebay.EjercicioJuego;

public class Aplicacion {
    public static void main (String args[]){
        Juego jueguito = new Juego(5);
        jueguito.quitaVida();
        jueguito.muestraVidasRestantes();
        jueguito.reiniciaPartida();
        jueguito.actualizaRecord();

        Juego juegazo = new Juego(5);
        juegazo.muestraVidasRestantes();
        juegazo.actualizaRecord();
        juegazo.muestraVidasRestantes();
    }
}

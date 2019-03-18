package com.codebay.EjercicioInterfaces;

public class JuegoAdivinaPar extends JuegoAdivinaNumero implements Jugable {
    public JuegoAdivinaPar(int viditas, int adivinita){
        super(viditas, adivinita);
    }

    public void muestraNombre(){
        System.out.print("Adivina el número par -> [0, 10]: ");
    }

    public void muestraInfo(){
        System.out.println("¡Trata de adivinar el número par secreto antes de quedarte sin vidas! (Vidas actuales: " + getVidasActuales()+ ")");
    }

    @Override
    public boolean validaNumero(int userGuess){
        if((userGuess % 2) == 0){
            return true;
        }

        System.out.println("ERROR LOCO");
        return false;
    }
}
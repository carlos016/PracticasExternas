package com.codebay.EjercicioHerencia;

public class JuegoAdivinaPar extends JuegoAdivinaNumero{
    public JuegoAdivinaPar(int viditas, int adivinita){
        super(viditas, adivinita);
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

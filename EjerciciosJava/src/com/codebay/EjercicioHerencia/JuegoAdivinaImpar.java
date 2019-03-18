package com.codebay.EjercicioHerencia;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero{
    public JuegoAdivinaImpar(){
        super(10, 6);
    }

    @Override
    public boolean validaNumero(int userGuess){
        if((userGuess % 2) == 1){
            return true;
        }

        System.out.println("ERROR LOCO");
        return false;
    }
}

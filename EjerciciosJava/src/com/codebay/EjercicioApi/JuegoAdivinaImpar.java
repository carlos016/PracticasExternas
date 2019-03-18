package com.codebay.EjercicioApi;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int viditas){
        super(viditas);
    }

    public void muestraNombre(){
        System.out.print("Adivina el número impar -> [0, 10]: ");
    }

    public void muestraInfo(){
        System.out.println("¡Trata de adivinar el número impar secreto antes de quedarte sin vidas! (Vidas actuales: " + getVidasActuales()+ ")");
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

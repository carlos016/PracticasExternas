package com.codebay.EjercicioInterfaces;
import com.codebay.EjercicioTeclado.Teclado;

public class JuegoAdivinaNumero extends Juego implements Jugable{

    private int guess;

    public JuegoAdivinaNumero(int viditas, int adivinita){
        super(viditas);
        setGuess(adivinita);
    }

    public void muestraNombre (){
        System.out.print("Adivina el número -> [0, 10]: ");
    }

    public void muestraInfo(){
        System.out.println("¡Trata de adivinar el número secreto antes de quedarte sin vidas! (Vidas actuales: " + getVidasActuales()+ ")");
    }

    public void juega(){
        reiniciaPartida();
        int userGuess;
        boolean continuar = true;
        do{
            muestraNombre();
            userGuess = Teclado.leeEntero();
            continuar = validaNumero(userGuess);

            continuar = (continuar == true) ? !checkGuess(userGuess) : true;

        }while(continuar);
    }

    public boolean checkGuess(int userGuess){
        if(userGuess == getGuess()){
            System.out.println("YOU WIN!!");
            actualizaRecord();
            return true;
        }
        else if(quitaVida()){
            String linea;
            linea = ((userGuess > getGuess()) ? "El número que buscas es menor." : "El número que buscas es mayor.");
            System.out.println(linea);
            return false;
        }

        System.out.println("YOU LOSE!!");
        return true;
    }

    public boolean validaNumero(int userGuess){
        return true;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }
}

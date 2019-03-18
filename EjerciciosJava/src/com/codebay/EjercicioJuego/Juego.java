package com.codebay.EjercicioJuego;

public class Juego {

    private int vidasActuales;
    private int vidasIniciales;
    private static int record = 0;

    public Juego (int viditas){
        setVidasIniciales(viditas);
        setVidasActuales(viditas);
    }

    public void muestraVidasRestantes (){
        System.out.println("Quedan " + getVidasActuales() + " vidas." );
        System.out.println("Record:  " + getRecord() );
    }

    public boolean quitaVida (){
        boolean muerto = false;
        setVidasActuales(getVidasActuales() - 1);
        if(getVidasActuales() <= 0){
            muerto = true;
        }
        return muerto;
    }

    public void reiniciaPartida (){
        setVidasActuales(getVidasIniciales());
    }

    public void actualizaRecord (){
        if(getVidasActuales() == getRecord()){
            System.out.println("Has alcanzado el record.");
        } else if(getVidasActuales() > getRecord()){
            System.out.println("¡Felicidades has superado el record!");
            setRecord(getVidasActuales());
        }
    }

    public void setVidasActuales(int vidasActuales) {
        this.vidasActuales = vidasActuales;
    }

    public void setVidasIniciales(int vidasIniciales) {
        this.vidasIniciales = vidasIniciales;
    }

    public static void setRecord(int record) {
        Juego.record = record;
    }

    public int getVidasActuales() {
        return vidasActuales;
    }

    public int getVidasIniciales() {
        return vidasIniciales;
    }

    public static int getRecord() {
        return record;
    }

    @Override
    public String toString() {
        return (Integer.toString(vidasActuales));
    }
}

package com.codebay.EjercicioTeclado;

public class HolaTeclado {
    public static void main(String args[]){
        String nombre;
        int edad;

        System.out.print("Dime tu nombre: ");
        nombre = Teclado.leeCadena();

        System.out.print("Dime tu edad: ");
        edad = Teclado.leeEntero();

        System.out.print("Hola " + nombre +
                ", tienes " + edad + " años");
    }
}
package com.codebay.EjercicioTeclado;
import java.io.*;

public class Teclado {

    public static String leeCadena () {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String linea;
        try {
            linea = buffer.readLine();
        }
        catch (Exception e) {
            linea = "";
        }
        return linea;
    }

    public static int leeEntero (){
        int numero;

        try{
            numero = Integer.parseInt(leeCadena().trim());
        }
        catch(Exception e){
            numero = 0;
        }
        return numero;
    }
}
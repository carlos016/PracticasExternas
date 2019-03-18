package com.codebay.EjercicioApi;
import com.codebay.EjercicioTeclado.Teclado;

import java.util.Vector;

public class JuegoAhorcado extends Juego implements Jugable{

	private String stringToGuess;
	private Vector<Character> stringLowBar;
	private Vector<Character> usedLetters;
	private static final Character ASTERISK = '_';

	public JuegoAhorcado(int vidas, String guess){
		super(vidas);
		setStringToGuess(guess.toLowerCase());
		setStringLowBar();
		setUsedLetters(new Vector<Character>());
	}

	public void muestraNombre (){
		System.out.print("Adivina la palabra secreta -> ");

		for(int i = 0; i <getStringLowBar().size() ; i++){
			System.out.print(getStringLowBar().get(i));
		}
		System.out.println(" ");
		System.out.println("Intentos: " + getUsedLetters());
		System.out.print("Introduce una letra: ");
	}

	public void muestraInfo(){
		System.out.println("\n¡Trata de adivinar la palabra secreta antes de quedarte sin vidas! (Vidas actuales: " + getVidasActuales()+ ")");
	}

	public void reiniciaPartida(){

	}

	public void juega () {
		//reiniciaPartida();
		char userGuess;
		boolean continuar;
		do{
			muestraNombre();
			userGuess = Teclado.leeCadena().charAt(0);
			continuar = validateGuess(userGuess);
			continuar = (continuar) ? checkGuess(userGuess) : true;
			continuar = (continuar) ? !checkWin(): false;

		}while (continuar);
	}

	public boolean validateGuess(char userGuess){

		if (!getUsedLetters().contains(userGuess)){
			addUsedLetter(userGuess);
			return true;
		}
		return false;
	}

	public void addUsedLetter(char userGuess){
		getUsedLetters().add(userGuess);
	}

	public boolean checkGuess(char userGuess){
		Vector<Integer> index = getIndexOfChar(userGuess);
		if(!index.isEmpty()){
			System.out.println("Acertaste!\n");
			updateStringLowBar(index, userGuess);
			actualizaRecord();
			return true;
		}
		else if(quitaVida()){
			System.out.println("Fallaste!\n");
			return true;
		}

		System.out.println("YOU LOSE!!");
		return false;
	}

	public boolean checkWin(){
		boolean win = false;
		String lowBar = "";

		for(int i = 0; i < getStringLowBar().size(); i++){
			lowBar += getStringLowBar().get(i);
		}

		if(getStringToGuess().equals(lowBar)){
			System.out.println("YOU WIN!!");
			win = true;
		}
		return(win);
	}

	public void updateStringLowBar(Vector<Integer> index, char userGuess){
		for(int i = 0; i < index.size(); i++){
			getStringLowBar().set(index.get(i), userGuess);
		}
	}

	public Vector<Integer> getIndexOfChar(char userGuess){
		Vector<Integer> index = new Vector<Integer>();

		for(int i = 0; i < getStringToGuess().length(); i++){
			if(userGuess == getStringToGuess().charAt(i)){
				index.add(i);
			}
		}
		return index;
	}

	public String getStringToGuess() {
		return stringToGuess;
	}

	public void setStringToGuess(String stringToGuess) {
		this.stringToGuess = stringToGuess;
	}

	public Vector<Character> getStringLowBar() {
		return stringLowBar;
	}

	public void setStringLowBar() {
		this.stringLowBar = new Vector<Character>();
		for(int i = 0; i < getStringToGuess().length(); i++){
			this.stringLowBar.add(ASTERISK);
		}
	}

	public Vector<Character> getUsedLetters() {
		return usedLetters;
	}

	public void setUsedLetters(Vector<Character> letters) {
		this.usedLetters = letters;
	}
}

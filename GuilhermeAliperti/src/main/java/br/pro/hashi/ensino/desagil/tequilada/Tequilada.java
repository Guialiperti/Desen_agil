// A instru��o "package" indica em qual pacote a classe est�.
package br.pro.hashi.ensino.desagil.tequilada;


public class Tequilada {
	public static void main(String[] args) {
		Engine engine = new Engine();

		engine.board = new Board();
		engine.board.loadFromFile("board.txt");

		engine.cpuPlayer = new Player();
		engine.humanPlayer = new Player();
	}
}

package Entities;

import Enums.TIPOS;

public class Pikachu extends Pokemons{
	
	public Pikachu() {
		this.setName("Pikachu");
		this.setTipo(TIPOS.ELETRICO);
		this.setFraqueza(TIPOS.TERRA);
	}
}

package Entities;

import Enums.TIPOS;

public class Pikachu extends Pokemons{
	
	public Pikachu() {
		this.setName("Pikachu");
		this.setTipo(TIPOS.ELETRICO);
		System.out.println(this.getVida());
	}
}

package Entities;

import java.util.Random;

import Enums.TIPOS;

public abstract class Pokemons {
	private TIPOS tipo;
	private String name;
	private String efeito;
	private int vida=75;
	private static Random random = new Random();
	private TIPOS fraqueza;
	
	public Pokemons() {
		
	}
	
	public String danoDeTipo(TIPOS tipo) {
		switch(tipo){
		case AGUA:setEfeito("Molhado");
		break;
		case FOGO:setEfeito("Queimado");
		break;
		case TERRA:setEfeito("Stunado");
		break;
		case PLANTA:setEfeito("Enraizado");
		break;
		case ELETRICO:setEfeito("Eletrocutado");
		default:break;
		}
		return "SEM EFEITO";
	}
	
	public int ataquePokemon(Pokemons pokemon) {
		int dano = random.nextInt(1,15);
		System.out.println(dano);
		if(this.getTipo() == pokemon.getFraqueza()) {
			pokemon.danoDeTipo(this.getTipo());
			pokemon.setVida(pokemon.getVida()-dano*2);
			System.out.println(dano*2);
			return dano*2;
		}
		if(dano >= 11) {
			pokemon.setVida(pokemon.getVida()-dano);
			pokemon.danoDeTipo(this.getTipo());
			return dano;
		}else {
			pokemon.setVida(pokemon.getVida()-dano);
		}
		return dano;
	}
	
	public TIPOS getTipo() {
		return tipo;
	}
	
	public void setTipo(TIPOS tipo) {
		this.tipo = tipo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getEfeito() {
		return efeito;
	}

	public void setEfeito(String efeito) {
		this.efeito = efeito;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public TIPOS getFraqueza() {
		return fraqueza;
	}

	public void setFraqueza(TIPOS fraqueza) {
		this.fraqueza = fraqueza;
	}

}

package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Charmander;
import Entities.Pikachu;
import Entities.Pokemons;

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Pokemons> pk = new ArrayList<>();
		pk.add(new Pikachu());
		pk.add(new Charmander());
		pk.get(0).tomouDano(pk.get(1).ataquePokemon(pk.get(0)));
		System.out.println(pk.get(0).getVida());
		System.out.println(pk.get(0).getEfeito());
		
		sc.close();
	}
}
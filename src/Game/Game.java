package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Charmander;
import Entities.Pokemons;
import Entities.Squirtle;

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Pokemons> pk = new ArrayList<>();
		pk.add(new Squirtle());
		pk.add(new Charmander());
		pk.get(0).ataquePokemon(pk.get(1));
		System.out.println(pk.get(1).getVida());
		System.out.println(pk.get(1).getEfeito());
		
		sc.close();
	}
}
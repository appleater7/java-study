package exam;

public class PokemonArray {
	
	String name = "";
	int pokeNum = 0;
	String type = "";

	public static void main(String[] args) {
		PokemonArray[] kwanSeo = new PokemonArray[151];
		
		for (int i = 0; i < kwanSeo.length; i++) {
			kwanSeo[i] = new PokemonArray();
			kwanSeo[i].pokeNum = i + 1;
		}
		for (int i = 0; i < kwanSeo.length; i++) {
			System.out.println(kwanSeo[i].pokeNum);
		}
		System.out.println("다음 포켓몬은 뭘까용?");
	}
}
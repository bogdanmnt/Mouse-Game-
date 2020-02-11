
public class Map {
	
	private char[][] harta;

	public char[][] getHarta() {
		return harta;
	}

	public void setHarta(char[][] harta) {
		this.harta = harta;
	}
	
	public void afiseazaHarta(){
		for(int i = 0; i<15 ; i++){
			for(int j = 0; j<15 ; j++){
				System.out.print(harta[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		
	}
	
}

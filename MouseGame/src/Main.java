
public class Main {

	public static void main(String[] args) {
	
		char[][] harta=new char[15][15];
		for(int i=0;i<15;i++){
			for(int j=0;j<15;j++){
				if(i==j && i%2==0)
					harta[i][j]='x';
				else 
					harta[i][j]='o';
				
			}
			
		}
		for(int i=0;i<15;i=i+3){
			for(int j=0;j<15;j=j+3)
				harta[i][j]='x';
		}
		
		harta[14][0]='M';
		harta[0][14]='C';
		
		Map hartaVlad=new Map();
		hartaVlad.setHarta(harta);
		
		
		Mouse soarec = new Mouse();
		Cheese cascaval = new Cheese();
		Engine creier = new Engine();
		
		creier.setCascaval(cascaval);
		creier.setSoarec(soarec);
		creier.setMapa(hartaVlad);
		creier.duSoareceleLaCascaval();
		
		
		
		
		
		
		
		}
		

}


public class Engine {
	
	private Mouse soarec;
	private Cheese cascaval;
	private Map mapa;
	
	
	public Mouse getSoarec() {
		return soarec;
	}
	public void setSoarec(Mouse soarec) {
		this.soarec = soarec;
	}
	public Cheese getCascaval() {
		return cascaval;
	}
	public void setCascaval(Cheese cascaval) {
		this.cascaval = cascaval;
	}
	public Map getMapa() {
		return mapa;
	}
	public void setMapa(Map mapa) {
		this.mapa = mapa;
	}
	
	
	public void duSoareceleLaCascaval(){
		//gasim soarecele
		soarec.find(mapa);
		//gasim cascavalu'
		cascaval.find(mapa);
		//cat timp cascavalul nu este gasit de soarec
		while(cascaval.isFound(soarec) == false){
			mapa.afiseazaHarta();
			//daca cascavalul este la dreapta
			if(cascaval.getY() > soarec.getY()){
				
				if(soarec.canMoveRight(mapa)){
					
				soarec.moveRight(mapa);
				mapa.getHarta()[soarec.getX()][soarec.getY()-1] ='-';
				mapa.getHarta()[soarec.getX()][soarec.getY()]='M';
				
				}
				else{
					if(soarec.canMoveUp(mapa)){
						soarec.moveUp(mapa);
						mapa.getHarta()[soarec.getX()+1][soarec.getY()] ='|';
						mapa.getHarta()[soarec.getX()][soarec.getY()]='M';
						
					}
					
					
				}
			}
			else{
				//daca cascavalul este la stanga
				if(soarec.canMoveLeft(mapa)){
				
				soarec.moveLeft(mapa);
				mapa.getHarta()[soarec.getX()][soarec.getY()+1] ='-';
				mapa.getHarta()[soarec.getX()][soarec.getY()]='M';
				}
				
			}
			//daca cascavalul este mai sus
			if(cascaval.isFound(soarec)==false)
			if(cascaval.getX() < soarec.getX()){
				
				if(soarec.canMoveUp(mapa)){
					
				soarec.moveUp(mapa);
				mapa.getHarta()[soarec.getX()+1][soarec.getY()] ='|';
				mapa.getHarta()[soarec.getX()][soarec.getY()]='M';
				}
			}
			else{
				//daca cascavalul este mai jos
				if(soarec.canMoveDown(mapa)){
				soarec.moveDown(mapa);
				mapa.getHarta()[soarec.getX()-1][soarec.getY()] ='|';
				mapa.getHarta()[soarec.getX()][soarec.getY()]='M';
				}
				
			}
			
			
		}
		
		
	}
	
	
	
	
	
	
	
}


public class Cheese {

	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void find(Map m){
		for( int i=0;i<15; i++){
			for (int j=0;j<15;j++){
				if (m.getHarta()[i][j]=='C') {
					x=i;
					y=j;
				}
					
			}
		}
	}
	
	public boolean isFound(Mouse m){
		if (x==m.getX() && y==m.getY())
			return true;
		else
			return false;
	}
}

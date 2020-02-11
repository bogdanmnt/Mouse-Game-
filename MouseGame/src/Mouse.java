
public class Mouse {

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

	public boolean canMoveLeft(Map m) {

		// capatul hartii
		if (y == 0)
			return false;
		// daca in stanga sunt o sau c atunci se poate misca
		if (m.getHarta()[x][y - 1] == 'o' || m.getHarta()[x][y - 1] == 'C') {
			return true;
		} else {
			// altfel nu se poate misca
			return false;
		}

	}

	public boolean canMoveRight(Map m) {

		// capatul hartii
		if (y == 14)
			return false;
		// daca in dreapta sunt o sau c atunci se poate misca
		if (m.getHarta()[x][y + 1] == 'o' || m.getHarta()[x][y + 1] == 'C') {
			return true;
		} else {
			// altfel nu se poate misca
			return false;
		}

	}

	public boolean canMoveUp(Map m) {

		// capatul hartii
		if (x == 0)
			return false;
		// daca in sus sunt o sau c atunci se poate misca
		if (m.getHarta()[x - 1][y] == 'o' || m.getHarta()[x - 1][y] == 'C') {
			return true;
		} else {
			// altfel nu se poate misca
			return false;
		}

	}

	public boolean canMoveDown(Map m) {

		// capatul hartii
		if (x == 14)
			return false;
		// daca in jos sunt o sau c atunci se poate misca
		if (m.getHarta()[x + 1][y] == 'o' || m.getHarta()[x + 1][y] == 'C') {
			return true;
		} else {
			// altfel nu se poate misca
			return false;
		}

	}

	public void moveLeft(Map m) {
		if (canMoveLeft(m) == true)
			y = y - 1;

	}

	public void moveRight(Map m) {
		if (canMoveRight(m) == true)
			y = y + 1;

	}

	public void moveUp(Map m) {
		if (canMoveUp(m) == true)
			x = x - 1;

	}

	public void moveDown(Map m) {
		if (canMoveDown(m) == true)
			x = x + 1;

	}
	
	
	public void find(Map m){
		for( int i=0;i<15; i++){
			for (int j=0;j<15;j++){
				if (m.getHarta()[i][j]=='M') {
					x=i;
					y=j;
				}
					
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}

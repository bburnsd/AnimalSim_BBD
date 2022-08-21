package AnimalSim;

public class Location extends Animal {
protected int xCoord =0;
protected int yCoord =0;

public Location() {
	this.xCoord=0;
	this.yCoord=0;
}//end Location

public Location(int x, int y) {
	this.xCoord=x;
	this.yCoord=y;
}//end Location

public void update(int x, int y) {
	this.xCoord=x;
	this.yCoord=y;
}//end update

public int[] getCoordinates() {
	int[] coords = new int[2];
	coords[0] = this.xCoord;
	coords[1] = this.yCoord;
	return coords;		
}//end getCoordinates


}

package AnimalSim;

public class BrownBear extends Animal implements Walkable, Swimmable {
protected String subSpecies;

public BrownBear() {
	this.simID=0;
	this.loc=this.loc;
	this.full=false;
	this.rested=true;
	this.subSpecies="Alaskan";
}//end BrownBear

public BrownBear(int simID, Location l, String subSpecies) {
	this.simID=simID;
	this.loc=l;
	this.subSpecies=subSpecies;
	this.full=false;
	this.rested=true;
}//end BrownBear

public String getSubSpecies() {
	return subSpecies;
}//end getSubSpecies

public void setSubSpecies(String subSpecies) {
	this.subSpecies = subSpecies;
}//end setSubSpecies

public String toString() {
	return "{Simulation ID: " + this.simID + ", Location: [" +this.loc.xCoord + ", " + this.loc.yCoord +"], Full: " + this.full +", Rested: " + this.rested + ", Subspecies: " + this.subSpecies + "}";
}//end toString

public void walk(int direction) {
int north = 1;
int east = 2;
int south = 3;
int west = 4;
if(direction == north) {
	this.loc.yCoord=this.loc.yCoord+=3;
}
else if(direction == east) {
	this.loc.xCoord=this.loc.xCoord+=3;
}
else if(direction == south) {
	this.loc.yCoord=this.loc.yCoord-=3;
}
else if(direction == west) {
	this.loc.xCoord=this.loc.xCoord-=3;
}
else {
	System.out.println("1 for North, 2 for East, 3 for South, 4 for West");
}
}//end walk

public void swim(int direction) {
int north = 1;
int east = 2;
int south = 3;
int west = 4;
if(direction == north) {
	this.loc.yCoord=this.loc.yCoord+=2;
}
else if(direction == east) {
	this.loc.xCoord=this.loc.xCoord+=2;
}
else if(direction == south) {
	this.loc.yCoord=this.loc.yCoord-=2;
}
else if(direction == west) {
	this.loc.xCoord=this.loc.xCoord-=2;
}
else {
	System.out.println("1 for North, 2 for East, 3 for South, 4 for West");
}
}//end walk

public void fly(Location l) {
	System.out.println("Bear can't fly");
}


}

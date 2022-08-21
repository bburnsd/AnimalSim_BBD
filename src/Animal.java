package AnimalSim;

public abstract class Animal {
protected int simID;
protected Location loc;
protected boolean full;
protected boolean rested;

public Animal() {
	this.simID=0;
	this.full=false;
	this.rested=true;
	this.loc = this.loc;
}//end Animal

public Animal(int simID, Location l) {
	this.simID=simID;
	this.loc=l;
	this.full=false;
	this.rested=true;
}//end Animal

public int getSimID() {
	return simID;
}//end getSimID

public void setSimID(int simID) {
	this.simID = simID;
}//end setSimID

public Location getLocation() {
	return loc;
}//end getLocation

public void setLocation(Location location) {
	loc = location;
}//end setLocation

public boolean getFull() {
	return full;
}//end getFull

public void setFull(boolean full) {
	this.full = full;
}//end setFull

public boolean getRested() {
	return rested;
}//end getRested

public void setRested(boolean rested) {
	this.rested = rested;
}//end setRested

public boolean eat() {
	double rand = Math.random();
	if(rand <= .5 ) {
		this.full=false;
	}
	else {
		this.full=true;
	}
	return this.full;
}//end eat

public boolean sleep() {
	double rand = Math.random();
	if(rand<=.5) {
		this.rested=false;
	}
	else {
		this.rested=true;
	}
	return this.rested;
}//end sleep
}

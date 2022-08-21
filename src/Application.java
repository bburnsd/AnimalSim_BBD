package AnimalSim;

import java.util.*;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*********************************************

	      Location Tests
	      
*********************************************/
Location loc0 = new Location();
Location loc1 = new Location(3,4);
System.out.println("Location 0: " + Arrays.toString(loc0.getCoordinates()));
loc0.update(1, 2);
System.out.println("Location 0: " + Arrays.toString(loc0.getCoordinates()));
System.out.println("Location 1: " + Arrays.toString(loc1.getCoordinates()));

/*********************************************

Animal Tests

*********************************************/
//Animal a0 = new Animal(); cannot instantiate type animal


/*********************************************

Goldfinch Tests

*********************************************/

Goldfinch g0 = new Goldfinch(); //empty constructor test
Goldfinch g1 = new Goldfinch(1, loc1, 6.7); //preferred constructor test
System.out.println("Goldfinch Testing: " + g1.toString()); //toString test


g1.setWingSpan(2.9);//setWingSpan test
System.out.println("Goldfinch Testing: " + g1.getWingSpan()); //getWingSpan test


g1.walk(1); //walk test
System.out.println("Goldfinch Testing: " + g1.toString()); //another println to show the coordinate change, it walked north so the y increased (I assumed that this was a bird's eye view of the animals)
g1.fly(loc0);//fly test
System.out.println("Goldfinch Testing: " + g1.toString());//another println to show the coordinate change


g1.setSimID(13); //setSimID test
System.out.println("Goldfinch Testing: " + g1.getSimID());//getSimID test


g1.setLocation(loc1); //setLocation test
System.out.println("Goldfinch Testing: " + g1.getLocation());//getLocation test


g1.setFull(true); //setFull test
System.out.println("Goldfinch Testing: " + g1.getFull()); //getFull test

g1.setRested(false); //setRested test
System.out.println("Goldfinch Testing: " + g1.getRested()); //getRested test


System.out.println("Goldfinch Testing: " + g1.eat()); //eat test
System.out.println("Goldfinch Testing: " + g1.sleep()); //sleep test


/*********************************************

BrownBear Tests

*********************************************/
BrownBear b0 = new BrownBear(); //empty constructor test
BrownBear b1 = new BrownBear(2, loc1, "Grizzly"); //preferred constructor test
System.out.println("BrownBear Testing: " + b1.toString()); //toString test


b1.setSimID(13); //setSimID test
System.out.println("BrownBear Testing: " + b1.getSimID());//getSimID test


b1.setLocation(loc1); //setLocation test
System.out.println("BrownBear Testing: " + b1.getLocation());//getLocation test


b1.setFull(true); //setFull test
System.out.println("BrownBear Testing: " + b1.getFull()); //getFull test

b1.setRested(false); //setRested test
System.out.println("BrownBear Testing: " + b1.getRested()); //getRested test


System.out.println("BrownBear Testing: " + b1.eat()); //eat test
System.out.println("BrownBear Testing: " + b1.sleep()); //sleep test


b1.walk(2); //walk test
System.out.println("BrownBear Testing: " + b1.toString()); //another println to show the coordinate change, it walked east so the x increased (I assumed that this was a bird's eye view of the animals)
b1.swim(3); //swim test
System.out.println("BrownBear Testing: " + b1.toString()); //another println to show the coordinate change, it swam south so the y decreased (I assumed that this was a bird's eye view of the animals)


b1.setSubSpecies("Siberian"); //setSubSpecies test
System.out.println("BrownBear Testing: " + b1.getSubSpecies()); //getSubSpecies test



/*********************************************

Generics Tests

*********************************************/
Location bearloc1 = new Location(44,22);
Location bearloc2 = new Location(38,29);
Location goldloc1 = new Location(12,13);
Location goldloc2 = new Location(124,364);
ArrayList<Animal> animals = new ArrayList<Animal>();
BrownBear bear1 = new BrownBear(1, bearloc1, "Alaskan");
BrownBear bear2 = new BrownBear(2, bearloc2, "Grizzly");
Goldfinch gold1 = new Goldfinch(3, goldloc1, 5.5);
Goldfinch gold2 = new Goldfinch(4, goldloc2, 3.2);
animals.add(bear1);
animals.add(bear2);
animals.add(gold1);
animals.add(gold2);
for(int i = 0;i<animals.size();i++) {
	System.out.println("Generics testing: " + animals.get(i).toString());
}
	}
}


package lecture.lab1;

import java.util.Random;

public class BobsLife {
	private int[] characteristics;/* hunger,Fitness,dollars*/
	private int randomLocationNum;
	private String[] location;/* home, work, gym*/
	private String bobState;
	private boolean BobStates = true;
	
public BobsLife(int[] characteristics , String[] location, int randomLocationNum, String bobState ) {
	this.characteristics = characteristics;
	this.location = location;
	this.randomLocationNum= randomLocationNum;
	this.bobState = bobState;
}

public BobsLife() {
	int [] characteristics = {4, 7, 6};
	String [] location = {"home", "work", "gym"};
	randomLocationNum=0;
	bobState = "Alive";
}


public String nextTime(int [] characteristics, int randomLocationNum) {
	String r = "Null";
	if (BobStates == true) {
	
	if (randomLocationNum == 0) {
		characteristics[0] -= 3;
		characteristics[3] -= 1;
	
	}
	else if (randomLocationNum == 1) {
		characteristics[0] += 2;
		characteristics[1] -= 2;		
		characteristics[2] += 3;
	
	}
	
	else if (randomLocationNum == 2) {
		characteristics[0] += 3;
		characteristics[1] += 2;		
		characteristics[2] -= 3;
		
	}
	
	if (characteristics[0] > 6) 
	{
		bobState = "Dead";
		
	}
	else if (characteristics[1] < 0) {
		bobState ="Dead";
		BobStates = false;
	}
	
	else if (characteristics[2] < 0) {
		bobState="In jail";
		BobStates = false;

	}
	
	System.out.println("Bob is " + bobState);
	
	r = bobState;

	}
	
	else if (BobStates == false){
		
		System.out.println("Bob is " + bobState);
		r = "Null";
		
	}
	return r;
}

public int move() {
	
	Random rand = new Random();
	int randomNum = rand.nextInt(3);
	
	int r = randomLocationNum;
	if (BobStates == true) {

	
	this.randomLocationNum = randomNum;
	r = randomLocationNum;
	String newLocation = location[randomNum];

	
}
	
	else if (BobStates == false){
		r = randomLocationNum;
		 
	}
	return r;
	
}

public String get1Location() {
	
	return location[randomLocationNum];
}

public int getHunger() {
	
	return characteristics[0];
}

public int getDollars() {
	
	return characteristics[2];
}

public int getFitness() {
	
	return characteristics[1];
}


public String[] getLocation() {
	
	return location;
}

public String getBobState() {
	
	return bobState;
}

public int[] getCharacteristics() {
	
	return characteristics;
}

public int getRandomLocationNum() {
	
	return randomLocationNum;
}

}




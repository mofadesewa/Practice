package lecture.lab1;

public class BobsLifeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] location = {"home", "work", "gym"};
		int [] characteristics = {4, 7, 6};

		BobsLife Bob = new BobsLife(characteristics, location, 0, "Alive");
		
		String bobState = Bob.getBobState(); 
	
		int randomLocationNum = Bob.getRandomLocationNum();
		
		int counter = 0;
		while (!(bobState.equalsIgnoreCase("Alive"))) {
			
			Bob.nextTime(characteristics, randomLocationNum);
			Bob.move();
			bobState = Bob.getBobState();
			
			counter++;
		}
	}
}


	


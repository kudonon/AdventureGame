import java.util.*;

public class monster {

	Random rand = new Random();
	
	public String monname;
	public int monattack = 0;
	public int monhealth = 0;
	public int mondefense = 0;
	public int total = 0;
	public int chance = 0;
	public int x = 0;
	
	public monster() {
		
		total = 0;
		monhealth = rand.nextInt(120);
		total += monhealth;
		monattack = rand.nextInt(120-monhealth);
		total += monattack;
		mondefense = rand.nextInt(120- total);
		total += mondefense;
			
		chance = rand.nextInt(100);
		
		x = rand.nextInt(8);
		switch(x) {
			case 0: 
				monname = "MarcMonster";
				break;
			case 1:
				monname = "Chinchilla";
				break;
			case 2:
				monname = "Pikachu";
				break;
			case 3:
				monname = "Kwonsquerer";
				break;
			case 4:
				monname = "Rahullio";
				break;
			case 5:
				monname = "F-minus";
				break;
			case 6: 
				monname = "Singletron";
				break;
			case 7:
				monname = "KareltheDog";
				break;
			default:
				monname = "BuckyTheGod";
				break;
				
		
		}
		
		
	}
	
	public String getName() {
		return monname;
	}
	
	public String getString() {
		return "This is a " + monname + ". His stats are \n Attack:" + monattack + "\n Health:" + monhealth + "\n Defense:" + mondefense + "\n you have a " + chance + "% chance of winning";
	}
	
}



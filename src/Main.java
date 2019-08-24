import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Main {
	
	public static void main(String[] args) {
		
		String name;
		double total = 0;
		double attack = 0;
		double defense = 0;
		double health = 0;
		int n = 0;
		int x = 0;
		
		String[] log = new String[5];
		Player[] player = new Player[5];
		String[] injury = {"cranium","neck","shoulder blade","elbow","forearm","upperarm","chest","stomach","rib","ribcage","crotch","butt","fingers","fingernails","wrist","ankle","shin","chin","ears","eyes","nose","lips","tongue","jaw","teeth","toe","toenails","femur","knee","kneecap","kidneys","intestine","liver","appendix","scalp","body hair","skin","nostril","eyelashes","wisdom teeth","pride","mentality","morals","ethics","rationality","beauty","loyalty","self-esteem","self-respect","self-value","narcissicism","glasses","clothes","phone","sword","gun","sandwich","baseball bat","toothbrush","wife"};
		
		while(true) {
			JOptionPane.showMessageDialog(null, "Welcome to Adventure Game v1.0.0.0");
			
			String choice = JOptionPane.showInputDialog("Are you a new player?");
			
			if(choice.equals("yes") || choice.equals("y") || choice.equals("Yes")) {
				name = JOptionPane.showInputDialog("Enter Name: ");
				total = 0;
				while (total != 100) {
					JOptionPane.showMessageDialog(null, "Please enter your desired statistics\n (they all should add up to 100!)");
					
					total = 0;
					attack = 0;
					defense = 0;
					health = 0;
					
					attack = Double.parseDouble(JOptionPane.showInputDialog("Enter Attack Stat: \n (remaining " + (100 - total) + "!)"));
					total += attack;
					
					health = Double.parseDouble(JOptionPane.showInputDialog("Enter Health Stat: \n (remaining " + (100 - total) + "!)"));
					total += health;
					
					defense = Double.parseDouble(JOptionPane.showInputDialog("Enter Defense Stat: \n (remaining " + (100 - total) + "!)"));
					total += defense;
				
					String confirm = JOptionPane.showInputDialog("Here are your stats... \n Name: " + name + "\n Attack: " + attack + "\n Health: " + health + "\n Defense: " + defense + " \n Are these your final inputs?");		
					

					if ((confirm.equals("yes") || confirm.equals("Yes") || confirm.equals("y")) && total == 100) {
						player[n] = new Player(name, attack, health, defense);
						JOptionPane.showMessageDialog(null, "Congratualtions! you have created a new character! \n Here are the stats of all players... \n Attack, Health, and Defense Mean: 33 \n Attack, Health and Defense St. Dv.: 11.3 \n\n Your z-scores (st.dv. away from mean)... \n Attack: " + player[n].attackZscore() + "\n Health: " + player[n].healthZscore() + "\n Defense:" + player[n].defenseZscore());
						log[n] = name;
						System.out.println("Player no." + n);
						break;
					} else {
						JOptionPane.showMessageDialog(null, "Error. Retry your inputs again");
						total = 0;
					}
				}
				
			} else {
				
				name = JOptionPane.showInputDialog("Enter Name: ");	
				for (int i = 0; i < 5; i++) {
					if (log[i].equals(name)) {
						n = i;
						JOptionPane.showMessageDialog(null, "Welcome Back! You are successfully logged in as " + log[n] );
						break;
					} else {
						JOptionPane.showMessageDialog(null, "Error. You do not belong in the system.");
					}
				}
			}
			
			x = n;
			System.out.println("x is "+ x);
			boolean w = true;
			while (w) {
				int choice1 = Integer.parseInt(JOptionPane.showInputDialog("What would you like to do? \n 1: Go on a quest \n 2: Check Stats \n 3: See Other Players \n 4: Log out"));
				switch(choice1) {
					case 1 :
						/* Actual Simulation */
						int i = Integer.parseInt(JOptionPane.showInputDialog(null, "How many days do you want your trip to be?"));
						monster[] mon = new monster[i];
						int a = 0;
						int win = 0;
						while (a < i) {
							mon[a] = new monster();
							JOptionPane.showMessageDialog(null, "Day " + a + "\n\n You encounter a " + mon[a].getName() + "!");
							JOptionPane.showMessageDialog(null, mon[a].getString());
							Random rand = new Random();
							win = rand.nextInt(i);
							if (win == a) {
								break;
							}
							int as = rand.nextInt(59);
							int qw = rand.nextInt(1);
							if (qw == 0) {
								JOptionPane.showMessageDialog(null, "It was a tough battle \n You damaged your " + injury[as]);
							} else {
								JOptionPane.showMessageDialog(null, "It was an easy battle");
							}
							JOptionPane.showMessageDialog(null, "You win!");
							a++;
						}
						if (win == a) {
							if (a > 10) {
								JOptionPane.showMessageDialog(null, "You dead! \n It was a short lived meaningless life");
							} else {
								JOptionPane.showMessageDialog(null, "You dead! \n It was a long lived mediocre life");
							}
						} else {
							JOptionPane.showMessageDialog(null, "You Win!");
						}
						break;
					case 2 :
						JOptionPane.showMessageDialog(null, player[x].toString());
						break;
					case 3 :
						JOptionPane.showMessageDialog(null, player[x].listofPlayers());
						break;
					case 4:
						w = false;
						break;	
					default : 
						JOptionPane.showMessageDialog(null, "Error. Enter Again");
						break;
				}
			}
			n++;
		}
		
		
		
		
		
	}
	
}







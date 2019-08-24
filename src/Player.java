import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.lang.*;

public class Player {

	private String name;
	private double attack, defense, health;
	public static String s = "Players: ";
	
	static double attackmean = 33.3;
	static double healthmean = 33.3; 
	static double defensemean = 33.3;
	static double attackstdv = 11.3;
	static double healthstdv = 11.3;
	static double defensestdv = 11.3;
	public static double players;
	
	public Player(String name, double attack, double health, double defense) {
		this.name = name;
		this.attack = attack;
		this.health = health;
		this.defense = defense;
		System.out.println("new player created \n" + "Name: " + name);
		s += "\n" + this.name;
		
	}
	
	public double getAttack() {
		return this.attack;
	}
	public double getHealth() {
		return this.health;
	}
	public double getDefense() {
		return this.defense;
	}
	
	public double attackMean() {
		return attackmean;
	}
	public double healthMean() {
		return healthmean;
	}
	public double defenseMean() {
		return defensemean;
	}
	
	public double attackStdv() {
		return attackstdv;
	}
	public double healthStdv() {
		return healthstdv;
	}
	public double defenseStdv() {
		return defensestdv;
	}
	
	public double attackZscore() {
		return round((this.attack - attackmean)/attackstdv);
	}
	public double healthZscore() {
		return round((this.health - healthmean)/healthstdv);
	}
	public double defenseZscore() {
		return round((this.defense - defensemean)/defensestdv);
	}
	
	public String toString() {
		return "Hi my name is " + name + " and my stats are \n Attack: " + attack + " (" + this.attackZscore() + " away) "+ "\n health: " + health + " (" + this.healthZscore() + " away) "+ "\n Defense: " + defense + " (" + this.defenseZscore() + " away) ";
	}
	
	public String listofPlayers() {
		return s;
	}
	
	public double round(double r){
		r = Math.round(r * 100);
		r = r/100;
		return r;
	}
}







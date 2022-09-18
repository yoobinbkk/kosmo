package chapter10;

public class Character {
		
	String name = "Nameless";
	String gender = "Unkown";
	String race = "Unknown";
	int health = 10;
	int stamina = 5;
	int damage = 1;
	int defense;
		
	Character () {
		System.out.println("======== " + name + " ========");
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("종족 : " + race);
		System.out.println("체력 : " + health);
		System.out.println("활력 : " + stamina);
		System.out.println("공격력 : " + damage);
		System.out.println("방어력 : " + defense);
		System.out.println("=======================");
	}
	Character (String name) {
		this();
		this.name = name;
	}
	Character (String name, String gender, String race) {
		this(name);
		this.race = race;
	}
	Character (String name, String gender, String race, int health, int stamina, int damage, int defense) {
		this(name, gender, race);
		this.health = health;
		this.stamina = stamina;
		this.damage = damage;
		this.defense = defense;
	}
}

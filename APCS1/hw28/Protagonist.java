// Bang Bang Celery (Taaseen Ali, Qian Zhou, Kayli Matsuyoshi)
// APCS1 pd1
// HW28 -- Ye Olde Role Playing Game
// 2017-11-08
public class Protagonist {
    
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    
    private String name;
    private int health;
    private int strength;
    private int defense;
    private double attackRating;
    private double normalAttackRating;
    private int fullHealth;
	   
    private int normalStrength;
    private int normalDefense;
    
    
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    
    public Protagonist( String input ) {
	name = input;
	health = 125;
	strength = 100;
	defense = 40;
	attackRating = 0.4;
	
	fullHealth = health;
	normalStrength = strength;
	normalDefense = defense;
	normalAttackRating = attackRating;
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~
    
    public boolean isAlive() {
	return health >0;
    }

    public int getDefense() {
	return defense;
    }
    
    public String getName() {
	return name;
    }
    
    public void lowerHP(int decrease) {
	health -= decrease;
    }
    
    public int attack(Monster enemy) {
	int damage = ((int) (strength * attackRating)) - enemy.getDefense();
	enemy.lowerHP(damage);
	return damage;
    }
    public void specialize(){
	
	defense -= ((int)Math.random()) * 20;
	attackRating += Math.random();
	
    }
    public void normalize(){
	defense = normalDefense;
	attackRating = normalAttackRating;
	

    }
    
    


    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

}
    

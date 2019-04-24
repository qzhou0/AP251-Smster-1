// Bang Bang Celery (Taaseen Ali, Qian Zhou, Kayli Matsuyoshi)
// APCS1 pd1
// HW28 -- Ye Olde Role Playing Game
// 2017-11-08

public class Monster {
    
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    
    
    private int health;
    private int strength;
    private int defense;
    private double attackRating;

    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    
    public Monster(  ) {

	health = 150;
	defense = 20;
	attackRating = 1.0;
	strength = (int) (Math.random() * 45 + 20);
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~
    
    public boolean isAlive() {
	return (health > 0);
	
    }

    public int getDefense() {
	return defense;
    }

    public void lowerHP(int decrease) {
	health -= decrease;
    }
    
    public int attack(Protagonist enemy) {
	int damage = ((int)(strength * attackRating)) - enemy.getDefense();
        enemy.lowerHP(damage);
	return damage;
    }

    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

}
    

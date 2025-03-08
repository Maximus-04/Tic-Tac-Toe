/**
 * The {@code Player} class represents a player in a game with a name, health bar, and lives.
 * The player can take damage and lose lives based on game events.
 */
public class Player {
    /** The name of the player. */
    public String name;
    /** The player's health bar, representing their remaining health points. */
    private int healthBar;
    /** The number of lives the player has remaining. */
    private int liveCount;

    /**
     * Constructs a {@code Player} object with the specified name, health bar, and lives.
     *
     * @param name the name of the player
     * @param healthBar the initial health value
     * @param liveCount the initial number of lives
     */
    public Player(String name, int healthBar, int liveCount) {
        this.name = name;
        this.healthBar = healthBar;
        this.liveCount = liveCount;
    }

    /**
     * Returns the player's name.
     *
     * @return the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the number of lives the player has remaining.
     *
     * @return the remaining lives
     */
    public int getLiveCount() {
        return liveCount;
    }
    
    /**
     * Returns the player's current health bar value.
     *
     * @return the player's health bar
     */
    public int getHealthBar() {
        return healthBar;
    }

    /**
     * Reduces the player's life count by one if they have remaining lives.
     * If the player has no lives left, a message is displayed.
     */
    public void loseLife() {
        if (liveCount > 0) {
            liveCount--;
        }
        
        if (liveCount == 0) {
            System.out.println("Ya lost all ya lives boi, watcha gonna do now?!");
        }
    }
    
    /**
     * Reduces the player's health by a specified damage amount.
     * If health reaches zero or below, the player is considered dead, and a message is displayed.
     *
     * @param damage the amount of damage to be inflicted
     */
    public void takeDamage(int damage) {
        healthBar -= damage;
        if (healthBar <= 0) {
            healthBar = 0;
            System.out.println("Ya dead now boi");
        }
    }
}

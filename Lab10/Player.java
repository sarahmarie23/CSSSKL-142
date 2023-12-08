public class Player {
    // instance variables
    private int health;
    private String[] inventory;
    private int speed;
    private int xLocation;
    private int yLocation;
    
    // default constructor
    public Player() {
        this.health = 10;
        this.inventory = new String[10];
        this.speed = 0;
        this.xLocation = 0;
        this.yLocation = 0;
    }
    
    // accessor 
    public int getHealth() {
        return health;
    }

    public int getX() {
        return xLocation;
    }

    public int getY() {
        return yLocation;
    }
    
    // mutator
    public void loseHealth(int h) {
        System.out.println("you lost " + h + " health!");
        health -= h;
    }

    // Update location: given an x and y coordinate, update the player's location
}

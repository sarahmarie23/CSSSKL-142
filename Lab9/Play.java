public class Play {
    public static void main(String[] args) {
        // make a zombie
        Zombie zombie = new Zombie();
        
        // see the zombie's health
        System.out.println("Zombie health: " + zombie.getHealth());
        
        // zombie takes a hit
        zombie.takeDamage(3);
        
        // zombie dies
        zombie.takeDamage(10);
    }
}
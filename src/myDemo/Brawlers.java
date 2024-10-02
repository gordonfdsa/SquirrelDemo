

public class Brawlers {

    // instance variables
    private String name;
    private int hp;
    private int dmg;
    private double movementSpeed;
    private String skin;
    private double superChargeRate;
    private double range;

    /**
     * Constructor class to create new instance of brawlers
     * 
     * @param name
     * @param newHp
     * @param newDmg
     * @param newMovementSpeed
     * @param newSkin
     * @param newSuperChargeRate
     * @param newRange
     */
    public Brawlers(String newName, int newHp, int newDmg, double newMovementSpeed, String newSkin,
            double newSuperChargeRate, double newRange) {
        name = newName;
        hp = newHp;
        dmg = newDmg;
        movementSpeed = newMovementSpeed;
        skin = newSkin;
        superChargeRate = newSuperChargeRate;
        range = newRange;
    }

    // instance methods
    public void shoot() {
        System.out.println(this.name + " has landed a shot and dealt " + this.dmg + " damage.");
    }

    public void useSuper() {
        System.out.println(this.name + " used their super.");
    }

    public void takeDmg(int dmg) {
        this.hp -= dmg;
        this.hp = Math.max(this.hp, 0);

        System.out.println(this.name + " took some dmg. " + this.name + " has " + this.hp + " health left.");
    }

    public void changeSkin(String newSkin){
        System.out.println(this.name + " has changed their skin to: " + newSkin +".");
    }

}

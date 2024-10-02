

public class Main {

    public static void main(String[] args) {
        /*
         * Squirrel z;
         * Squirrel lol;
         * 
         * z = new Squirrel("red", "small");
         * lol = new Squirrel("black", "medium");
         * 
         * System.out.println("Z is a " + z.size + " and " + z.colour + " squrrel");
         */

        Brawlers shelly = new Brawlers("Shelly", 6400, 2300, 1, "default", 0.3, 7);
        Brawlers byron = new Brawlers("Byron", 5200, 2280, 0.8, "Wizard Byron", 0.33334, 10);
        Brawlers piper = new Brawlers("Piper", 4800, 3400, 0.8, "default", 0.5, 10);
        Brawlers darryl = new Brawlers("Darryl", 10000, 3350, 1, "default", 0.25, 4);

        shelly.shoot();
        shelly.changeSkin("Star Shelly");

        darryl.takeDmg(1000);
        darryl.useSuper();

        byron.shoot(); 
    }

}

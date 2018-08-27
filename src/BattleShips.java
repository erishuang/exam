
import java.util.Map;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

class BattleShips {

    public static char fireShot(char[][] grid, Position shot) {
        // Implement me!
    	char[][] grid1 = new char[5][5];
    	//if((shot.getX()>5)||(shot.getX()<0)||(shot.getY()>5)||(shot.getY()<0)){
    		//return 
    	//}
        return 'A';
    }

    public static Map<Character, Integer> findShips(char[][] grid) {
        // Implement me!
    	Hashtable<Character, Integer> res = new Hashtable<Character, Integer>();
    	
    	
        return res;
    }

    public static List<Character> fireShots(char[][] grid, List<Position> shots) {
        // Implement me!
    	ArrayList<Character> output = new ArrayList<Character> ();
    	
    	
        return output;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please execute this program by"
                    + " providing the path to a game file,"
                    + " e.g. java BattleShips ./game01.txt");
            System.exit(1);
        }

        char[][] grid = BattleShipsUtils.parseGrid(args[0]);

        System.out.println("Playing with grid: ");
        BattleShipsUtils.printGrid(grid);

        Position centreShot = new Position(grid.length / 2,
                                           grid.length / 2);
        System.out.println("\nFiring Shot at centre " +
                            centreShot.toString() + " ...");
        fireShot(grid, centreShot);

        System.out.println("\nGenerating shots ...");
        List<Position> shots = BattleShipsUtils.generateShots(grid.length,
                                    grid.length * 2);
        System.out.println("Shots: " + shots);

        System.out.println("\nFinding Ships ...");
        Map<Character, Integer> ships = findShips(grid);
    	if(ships != null) {
           for (Character ship : ships.keySet())
             System.out.println(ship + " has size " + ships.get(ship));
    	}

        System.out.println("\nFiring shots ...");
    	if(shots != null) {
            List<Character> destroyedShips = fireShots(grid, shots);
    	    if (destroyedShips != null && !destroyedShips.isEmpty()) {
    	        System.out.println("Destroyed ships: ");
    	        for(char ship : destroyedShips)
    	            System.out.println(ship);
    	    }
    	}
    }
}
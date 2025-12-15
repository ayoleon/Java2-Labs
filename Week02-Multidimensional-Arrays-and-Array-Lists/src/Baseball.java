import java.util.*; //one of javas core utility packages -- for arraylists
import java.text.DecimalFormat;

public class Baseball {
    String playerName;
    String[] team1 = new String[9];
    Scanner input = new Scanner(System.in);

    void playerData() { //METHOD TO INPUT PLAYERS NAMES INTO ARRAY
        for (int i = 0; i < team1.length; i++) {
            System.out.println("Enter players name: ");
            team1[i] = input.nextLine();
        }
        playerDisplay();
    }

    void playerDisplay() { //METHOD TO DISPLAY NAMES FROM ARRAY
        for (int i = 0; i < team1.length; i++) {
            System.out.println(team1[i]);
        }
    }

    void scoreBoard() { //SCOREBOARD METHOD using 2-dimensional array
        String[][] scoreboard = new String[3][10]; //3 rows , 10 columns. STRING type for labels

        //SCOREBOARD LABELS
        scoreboard[0][0] = "inning";
        scoreboard[1][0] = "Team1";
        scoreboard[2][0] = "Team2";
        for (int i = 1; i < scoreboard[0].length; i++) {
            scoreboard[0][i] = Integer.toString(i); //convert int to string, since ARRAY is string type
        }

        for (int i = 1; i < scoreboard.length - 1 ; i++ ) { //-1 because length is 3, only want to access up to scoreboard[2]
            for (int j = 1; j < scoreboard[i].length ; j++) {
                System.out.println("Enter " + scoreboard[i][0]+ "'s score for inning #" + j + ":");
                scoreboard[i][j] = input.nextLine();
                System.out.println("Enter " + scoreboard[i + 1][0] + "'s score for inning #" + j + ":");
                scoreboard[i + 1][j] = input.nextLine();
            }
        }

        for (int i = 0; i < scoreboard.length; i++) {
            for (int j = 0; j < scoreboard[i].length; j++) {
                System.out.print(scoreboard[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void playerRoster() { //USING ARRAY LIST
        ArrayList<String> players = new ArrayList<String>();
        for (int i = 1; i < 10; i++) {
            System.out.println("Enter Player #" + i + "'s name:");
            String name = input.nextLine();
            players.add(name); //ADD EACH INPUT TO ARRAYLIST
        }
        System.out.println("Player Roster: \n" + players); //prints arraylist as a set
    }


    public static void main(String[] args) {
        Baseball team = new Baseball();
        //team.playerData();
        //team.scoreBoard();
       team.playerRoster();
        //BaseballPlayers team1 = new BaseballPlayers();
        //team1.ArrayofPlayers();
        //team1.ArraylistofPlayers();
    }
}

class BaseballPlayers{
    String name, position;
    double Salary;
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    //constrictor
    BaseballPlayers(String name,String position, double Salary){
this.name = name;
this.position = position;
this.Salary = Salary;
    }
    BaseballPlayers(){

    }
    // Display method
    void display() {
        System.out.println("Name: " + name +
                " - Position: " + position +
                " - Salary: $" + df.format(Salary));
    }

    //array of class objects, user input
    void ArrayofPlayers(){
        BaseballPlayers[] players = new BaseballPlayers[3]; //DECLARE ARRAY OF 3 PLAYERS
        for(int i = 0; i < players.length; i++){
            System.out.println("Enter Player " + (i + 1) + "'s name:" );
            String name = input.nextLine();
            System.out.println("Enter position:");
            String position = input.nextLine();
            System.out.println("Enter salary:" );
            Double salary = input.nextDouble();
            input.nextLine(); //CLEARS BUFFER
            players[i] = new BaseballPlayers(name,position,salary); //ASSIGNS VALUES TO ARRAY
        }
        // display results
        System.out.println("\nPlayers:");
        for (int i = 0 ; i < players.length; i++) {
            players[i].display();
        }
    }

    //ARRAY LIST OF CLASS OBJECTS
    void ArraylistofPlayers(){
        //creating ArrayList
        ArrayList<BaseballPlayers> list = new ArrayList<BaseballPlayers>();
        BaseballPlayers p1 = new BaseballPlayers("Leon","Catcher",25000); //creating classes
        BaseballPlayers p2 = new BaseballPlayers("Tamia","Pitcher",30000);
        list.add(p1); //adding to ArrayList
        list.add(p2);

        //for each
        /*
        for(BaseballPlayers p : list){
            p.display();
        }
        */


        //iterator
        Iterator<BaseballPlayers> itr = list.iterator();
        while (itr.hasNext()) {
            BaseballPlayers p = itr.next();
            p.display();
        }

    }


    }

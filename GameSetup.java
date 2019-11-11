import java.util.ArrayList;
/**
 * Setting up the game by adding the creatures to an array.
 *
 * @author Kazeem Azeez
 * @version 2019.08.11
 */
public class GameSetup
{
    // instance variables - replace the example below with your own
    ArrayList<Creature> army = new ArrayList<Creature>();

    /**
     * Constructor for objects of class GameSetup
     */
    public GameSetup()
    {
       for (int i = 0; i < 9; i++){
           army.add(new Human());
       }
       
       for (int i = 0; i < 4; i++){
           army.add(new Elf());
       }
       
       for (int i = 0; i < 3; i++){
           army.add(new Cyberdemon());
       }
       
       for (int i = 0; i < 3; i++){
           army.add(new Balrog());
       }
       
       for (int i = 0; i < 9; i++){
           army.add(new Demon());
       }
       
       
    }

}

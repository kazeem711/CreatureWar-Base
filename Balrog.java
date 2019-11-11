
/**
 * Write a description of class Balrog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_HUMAN_HP = 40;
    private static final int MIN_HUMAN_HP = 8;
    private static final int MAX_HUMAN_STR = 25;
    private static final int MIN_HUMAN_STR = 5;

    /**
     * Constructor for objects of class Human
     */
    public Balrog()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super();
        
        
          
    }
    
    /**
     * method called damageBoost
     * 10% chance to do magical damage
     */
  
    public int damage(){
        return super.damage() + super.damage();
    }

}

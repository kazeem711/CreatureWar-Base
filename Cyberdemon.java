
/**
 * Write a description of class Cyberdemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cyberdemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_HUMAN_HP = 100;
    private static final int MIN_HUMAN_HP = 8;
    private static final int MAX_HUMAN_STR = 18;
    private static final int MIN_HUMAN_STR = 5;

    /**
     * Constructor for objects of class Human
     */
    public Cyberdemon()
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
    @Override
    public int damage(){
        //int damage2 = Randomizer.nextInt(10)+1;
        int dHit = Randomizer.nextInt(MAX_HUMAN_STR-MIN_HUMAN_STR)+MIN_HUMAN_STR;
        
        //int doubleHit;
        return dHit;
    }

}

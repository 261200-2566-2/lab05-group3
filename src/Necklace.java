public class Necklace implements Accessories{ // Necklace , Can only Equip by Wizard
    private final double AtkIncreasedByNecklace; // Stats increase to Character

    /** Create an Object of Necklace Class.
     * effects: Initialize a Necklace status
     */
    Necklace(){ // Necklace Constructor
        AtkIncreasedByNecklace = 5;
    }

    /** Get A Necklace status.
     *
     * @return Necklace Atk status
     */
    public double getStats(){ // get Atk Increase to Character from Necklace
        return AtkIncreasedByNecklace;
    }
}

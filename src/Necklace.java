public class Necklace implements Accessories{ // Necklace , Can only Equip by Wizard
    private final double AtkIncreasedByNecklace; // Stats increase to Character
    Necklace(){ // Necklace Constructor
        AtkIncreasedByNecklace = 5;
    }
    public double getStats(){ // get Atk Increase to Character from Necklace
        return AtkIncreasedByNecklace;
    }
    public int typeCheck(){ // If 1 It's ring | if 2 It's Necklace
        return 2;
    }
}

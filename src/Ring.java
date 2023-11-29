public class Ring implements Accessories{ // Ring , Can only equip by Warrior
    private final double HpIncreasedFromRing; // Stats increase to Character
    Ring(){ // Ring constructor
        HpIncreasedFromRing = 10;
    }
    public double getStats(){ // get Hp Increased From Ring
        return HpIncreasedFromRing;
    }
    public int typeCheck(){ // If 1 It's ring | if 2 It's Necklace
        return 1;
    }
}

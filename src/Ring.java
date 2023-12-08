public class Ring implements Accessories{ // Ring , Can only equip by Warrior
    private double HpIncreasedFromRing; // Stats increase to Character

    /** Create a Ring Object.
     * effects: set the stats of ring
     */
    Ring(){ // Ring constructor
        HpIncreasedFromRing=10;
    }

    /** Get Status of this ring.
     * @return Hp stat of this ring
     */
    public double getStats(){ // get Hp Increased From Ring
        return HpIncreasedFromRing;
    }
}

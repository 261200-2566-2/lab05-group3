public class Main {
    public static void main(String[] args) {
        Warrior w = new Warrior(10);
        Wizard z = new Wizard(10);
        Ring r = new Ring();
        Necklace n = new Necklace();
        z.EquipAccessories(r);
        z.EquipAccessories(n);
        z.printStat();
    }
}
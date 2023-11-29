public class Warrior implements Character{ // Warrior have advantages over Wizard on ATK and HP
    private int level;
    private double maxHp, currentHp, maxMana, currentAtk=15, currentDef=5, currentMana;

    public Warrior(int level){ // Warrior Constructor | Stats init different from Wizard
        this.level = level;
        maxHp = 100+15*level;
        maxMana = 50+2*level;
        currentHp = maxHp; // Set HP
        currentMana = maxMana; // Set Mana
    }

    public void heal(){
        if(currentMana < 7) System.out.println("You can't // Don't have Enough Mana !"); // No mana to consume
        currentHp += 5;
        if(currentHp > maxHp) currentHp = maxHp; // Over Max
        currentMana -= 7;
    }
    public void levelUp(){ // Different from Wizard
        level++;
        maxHp = 100+15*level;
        maxMana = 50+2*level;
    }

    public void attack(Character target){
        target.getAttacked(currentAtk);
    }

    public void getAttacked(double atk){
        currentHp -= atk-0.7*currentDef;
    } // Different From Wizard (Stronger than Wizard) Damage reduced less than wizard

    public void EquipAccessories(Accessories a){ // Warrior can Equip only ring // Can't Equip Necklace
        if(a.typeCheck() == 1){ // Case Ring
            maxHp += a.getStats(); // Hp stats from Ring
        }else{ // Case Necklace
            System.out.println("<<< You can't Equip Necklace // Only Wizard Can ;) >>>");
        }
    }

    public void printStat(){
        System.out.println("=======================================");
        System.out.println("Character Class: Warrior\nMaxHp: "+maxHp+"\nCurrentHp: "+currentHp+"\nMaxMana: "+maxMana+"\nCurrentMana: "+currentMana+"\nCurrentAtk: "+currentAtk+"\nCurrentDef: "+currentDef);
        System.out.println("=======================================");
    }
}

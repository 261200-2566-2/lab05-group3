public class Wizard implements Character{ // Wizard have advantages over Warrior on DEFENSE and MANA
    private int level;
    private double maxHp, currentHp, maxMana, currentAtk=5, currentDef=15, currentMana;

    public Wizard(int level){ // Warrior Constructor | Stats init different from Warrior
        this.level = level;
        maxHp = 50+10*level;
        maxMana = 50+4*level;
        currentHp = maxHp; // Set HP
        currentMana = maxMana; // Set Mana
    }

    public void heal(){
        if(currentMana < 10) System.out.println("You can't // Don't have Enough Mana !"); // No mana to consume
        currentHp += 10;
        if(currentHp > maxHp) currentHp = maxHp; // Over Max
        currentMana -= 10; // Consume Mana to heal
    }
    public void levelUp(){ // Difference from Warrior
        level++;
        maxHp = 50+10*level;
        maxMana = 50+4*level;
    }

    public void attack(Character target){
        target.getAttacked(currentAtk);
    }

    public void getAttacked(double atk){ // Damage Reduced Different from Warrior ( More dmg taken than warrior) [ vulnerable]
        currentHp -= atk-0.3*currentDef;
        if(currentHp < 0) currentHp = 0;
    }

    public void EquipAccessories(Accessories a){ // Wizard can Equip only necklace | Can't Equip Ring
        if(a.typeCheck() == 2){ // Case Necklace
            currentAtk += a.getStats();
        }else{ // Case Ring | Can't do it Return an Error Message
            System.out.println("<<< You can't Equip Ring // Only Warrior Can ;) >>>");
        }
    }

    public void printStat(){ // Print Wizard Stats
        System.out.println("=======================================");
        System.out.println("Character Class: Wizard\nMaxHp: "+maxHp+"\nCurrentHp: "+currentHp+"\nMaxMana: "+maxMana+"\nCurrentMana: "+currentMana+"\nCurrentAtk: "+currentAtk+"\nCurrentDef: "+currentDef);
        System.out.println("=======================================");
    }
}

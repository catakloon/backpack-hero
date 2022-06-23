//------------------------------------------------------------------------------
// @author       Anthony Sin
// Date          Unknown
// Description   Defining Hero, extends from unit class. Holds XP, levels and
//               other important variables from Unit
//------------------------------------------------------------------------------

import javax.swing.*;

public class Hero extends Unit {
    
    private int xp;
    private int[] maxXP = { 0, 10, 15, 20, 25, 30, 999};
    private int level;

    public int getXp() {
        return this.xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int[] getMaxXP() {
        return this.maxXP;
    }

    public void setMaxXP(int[] maxXP) {
        this.maxXP = maxXP;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void changeXP(int n) {
        this.xp += n;
    }


    public Hero(ImageIcon i) {
        super(35, i);
        this.xp = 0;
        this.level = 1;
    }

    public void checkLevelUP() {
        if (this.level != 6 && this.xp >= this.maxXP[this.level]) {
            levelUp();
        }
    }
    public void levelUp() {
    	this.xp -= this.maxXP[level];
        this.level++;
        this.maxHP += 5;
        this.hp += 5;
        Main.setUnlockable(true);
    }
}
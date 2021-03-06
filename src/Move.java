//------------------------------------------------------------------------------
// @author       Anthony Sin
// Date          Unknown
// Description   Defining Enemy moves, keep track of the type and the damage/heal value
//------------------------------------------------------------------------------
public class Move {
    
    /*
        possible moves (types)
      
        1 damage stage 1
        2 add armor
        3 add poison
        4 add hp
        5 add regen
        6 (Boss) summon enemies
     */

    // instance variables
    private int type;
    private int value;

    // getters and setters
    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // constructor
    public Move(int a, int b) {
        this.type = a;
        this.value = b;
    }
}
import java.util.ArrayList;

public class Army {
    private ArrayList<Warrior> armyList;

    Army() {
        this.armyList = new ArrayList<>();
    }

    public void armyRecruiting(Warrior warrior) {
        armyList.add(warrior);
    }

    public int armySize() {
        return armyList.toArray().length;
    }
}

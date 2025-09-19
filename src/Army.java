import java.util.ArrayList;

public class Army {
    private ArrayList<Warrior> armyList;

    Army(int[] armyList) {
        this.armyList = new ArrayList<>();
    }

    public void armyRecruiting(Warrior warrior) {
        armyList.add(warrior);
    }
}

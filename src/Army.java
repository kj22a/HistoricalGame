import java.util.ArrayList;

public class Army {
    private ArrayList<Warrior> Warriors;

    Army() {
        this.Warriors = new ArrayList<>();
    }

    public void addWarrior(Warrior warrior) {
        Warriors.add(warrior);
    }

    public int armySize() {
        return Warriors.toArray().length;
    }
}

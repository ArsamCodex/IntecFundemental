package plant_enities;

public class Tree extends Plant {

    private LeafType leafType;

    public Tree(String name) {
        super(name);
    }

    public Tree(String name, double height) {
        super(name, height);
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "Name = " + super.getName()+"  " +
                "leafType=" + leafType + " "+
                "Height =" + super.getHeight()+
                '}';
    }
}

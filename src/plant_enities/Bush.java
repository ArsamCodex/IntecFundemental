package plant_enities;

public class Bush extends Plant {

    private String fruit;
    private LeafType leafType;

    public Bush(String name) {
        super(name);
    }

    public Bush(String name, double height) {
        super(name, height);
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
         return " { Bush    ->  {" +
                "Name = " +
                super.getName()+
                "  "+
                "Height = " + " "+

                super.getHeight()+
                "  " +
                 "Frui = " + fruit +

                ", leafType=" + leafType +
                '}';
    }
}

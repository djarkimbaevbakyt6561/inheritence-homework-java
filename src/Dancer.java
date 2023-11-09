public class Dancer extends Person {
    String groupName;

    public Dancer() {
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void dancing(String dance) {
        System.out.println( "Участник группы " + groupName + " под именем " + name + " под должностью " + designation + " танцует танец " + dance);
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}

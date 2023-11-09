public class Programmer extends Person {
    String companyName;

    public Programmer() {}

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void coding(String language) {
        System.out.println("Программист под именем " + name + " c должностью " + designation + " работаяющий в компании " + companyName + " пишет код на языке " + language);

    }
}

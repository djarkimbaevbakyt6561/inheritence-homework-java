public class Person {
    String name;
    String designation;
    public Person(){}
    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn(String text){
        System.out.println(name + " под должностью " + designation + " учит " + text);
    }
    public void walk(String street){
        System.out.println(name + " под должностью " + designation + " гуляет на " + street);
    }
    public void eat(String food){
        System.out.println(this.name + " под должностью " + this.designation + " кушает " + food);
    }

}

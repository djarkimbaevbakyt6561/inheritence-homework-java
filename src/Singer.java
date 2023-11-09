public class Singer extends Person {
    String bandName;

    public Singer() {}

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void singing(String sing) {
        System.out.println("Участник банды "+ bandName + ", под именем " + name + " поет песню под названием " + sing);
    }

    public void playGuitar(String music) {
        System.out.println("Участник банды "+ bandName + ", под именем " + this.name + " играет музыку на гитаре под названием " + music);

    }
}

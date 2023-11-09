public class Main {
    public static void main(String[] args) {
        Dancer dancer = new Dancer("Аделя", "танцор высшего ранга", "Тигры");
        dancer.dancing("лезгинка");
        dancer.eat("лагман");
        dancer.learn("английский язык");
        dancer.walk("парке");
        System.out.println(dancer);

        Singer singer = new Singer("Бектур", "второй певец", "Рокнрол");
        singer.singing("медузаааа");
        singer.eat("манты");
        singer.learn("рисовать");
        singer.walk("Тыныстанова");
        singer.playGuitar("сектор газа");
        System.out.println(dancer);

        Programmer programmer = new Programmer("Бакыт", "Strong junior front-end developer", "Peaksoft");
        programmer.coding("java");
        programmer.eat("курицу");
        programmer.learn("java");
        programmer.walk("Манас");
        System.out.println(dancer);

    }
}
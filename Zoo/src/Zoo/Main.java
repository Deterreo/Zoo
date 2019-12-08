package Zoo;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("JHon");
        Worker worker2 = new Worker("Addams");
        Worker worker3 = new Worker("Bill");

        Animal pet1 = new Animal("Tiger");
        pet1.setRightFood("meat");
        Animal pet2 = new Animal("Wolf");
        pet2.setRightFood("meat");
        Animal pet3 = new Animal("Goat");
        pet3.setRightFood("grass");

        // Призначаємо працівникам тварин
        worker1.takeCare(pet1);
        worker2.takeCare(pet2);
        worker3.takeCare(pet3);

        // Працівники годують тварин
        try {
            String res;
            res = worker1.feed("meat");
            System.out.print(res);
            //res = worker2.feed("meat");
            res = worker2.feed("grass");
            System.out.print(res);
            res = worker3.feed("grass");
            System.out.print(res);
        } catch (WrongTypeOfFood e) {
            System.out.print(e.getMessage());
        }
    }
}
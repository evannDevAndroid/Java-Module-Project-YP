import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Race race = new Race();
        Car[] cars = new Car[3];

        for (int i = 0; i < 3; i++) {

            System.out.print("Введите название автомобиля №" + (i + 1) + ": ");
            String name = scanner.next();

            int speed = 0;

            while (true) {
                System.out.print("Введите скорость автомобиля №" + (i + 1) + ": ");
                speed = scanner.nextInt();
                if (speed > 0 && speed <= 250) {
                    break;
                } else {
                    System.out.println("Ошибка! Скорость должна быть больше 0 и меньше 251.");
                }
            }

            cars[i] = new Car(name, speed);
            race.checkLeader(cars[i]);
        }

        System.out.println("Самая быстрая машина: " + race.getLeader());
        scanner.close();
    }

}








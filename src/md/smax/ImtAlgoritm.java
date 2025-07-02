package md.smax;
// Подключение библиотки
import java.util.Scanner;

public class ImtAlgoritm {
    public static void main(String[] args) {
//        Объявление объекта
        Scanner scanner = new Scanner(System.in);

//        Получение данных от пользователя
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();
        System.out.print("Введите ваш рост в см: ");
        int height = scanner.nextInt();
        System.out.print("Введите ваш вес в кг: ");
        double weight = scanner.nextDouble();

//        Рассчет ИМТ (Индекс Массы Тела)
        double heightInMeters = height / 100.0;
        double bmi = weight / Math.pow(heightInMeters, 2);

//        Определение категории на основе ИМТ
        System.out.print("Здраствуйте, " + name + ". ");

        String humanAge = age < 18
                ? "Результаты могут быть неточны для несовершеннолетних. " + "Ваш ИМТ - " + bmi
                : "Ваш ИМТ - " + bmi;
        System.out.println(humanAge);

        if (bmi < 18.5) {
            System.out.println("Категория: Недовес");
        } else if (bmi <= 24.9 && bmi >= 18.5) {
            System.out.println("Категория: Норма");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Категория: Избыточный вес");
        } else if (bmi >= 30) {
            System.out.println("Категория: Ожирение");
        }
    }
}

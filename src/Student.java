import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    private int studentAge;

    public void studentFio() {
        System.out.println("Введите Имя студента");
        String a = sc.next();
        System.out.println("Введите Фамилию студента");
        String b = sc.next();
        System.out.println("Введите Отчество студента");
        String c = sc.next();
        System.out.println("Введите Возраст студента");
        int d = sc.nextInt();
        System.out.print("Выберите предмет 1 - Алгебра" +
                " 2 - Русский язык " +
                " 3 - Информатика");

        int m = sc.nextInt();

        switch (m) {
            case 1:
                System.out.println("Выбранный предмет алгребра");
                break;
            case 2:
                System.out.println("Выбранный предмет русский язык");
                break;
            case 3:
                System.out.println("Выбранный предмет информатика");
        }

        System.out.println("Ваше Имя : " + a);
        System.out.println("Ваша Фамилия : " + b);
        System.out.println("Ваше Отчество : " + c);
        System.out.println("Ваш возраст : " + d);

    }

}

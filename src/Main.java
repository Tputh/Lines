public class Main {
    public static void main(String[] args) {

        team1();
        team2();
        team3();

    }

    public static void team1() {

        System.out.println("Дз. Строки");

        System.out.println("Задача 1");

        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);
    }

    public static void team2() {

        System.out.println("Задача 2");

        String firstName = "ivan ";
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        String middleName = "ivanovich ";
        middleName = middleName.substring(0, 1).toUpperCase() + middleName.substring(1);
        String lastName = "ivanov ";
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        String fullName = lastName + firstName + middleName;
        System.out.println( "Данные ФИО сотрудника для заполнения отчета  " + fullName);
    }
    public static void team3() {

        System.out.println("Задача 3");

        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}

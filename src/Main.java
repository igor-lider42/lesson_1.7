public class Main {
//    ### **Задание 1**
//Представим, что мы работаем в небольшой компании.
// Данные сотрудников хранятся в неструктурированном формате,
// и бухгалтерия попросила написать программу,
// в которой можно работать с Ф.И.О. сотрудников.
//Напишите четыре строки:
//первая с именем firstName — для хранения имени;
//вторая с именем middleName — для хранения отчества;
//третья с именем lastName — для хранения фамилии;
//четвертая с именем fullName — для хранения Ф.И.О. сотрудника в формате "Фамилия Имя Отчество".
//Выведите в консоль фразу: “ФИО сотрудника — ….”
//В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
public static void main(String[] args) {
    task1();
    task2();
    task3();



    String phone = "960-415-75 37";
    phone = phone.replace("-", "");
    phone = phone.replace(" ", "");
    phone = phone.replace("+", "");
    if (phone.length() == 10) {
        phone = "7" + phone;
    } else if (phone.length() > 11) {
        throw new RuntimeException("Телефон слишком длинный");
    } else if (phone.length() < 10) {
        throw new RuntimeException("Телефон слишком короткий");
    } else if (phone.length() == 11 && phone.charAt(0) != '7') {
        throw new RuntimeException("Среди рас посторонний!");
    }
    System.out.println("phone = " + phone);
    String expectedPhone = "79604157537";
    if (phone.equals(expectedPhone)) {
        System.out.println("Успех");
    } else {
        System.out.println("Неудача");
    }
}

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника —" + fullName);

        System.out.println();
    }
//Задание 2
//Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии
// нужны Ф. И. О. сотрудников, полностью написанные заглавными буквами (верхним регистром).
//Напишите программу, которая изменит написание Ф. И. О. сотрудника с "Ivanov Ivan Ivanovich"
// на полностью заглавные буквы.
//В качестве строки с исходными данными используйте строку fullName.
//Результат программы выведите в консоль в формате: "Данные ФИО сотрудника для заполнения отчета — …"
    public static void task2() {
        System.out.println("Задача 2");
        String fullName = "Ivanov Ivan Ivanovich";
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета —" + upperFullName);

        System.out.println();
    }

    //Задание 3
//Система, в которой мы работаем, не принимает символ "ё".
//Поэтому нам нужно написать программу, которая заменяет символ "ё" на символ "е".
//В качестве исходных данных используйте строку fullName и данные в ней "Иванов Семён Семёнович".
//Выведите результат программы в консоль в формате: "Данные ФИО сотрудника — ..."
    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника —" + fullName.replace("ё", "е"));

        System.out.println();
    }
}
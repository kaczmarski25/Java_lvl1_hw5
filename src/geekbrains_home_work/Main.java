package geekbrains_home_work;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        employeeArray();
    }

//  Создание массива из 5 сотрудников
    public static void employeeArray(){
        Person[] employeeArray = new Person[5];
        employeeArray[0] = new Person ("Ivanov", "Director", "111111@gmail.com", 375672534, 1000, 45 );
        employeeArray[1] = new Person ("Petrov", "Engineer", "111112@gmail.com", 375290876, 900, 35 );
        employeeArray[2] = new Person ("Ivanova", "HR", "111113@gmail.com", 375290182, 800, 25 );
        employeeArray[3] = new Person ("Sidorova", "Cleaner", "1111@gmail.com", 375290189, 200, 60 );
        employeeArray[4] = new Person ("Sidorov", "Security", "111456@gmail.com", 375295672, 400, 50 );
        for (int i = 0; i < employeeArray.length; i++)
//  Вывод информации о сотрудниках старше 40 лет
            if (employeeArray[i].age > 40) employeeArray[i].printPerson();

    }

}

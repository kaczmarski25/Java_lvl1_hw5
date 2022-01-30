package geekbrains_home_work;



public class Person { //Создан класс сотрудник
    String fio;
    String position;
    String email;
    int phone;
    int cash;
    int age;

//Конструктор класса
    public Person (String fio,String position,String email,int phone, int cash, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.cash = cash;
        this.age = age;
    }
//Метод, внутри класса "Сотрудник",  выводящий информацию на консоль
    public void printPerson(){
        System.out.println("Информация о сутруднике(ах) старше 40 лет: " + fio + ", " + position + ", " + email + ", " + phone + ", " + cash +", " + age + ".");
    }


}

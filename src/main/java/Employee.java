public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int pay;
    private int age;

    public Employee (String name, String position, String email, String phone, int pay, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + name + "   Должность: " + position + "   e-mail: " + email + "   тел. №: " + "   З/плата: " + pay + "   Возвраст: " + age);

    }
    public int getAge(){
        return age;
    }
}

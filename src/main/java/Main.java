public class Main {
    public static void main(String[] args) {
        Employee[] employeeArr = new Employee[5];
        employeeArr[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employeeArr[1] = new Employee("Vasiliy Petrov", "Engineer", "petrovVV@mailbox.com", "89211234567", 32000, 37);
        employeeArr[2] = new Employee("Ekaterina Gushina", "Bookkeeper", "gushina86@gmail.com", "89993478762", 30000, 35);
        employeeArr[3] = new Employee("Alexander Matveev", "Security", "AAM78@mail.ru", "89111785236", 25000, 48);
        employeeArr[4] = new Employee("Gennady Emelyanov", "Director", "Emelyanov_G@mailbox.com", "89052697929", 98000, 41);
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getAge() > 40) employeeArr[i].printInfo();
        }
    }
}

package classedate;


public class ClasseDateTeste {

    public static void main(String[] args) {
        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);
        Employee employee = new Employee("Higor", "Martins", birth, hire);
        
        
        System.out.println(employee);
    }

}

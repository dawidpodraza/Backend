public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.imie = "Mariusz";
        employee1.nazwisko = "Czarny";
        employee1.rok = 1989;
        employee1.staz = 2.5;

        Employee employee2 = new Employee();
        employee2.imie = "Jan";
        employee2.nazwisko = "Kowalski";
        employee2.rok = 1986;
        employee2.staz = 3.1;

        Employee employee3 = new Employee();
        employee3.imie = "Kamil";
        employee3.nazwisko = "Bury";
        employee3.rok = 1962;
        employee3.staz = 7.3;


        System.out.println("Pierwszy pracownik: "+employee1.imie+" "+employee1.nazwisko);
        System.out.println("Drugi pracownik: "+employee2.imie+" "+employee2.nazwisko);
        System.out.println("Trzeci pracownik: "+employee3.imie+" "+employee3.nazwisko);
    }
}



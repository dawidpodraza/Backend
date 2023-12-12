public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.imie="Jan";
        person1.nazwisko="Kowalski";
        person1.pesel = "89213234";


        Adress adress1 = new Adress();
        adress1.miasto = "Częstochowa";
        adress1.numer = 15;
        adress1.ulica = "Mickiewicza";

        person1.adress = adress1; //prypisanie adresu do person1


        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 12.000;

        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.moneyBorrowed = 5.000;





        Person person2 = new Person();
        person2.imie="Kamil";
        person2.nazwisko="Jaki";
        person2.pesel = "90213244";

        person2.adress = adress1;

        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 7.000;

        Credit credit2 = new Credit();
        credit2.borrower = person2;
        credit2.moneyBorrowed = 3.000;



        System.out.println(person1.adress.miasto);
        System.out.println(person2.adress.miasto);

    }
}



public class Introduction {

    DiscountService discountService = new DiscountService();
    public void mainInfo(Client client,double price){
        secInfo(client);
        System.out.println("Kwota przed rabatem " + price);
        System.out.println("Kwota po rabacie " +discountService.calculateDiscountPrice(client,price) );
    }

    private void secInfo(Client client){
        if(client.getLastName()==null && client.getFirstName()!=null){
            System.out.println("Witaj "+client.getFirstName());
        }
        else if(client.getFirstName()!=null && client.getLastName() != null){
            System.out.println("Witaj "+client.getFirstName()+" "+client.getLastName());
        }
        else if(client.getFirstName()==null && client.getLastName()!=null){
            System.out.println("Witaj panie "+client.getLastName());
        }
        else if(client.getFirstName()==null && client.getLastName()==null){
            System.out.println("Witaj nieznajomy");
        }
        else{
            System.out.println("Wystąpił wyjątek sprawdź klase Introduction");
        }
    }
}

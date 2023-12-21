public class Main {
    public static void main(String[] args) {

        Client client1 = new Client( null,"Kowalski", true);


        Client client2 = new Client("Karol", null, false);

        Client client3 = new Client(null,null,false);



        Introduction introduction = new Introduction();

        introduction.mainInfo(client1,1100);
        introduction.mainInfo(client2,1100);
        introduction.mainInfo(client3,900);



    }
}
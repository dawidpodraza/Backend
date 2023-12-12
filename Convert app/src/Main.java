public class Main {
    public static void main(String[] args) {
        ConvertDistance cd = new ConvertDistance();
        ConvertTime ct = new ConvertTime();


        System.out.println(ct.secondsToMiliseconds(ct.minutesToSeconds(ct.hourToMinutes(1))));



    }
}
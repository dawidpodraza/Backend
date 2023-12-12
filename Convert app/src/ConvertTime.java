public class ConvertTime {
    double hourToMinutes(double x){
        return x*=60;
    }

    double minutesToSeconds(double x){
        return x*=60;
    }

    double secondsToMiliseconds(double x){
        return x*=1000;
    }

    double hourToMiliseconds(double x){
        return x=x*60*60*1000;
    }
}

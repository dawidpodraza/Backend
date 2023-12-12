public class ConvertDistance {
    double meterToCent(double x){
        return x*=100;
    }

    double meterToMili(double x){
        return x*=1000;
    }

    double centToMeter(double x){
        return x/=100;
    }

    double miliToMeter(double x){
        return x/=1000;
    }
}

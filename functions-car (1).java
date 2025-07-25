public class car{
    public static void main(String[] args){
        System.out.println(conversion(range_calc(50,10)));

    }
    static double range_calc(double fuel, double efficiency){
        double range = fuel * efficiency;
        return range;
    }
    static double conversion(double miles){
        double kilometers = 1.609*miles;
        return kilometers;
    }
}

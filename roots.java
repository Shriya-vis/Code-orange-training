public class roots{
    public static void main(String[] args){
        int a = 5;
        int b = 6;
        int c = 7;
        int result = b*b-4*a*c;
        if (result == 0){
            System.out.println("one root exists");
        }else if(result > 0){
            System.out.println("two roots exist");
        }else{
            System.out.println("no real roots exist");
        }

    }
}

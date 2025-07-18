public class EVEN_ODD {
    public static void main(String[] args){
        System.out.println(even_odd(3));
        System.out.println(even_odd(7));
        System.out.println(even_odd(10));


    }
    static boolean even_odd(int num){
        boolean is_even = false;
        if((num%2)==0){
            is_even = true;
        }
        return is_even;
    }
}

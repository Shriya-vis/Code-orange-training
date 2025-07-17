import java.util.ArrayList;

public class Prime {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i<50;i++){
            boolean is_prime = true;
            for (int x = 2;x<(i-1);x++){
                if ((i%x) == 0 ){
                    is_prime = false;
                    break;
                }
            }
            if (is_prime == true){
                list.add(i);
            }
        }
        System.out.println(list.size());
        
    }

}

import java.util.ArrayList;

public class Greatest {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        int greatest = 0;
        for (int i=0; i<list.size(); i++ ){
            if (list.get(i)>greatest){
                greatest = list.get(i);
            }
        }
        System.out.println(greatest);
    }
    
}

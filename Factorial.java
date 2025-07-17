
public class Factorial {
    public static void main(String[] args){
        int[] num_list = {1,2,3,4,5};
        int[] result = calculate(num_list);
        for (int i=0; i<5;i++){
            System.out.println(result[i]);
        }
    }
    static int[] calculate(int[] list){
        int[] new_list = new int[5]; 
        for (int i = 0; i<5; i++){
            int value = list[i];
            int factorial = 1;
            for (int x=1; x<(value+1); x++){
                factorial *= x;
            }
            new_list[i]=factorial;
        }
        return new_list;
    }
    
}   

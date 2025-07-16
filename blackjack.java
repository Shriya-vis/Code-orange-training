public class blackjack{
  public static void main(String[] args){
    int[] nums = {18,19,26,16,20,23,13,30,15,28};
    int max = 0 ;
    for (int i = 0; i < nums.length;i++){
      if (nums[i] > max && nums[i]<21){
        max = nums[i] ;
      }
    }
    System.out.println(max);
  }
}

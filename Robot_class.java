class robot{
    //public varriables
    public String team_name;
    public int team_number;
    //private varriables
    private int ball_scored = 0;
    private int climb_level = 0; 
    // constructor robot - no need to call this in main 
    public robot(String user_name, int team_number){
        this.team_name = user_name;
        this.team_number = team_number;
    }
    public int ball_count(int num){
        ball_scored += num;
        return ball_scored;
    }
    public int update_climb(int num){
        climb_level = num;
        return climb_level;
    }
    public int score_calculator(int user_ball, int user_climb){
        int total_score = 0;
        switch (user_climb){
            case 1:
                total_score = 4;
                break;
            case 2: 
                total_score = 6;
                break;
            case 3:
                total_score = 10;
                break;
            case 4:
                total_score = 15;
                break;
        }
        total_score += user_ball;
        return total_score;
    }
}
public class Robot_class{
    public static void main(String[] args){
        robot FRC = new robot("Code Orange",3476);
        
        int result = FRC.score_calculator(FRC.ball_count(10),FRC.update_climb(3));
        System.out.println(result);
    }
}
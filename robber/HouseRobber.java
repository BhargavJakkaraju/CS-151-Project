package robber;

/*
Name: Min Myat Thu
Partner A : Bhargav Jakkaraju
Partner B : Ryana Logan
*/

public class HouseRobber {
    public int rob (int[] nums){
        int previousTwo = 0;
        int previousOne = 0;

        for  (int money : nums) {
            int current = Math.max (previousOne, previousTwo + money);
            previousTwo = previousOne;
            previousOne = current;
        }

        return previousOne;
    }
    
}

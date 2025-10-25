class Solution {
    public int totalMoney(int n) {
        int money = 0;
        int days = 1;
        int week=0;
        int i=1;

        while(days<=n){
                money += i+week*1;
                i++;
                if(days%7==0){
                    week++;
                    i=1;
                }
                days++;
        }
        return money;
    }
}
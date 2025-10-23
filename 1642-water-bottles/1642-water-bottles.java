class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int exchange = numBottles/numExchange;

        int empty = 0;
        empty += numBottles;
        

        while(numBottles>=numExchange){
           exchange = numBottles/numExchange ;
           empty += exchange ;
           numBottles = exchange+numBottles%numExchange;
        }
        return empty;
    }
}
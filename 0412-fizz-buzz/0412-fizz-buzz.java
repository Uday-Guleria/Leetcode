class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList <String> fizzy = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                fizzy.add("FizzBuzz");
            }
            else if(i%3==0){
                fizzy.add("Fizz");
            }
            else if (i%5==0){
                fizzy.add("Buzz");
            }
            else{
                fizzy.add(i+"");
            }
        }
        return fizzy;
    }
}
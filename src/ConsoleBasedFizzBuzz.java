public class ConsoleBasedFizzBuzz implements FizzBuzz{
    @Override
    public void print(int from, int to){
        while (from <= to){
            if(from %5 == 0 && from%3== 0){
                System.out.println("FizzBuzz");
            }else if (from % 5 == 0){
                System.out.println("Buzz");
            }else if (from % 3 == 0){
                System.out.println("Fizz");
            }else {
                System.out.println(from);
            }
            from++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
      int counter=1;
      while (counter < 10000){
          PerfectFactor.isPerfect(counter);
          counter++;
      }
    }
}

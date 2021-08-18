public class PerfectFactor {
    public static boolean isPerfect(int number){
        int sum = 0;
        for(int counter=1; counter<number;counter++){
            if (number%counter==0){
                sum+=counter;
            }  
        }
        if (sum==number){
            int counter=1;
            while (counter<number) {
                if (number%counter==0){
                    System.out.printf("%s is a factor of %s%n", counter, number);
                }
                counter++;
            }
            System.out.println();
            return true;
        }else{
            return false;
        }   
    }

}

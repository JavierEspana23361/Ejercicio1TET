import java.util.*;

public class RandomGC {
    public void rgenandcompare(){
        Random random = new Random();
        boolean apto = false;
        int numP = random.nextInt(15000) + 1;
        int numA = random.nextInt(15000) + 1;
        int numB = random.nextInt(15000) + 1;
        if(numA > numB){
            if(numP >= numB && numP <= numA){
                apto = true;
            }
        }
        else if(numB > numA){
            if(numP >= numA && numP <= numB){
                apto = true;
            }
        }
        else if(numA == numB){
            if(numP == numA){
                apto = true;
            }
        }
    }
}

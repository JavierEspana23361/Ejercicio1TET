import java.util.*;

public class RandomLocal1 {
    Random random = new Random();
    private int voletos1 = 20;
    private int voletos2 = 20;
    private int voletos3 = 20;

    public int localgen(){
        int local = random.nextInt(3);
        if(local == 0){
            return voletos1;
        }
        else if(local == 1){
            return voletos2;
        }
        else if(local ==2){
           return voletos3;
        }else{
            return local;
        }
        
    }
}

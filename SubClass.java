import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.exit;

public class SubClass {
    public SubClass(){
        try {
            InputStreamReader istX = new InputStreamReader(System.in);
            BufferedReader bufferdReaderX = new BufferedReader(istX);
            String bufX = bufferdReaderX.readLine();
            int x = Integer.parseInt(bufX);
            int returnNum = method(x);
            System.out.println("Return Number of x*y ="+returnNum);
        }catch(IOException e){
            exit(0);
        }
    }

    public SubClass(int number){
        System.out.println("The constructer which has one argument is called.The argument is"+number);
    }

    public int method(int x){
        int num;
        num=x*x;
        return num;
    }
}

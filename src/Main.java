import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,y;
        x=in.nextInt();
        y=in.nextInt();
        if(y==1)
        {
            System.out.printf("%.1f\n",(x-80)*0.7);
        }
        else
            System.out.printf("%.1f\n",(x-70)*0.6);
    }
}


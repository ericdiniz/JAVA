import java.util.Scanner;

public class code {
    
    static int fun (int x, int y)
    {
        if(y == 0)
        return 0;
        else if( y == 1 )
        return 1;
        else
        return x + fun(x, y-1);
    }
    

    public static void main(String[] args) {
    
        int x = 14;
        int y = 60;

        //Scanner scanner = new Scanner(System.in);

        //x = scanner.nextInt();
        //y = scanner.nextInt();

        System.out.println(fun(x, y));


    }
}

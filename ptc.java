import java.io.*;
import java.util.*;

public class ptc 
{

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        assert(n>=1 && n<=4000);
        LinkedList list = new LinkedList();
        for(int i=0;i<n;i++)
        {
            int el = sc.nextInt();
            list.add(i, el);
        } 
        int q = sc.nextInt();
        for(int j=0;j<q;j++)
        {
            if(sc.next().equals("Insert"))
            {
                list.add(sc.nextInt(), sc.nextInt());
            }
            else
            {
                list.remove(sc.nextInt());
            }  
        }
        for(int p=0;p<list.size();p++)
        {
            System.out.print(list.get(p)+" ");
        }
    }
}
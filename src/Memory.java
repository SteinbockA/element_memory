/**
 * Created by 亦逍 on 2015/3/10 0010.
 */
public class Memory {
   int[][]a=new int[10][10];

    public void pringArray(int b)
    {
        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++)
                a[i][j]=(int)(Math.random()*(b+1));
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
                System.out.printf("%5d",a[i][j]);
                System.out.println();
        }



    }

}

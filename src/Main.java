/**
 * Created by MariusDK on 30.06.2017.
 */
public class Main{



    public static void main(String[] args)
    {
        int[] A={ 1, 5, 7, 8, 4, 3, 9};
        Main m=new Main();
        //m.MetodaSelectiei(A);
        //m.bubbleSort(A);
        //m.bubbleSortOptimizat(A);
        //m.quickSort(A,0,A.length-1);
        m.Afisare(A);
    }
    //Metoda selectiei
    public void MetodaSelectiei(int[] a)
    {
        int pozMinim;
        for (int i=0;i<a.length-1;i++)
        {
            pozMinim=i;
            for (int j=i+1;j<a.length;j++)
            {
                if (a[j]<a[pozMinim])
                {
                    pozMinim=j;
                }
            }
            if (a[pozMinim]<a[i])
            {
                int t=a[pozMinim];
                a[pozMinim]=a[i];
                a[i]=t;
            }
        }
    }
    //Metoda bubble sort
    public void bubbleSort(int[] a)
    {
     boolean ok=false;
     while (ok==false)
     {
         ok=true;
         for (int i=1;i<a.length;i++)
         {
             if (a[i-1]>a[i])
             {
                 ok=false;
                 int t=a[i];
                 a[i]=a[i-1];
                 a[i-1]=t;

             }
         }
     }
    }
    public void bubbleSortOptimizat(int[] a)
    {
        boolean ok=false;
        int s=0;
        while (ok==false)
        {
            ok=true;
            for (int i=1;i<a.length-s;i++)
            {
                if (a[i-1]>a[i])
                {
                    ok=false;
                    int t=a[i];
                    a[i]=a[i-1];
                    a[i-1]=t;
                }
            }
            s++;
        }
    }
    //trebuie refacut
    public void quickSort(int[] a,int stanga,int dreapta)
    {
        int Pivot=dreapta;
        int i=stanga;
        int j=-1;
        while (i!=Pivot)
        {
            if ((a[Pivot]<a[i])&&(Pivot>i))
            {
                i++;
            }
            if ((a[Pivot]>a[i])&&(Pivot>i))
            {
                j++;
                int t=a[j];
                a[j]=a[i];
                a[i]=t;
                i++;
            }

        }
        if (j+1<dreapta) {
            int aux = a[j + 1];
            a[j+1]=a[Pivot];
            a[Pivot]=aux;
        }
        if (dreapta-(j+1)>0)
        {
            quickSort(a,j+2,dreapta);
        }
        if (j+1-stanga>1)
        {
            quickSort(a,0,j);
        }
    }
    public void Afisare(int[] a)
    {
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

}

import java.util.stream.IntStream;

public class suanfa {

    public void getgo(){

        System.out.println("zheshi suanfa");

      int i,j ,k;
      k=0;
      i=1;

      for (j=1;j<=22;j++)

      {

         i=i*2;
         k=i+k;

          System.out.println("i  "+k);

      }


    }


    int silver(int a,int b){
        return  IntStream.range(a,b+1).sum();

    }



    }

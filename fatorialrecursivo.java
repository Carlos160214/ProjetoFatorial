public class fatorialrecursivo {

     public static int calcularfatorialrecursivo(int n ) throws IllegalArgumentException
      {
           if (n ==0) 
                 return 1;

               return n * calcularfatorialrecursivo(n-1)

       }

  public static void main(String[] args)

{
   System.out.println(calcularfatorialrecursivo(5));
}
}
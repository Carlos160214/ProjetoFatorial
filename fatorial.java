public class Fatorial {
   
//versao interativa do calculo do fatorial, incluindo o teste para n = 0
public  int calcularFatorial(int n) {

int resultado = 1;

for (int i = 2; i <=n; i++)
  resultado*= i;

return resultado;

}


}
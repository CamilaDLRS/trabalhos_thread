public class AppV3ComVariasThreads {
  public static void main(String[] args) throws Exception {
      
    int inicio = 1;
    int fim = 1000000;
    int numThreads = 100;
    
    int quantPorThread = Math.round((inicio + fim) / numThreads);
    int inicioAtual = inicio;
    int fimAtual = quantPorThread;

    for (int i = 1; i <= numThreads; i++) {
      ContaPrimosThread thread1 = new ContaPrimosThread(inicioAtual, fimAtual);
      thread1.setName("THEREAD " + String.valueOf(i));
      thread1.start();

      inicioAtual = fimAtual + 1; 
      fimAtual += quantPorThread;
    }
  }  
}
public class AppV2ComThread {
  public static void main(String[] args) throws Exception {
      
    int inicio = 1;
    int fim = 1000000;
    
    ContaPrimosThread thread1 = new ContaPrimosThread(inicio, fim);
    thread1.setName("THEREAD 1");
    thread1.start();
/* 
    ContaPrimosThread thread2 = new ContaPrimosThread((fim/2) + 1, fim);
    thread2.setName("THEREAD 2");
    thread2.start(); */
  }  
}

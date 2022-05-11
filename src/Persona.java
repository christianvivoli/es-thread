public class Persona extends Thread{
    String nome;
    Bagno bagno;
    
    public Persona(String n,Bagno b){
        nome=n;
        bagno=b;
    }

    public void run() {
        bagno.usa(nome);
    }
}


public class Bagno {
    String targhetta;
    Semaforo semaforo;

    public Bagno(String n,Semaforo s){
        targhetta=n;
        semaforo=s;
    }

    public void usa(String n){
        semaforo.p();
        System.out.println(targhetta+" "+n +"sta entrando");
        try {
            Thread.sleep((long)(Math.random()*1000));
        } catch (Exception e) {}
        System.out.println(targhetta+" "+n+"sta uscendo");
        semaforo.v();
    }
}

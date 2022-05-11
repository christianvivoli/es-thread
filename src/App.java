public class App {
    public static void main(String[] args) throws Exception {
        Bagno bagnoUomini =new Bagno("M", new Semaforo(2));
        Bagno bagnoDonne =new Bagno("F", new Semaforo(1));

        Persona p=new Persona("ciccio ", bagnoUomini);
        Persona p1=new Persona("pippo ", bagnoUomini);
        Persona p2=new Persona("pluto ", bagnoUomini);
        Persona p3=new Persona("topolino ", bagnoUomini);

        Persona p4=new Persona("minnie ", bagnoDonne);
        Persona p5=new Persona("viola ", bagnoDonne);
        Persona p6=new Persona("alessia ", bagnoDonne);
        Persona p7=new Persona("federico ", bagnoDonne);

        p.start();
        p1.start();
        p2.start();
        p3.start();

        p4.start();
        p5.start();
        p6.start();
        p7.start();


        p.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        p7.join();

        System.out.println("hanno pisciato tutti");
    }
}

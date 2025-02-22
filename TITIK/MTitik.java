package TITIK;

public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(9); 
        T1.setOrdinat(9);
        T2.printTitik();

        Titik T3 = new Titik();
        Titik T4 = new Titik(3,5);
        T3.printTitik();
        T4.printTitik();
        System.out.println("jumlah objek titik = " + Titik.getCounterTitik());
        // System.out.println("jumlah Objek titik = " + T4.getCounterTitik());

        Titik T5 = T4.getRefleksiX();
        T5.printTitik();
        T5.geser(5, 6);
        T5.printTitik();
        System.out.println("===================================================================");
        System.out.println("T4 : (" + T4.getAbsis() + "," + T4.getOrdinat() + ")");
        System.out.println("T5 : (" + T5.getAbsis() + "," + T5.getOrdinat() + ")");
        System.out.println("T5 berada di kuadran : " + T5.getKuadran());
        System.out.println("Jarak T5 terhadap titik pusat (0,0) : " + T5.getJarakPusat());
        System.out.println("Jarak T5 terhadap T4 : " + T5.getJarak(T4));
        System.out.println("Titik refleksi terhadap sumbu X dari T5 : " + T5.getRefleksiX());
        System.out.println("Titik refleksi terhadap sumbu Y dari T5 : " + T5.getRefleksiY());
    }
}

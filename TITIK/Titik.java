package TITIK;

public class Titik {
    public double absis;
    public double ordinat;
    static int counterTitik = 0;

    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    public String toString() {
        return "(" + absis + ", " + ordinat + ")";
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public void setAbsis(double x){
        absis = x;
    }

    public void setOrdinat(double y){
        ordinat = y;
    }

    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    public void printTitik(){
        System.out.println("titik (" + absis + "," + ordinat + ")");
    }

    public int getKuadran() {
        if (getAbsis() >= 0 && getOrdinat() >= 0) {
            return 1;
        } else if (getAbsis() < 0 && getOrdinat() >= 0) {
            return 2;
        } else if (getAbsis() < 0 && getOrdinat() < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    public double getJarakPusat() {
        return Math.sqrt((getAbsis()*getAbsis()) + (getOrdinat()*getOrdinat()));
    }

    public double getJarak(Titik T) {
        return Math.sqrt(((getAbsis()-T.getAbsis()) * (getAbsis())-T.getAbsis()) + ((getOrdinat() - T.getOrdinat()) * (getOrdinat() - T.getOrdinat())));
    }

    public void refleksiY() {
        setAbsis(getAbsis()* -1);    
    }

    public void refleksiX() {
        setOrdinat(getOrdinat()* -1);    
    }

    public Titik getRefleksiY() {
        return new Titik(this.getAbsis() * -1, this.getOrdinat());
        // Titik T = new Titik();
        // setAbsis(-1 * absis);
        // setOrdinat(ordinat);
        // return T;
    }

    public Titik getRefleksiX() {
        return new Titik(this.getAbsis(), this.getOrdinat() * -1);
        // Titik T = new Titik();
        // setAbsis(absis);
        // setOrdinat(-1 *ordinat);
        // return T;
    }
}

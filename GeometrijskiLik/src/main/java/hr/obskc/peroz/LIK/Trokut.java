
package hr.obskc.peroz.LIK;

public class Trokut extends Oblik{
    
    private double StranicaA;
    private double StranicaB;
    private double StranicaC;
    
    public Trokut(String naziv, double StranicaA, double StranicaB, double StranicaC){
        
        if (StranicaA<=0||StranicaB<=0||StranicaC<=0){
            throw new IllegalArgumentException("Stranica ne smije biti nepozitivna!");
        }        
        if (StranicaA + StranicaB <= StranicaC || StranicaA + StranicaC <= StranicaB || StranicaB + StranicaC <= StranicaA) {
            throw new IllegalArgumentException("Stranice ne zadovoljavaju nejednakost trokuta!");
        }
        
        super(naziv);
        this.StranicaA = StranicaA;
        this.StranicaB = StranicaB;
        this.StranicaC = StranicaC;
    }

    
    @Override
    public double opseg() {
        return StranicaA+StranicaB+StranicaC;
    }
    
    private double s (double a, double b, double c) {
        double helper = a+b+c;
        return helper/2;
    }
    
    @Override
    public double povrsina() {
        return Math.sqrt(s(StranicaA,StranicaB,StranicaC) * (s(StranicaA,StranicaB,StranicaC) - StranicaA) * (s(StranicaA,StranicaB,StranicaC) - StranicaB) * (s(StranicaA,StranicaB,StranicaC) - StranicaC));
    }

    @Override
    public String toString() {
        return "Trokut[" + super.toString() + ", A = " + StranicaA + ", B = " + StranicaB + ", C = " + StranicaC + "]";
    }
    
}
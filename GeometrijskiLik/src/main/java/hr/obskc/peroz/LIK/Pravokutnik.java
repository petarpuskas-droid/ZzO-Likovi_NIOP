package hr.obskc.peroz.LIK;

public class Pravokutnik extends Oblik {  //eksplicitno izvedena klasa -> nasljeduje klasu Object (dio Jave)
    
    private double StranicaA;
    private double StranicaB;
    
    
    public Pravokutnik(String naziv, double StranicaA, double StranicaB){
        if (StranicaA<=0||StranicaB<=0)
        {
            throw new IllegalArgumentException("Stranica ne smije biti nepozitivna!");
        }     
        super(naziv);
        this.StranicaA = StranicaA;
        this.StranicaB = StranicaB;
    }

    @Override
    public double povrsina() {
        return StranicaA*StranicaB;
    }

    @Override
    public double opseg() {
        return StranicaA*2+StranicaB*2;
    }
    
    public boolean jeLezeci() {
        if (StranicaA>StranicaB) {
            return true;
        } else return false;
    }
    
    @Override
    public String toString() {
        return "Pravokutnik[" +super.toString() + ", Sirina = " + StranicaA + ", Duljina = " + StranicaB + "]";
    }
    
    
    
    
    
}

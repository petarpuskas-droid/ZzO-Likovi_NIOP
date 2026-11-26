
package hr.obskc.peroz.LIK;

import java.util.Objects;

public class Krug extends Oblik {
    
    private double PI = 3.14159;
    private double polumjer;
    
    public Krug(String naziv, double polumjer){
        super(naziv);
        if (polumjer<=0)
        {
            throw new IllegalArgumentException("polumjer ne smije biti nepozitivan!");
        }
        this.polumjer=polumjer;
    }

    
    @Override
    public double opseg() {
        return 2*polumjer*PI;
    }

    @Override
    public double povrsina() {
        return polumjer*polumjer*PI;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Krug drugi = (Krug) obj;

        return Double.compare(polumjer, drugi.polumjer) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(polumjer);
    }
    
    private double promjer() {
        return this.polumjer*2;
    }
    
    
    @Override
    public String toString() {
        return "Krug[" +super.toString() + ", polumjer = " + polumjer + "]"; 
    }
}

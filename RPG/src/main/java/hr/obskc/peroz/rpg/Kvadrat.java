package hr.obskc.peroz.rpg;

public final class Kvadrat extends Pravokutnik { //klasa se ne može višse nasljeđivati -> final
    
    private double Stranica;
    
    public Kvadrat(String naziv, double Stranica){
        if (Stranica<=0)
        {
            throw new IllegalArgumentException("Stranica ne smije biti nepozitivna!");
        }
        
        super(naziv, Stranica, Stranica);
    }

        @Override
        public double opseg() {
            return Stranica*4;
        }

        @Override
        public double povrsina() {
            return Stranica*Stranica;
        }

        @Override
        public String toString() {
            return "Kvadrat["+ super.getNaziv()+", Duljina stranice = " + Stranica + "]";
        }
     
        
        
        
}

    
    


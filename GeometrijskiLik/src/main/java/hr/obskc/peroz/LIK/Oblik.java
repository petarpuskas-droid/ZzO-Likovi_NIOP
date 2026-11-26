package hr.obskc.peroz.LIK;
        
public abstract class Oblik {
    
    private String naziv;
    
    public Oblik(String naziv) {
        if (naziv == null || naziv.isBlank())
        {
            throw new IllegalArgumentException("Naziv geometrijskog lika ne smije biti prazno");
        }
        this.naziv = naziv;
    }
    
    public abstract double povrsina();
    public abstract double opseg();

    public String getNaziv() {
        return naziv;
    }
    
    @Override
    public String toString() {
        return "naziv = " + naziv;
    }

}

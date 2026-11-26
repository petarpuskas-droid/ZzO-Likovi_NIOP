
package hr.obskc.peroz.LIK;
public class Main {

    public static void main(String[] args) {
        System.out.println("=====Geometrijski likovi=====");
    
    Oblik[] likovi = {
        new Pravokutnik("Telefon",1080,2400),
        new Kvadrat("Kvadratko",5),
        //new Trokut("RealTriangle",4,40, 9),
        new Trokut("Triforce",3,3,3),
        new Krug("Balon",5),
        new Krug("Outlet",3)
    };
        for (Oblik lik : likovi) {
            System.out.println(lik.toString());
            System.out.printf("%.2f %n",lik.povrsina());
            System.out.printf("%.2f %n",lik.opseg());
            System.out.println("-----");
        }
        System.out.println("");
        
        double ukupnaP = 0;
        for (Oblik lik : likovi) {
            ukupnaP += lik.povrsina();
        }
        System.out.printf("Ukupna povrsina: %.2f %n",ukupnaP);
        
        System.out.println("Najveci opseg: " + maxO(likovi).toString());
        
        System.out.println("");
        System.out.println("=== Posebnosti ===");
        for (Oblik Lik : likovi){
            if (Lik instanceof Pravokutnik p){
                System.out.println(p.getNaziv() + 
                        (p.jeLezeci() ?
                        ": pravokutnik je Lezeci" :
                        ": pravokutnik je Stojeci"));
        }
            else if (Lik instanceof Krug k){
                System.out.println(k.getNaziv() + " ima povrsinu od: ");
                System.out.printf("%.2f %n", k.povrsina());
            }
        }
    }
    
    
    static Oblik maxO(Oblik[] oblik){
        Oblik best = oblik[0];
        for (Oblik lik : oblik) {
            if (lik.opseg() > best.opseg()){
                best = lik;
            }
        }
        return best;
}
}


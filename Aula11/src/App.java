import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        Animal a1 = new Animal("Cachorro", 2, 0);
        //System.out.println(a1);
        //a1.mover();
        //System.out.println(a1);

        Peixe p1 = new Peixe("Nemo", 1, 0, false);
        //System.out.println(p1);
        //p1.nadar();
        //System.out.println(p1);

        Passaro pas1 = new Passaro("Pica pau", 10, 0);
        //System.out.println(pas1);
        //pas1.voar();
        //System.out.println(pas1);

        ArrayList<Animal> listaAnimais = new ArrayList<>();
        listaAnimais.add(a1);
        listaAnimais.add(p1);
        listaAnimais.add(pas1);

        //Sem polimorfismo

        /*for (Animal a : listaAnimais) {
            if(a instanceof Peixe){
                ((Peixe) a).nadar();
            }else if(a instanceof Passaro){
                ((Passaro) a).voar();
            }else{
                a.mover();
            }
        }
        for(Animal a : listaAnimais){
            System.out.println(a.getNome() + "\t" + a.getLocalizacao());
        }*/

        //Polimorfismo
        for(Animal a : listaAnimais){
            a.mover();
        }

        for(Animal a : listaAnimais){
            System.out.println(a.getNome() + "\t" + a.getLocalizacao());
        }        
    }
}
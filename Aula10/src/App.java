import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Pessoa p1 = new Pessoa();
        p1.setNome("Matheus");
        p1.setCod(1);
        p1.setCpf("123456789");
        pessoas.add(p1);

        Pessoa p2 = new Pessoa();
        p2.setNome("Matheus2");
        p2.setCod(2);
        p2.setCpf("222222222");
        pessoas.add(p2);

        Endereco e1 = new Endereco("Rua do alface", 55);
        Endereco e2 = new Endereco("Rua da cebola", 43);

        p1.setEndereco(e1);
        p2.setEndereco(e2); 

        for(Pessoa p : pessoas){
            System.out.println(p.toString());
            System.out.println("---------------------");
        }
    }
}

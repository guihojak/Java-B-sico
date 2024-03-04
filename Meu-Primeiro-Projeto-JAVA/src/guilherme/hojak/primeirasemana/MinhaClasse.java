package guilherme.hojak.primeirasemana;
public class MinhaClasse {
    public static void main(String[] args) {
           String primeiroNome = "Guilherme";
           String segundoNome = "Hojak";

           String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
           
           System.out.println(nomeCompleto);
    }

    public static String  nomeCompleto (String primeiroNome , String segundoNome) {

        return "Resultado do Metodo = " + primeiroNome.concat(" ").concat(segundoNome);
    }




    
}

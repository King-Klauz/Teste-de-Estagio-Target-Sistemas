package respostas;

public class Incrementar {

    public static void somar(){
        int indice = 13, soma = 0, k = 0;
        
        while(k < indice) {
            k++;
            soma+=k;
        }

        System.out.println("Resultado --> "+soma);
    }
    
}

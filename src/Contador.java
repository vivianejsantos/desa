import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("============Controle de Fluxo============");

        System.out.println("Digite o primeiro parametro: ");
        int parametro1=sc.nextInt();

        System.out.println("Digite o segundo parametro: ");
        int parametro2=sc.nextInt();

        try {
            contar(parametro1,parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");;
        }

        System.out.println("\n FINALIZANDO PROGRAMA...");

    }
    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1>parametro2 || parametro1 == parametro2){
            throw new ParametrosInvalidosException();
        }
        if(parametro1 < parametro2){
            int subtracao = parametro2 - parametro1;
            for (int i = 1; i <=subtracao ; i++) {
                System.out.println("Imprimindo o numero "+i);
            }
        }

    }
}
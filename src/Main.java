import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conversor conversor = new Conversor();


        while (true){

            try {
                System.out.println("""
                        ***************************************************
                                            
                        Bem-vindo ao conversor de Real(BRL) para outras moedas"
                                            
                                            
                        1) Dólar
                        2) Euro
                        3) Libra Esterlina
                        4) Dólar Canadense
                        5) Iene Japonês
                        6) Franco Suíço
                                            
                        Escolha uma opção para começar ou aperte 7 para sair:
                        """);

                int escolha = scan.nextInt();

                if (escolha == 7) {
                    break;
                }
                if (escolha < 1 || escolha > 7) {
                    throw new OpcaoInvalidaException("Opção inválida");
                }

                System.out.println("Digite o valor que deseja converter: ");
                double valor = scan.nextDouble();

                conversor.converteMoeda(escolha, valor);
            } catch (OpcaoInvalidaException | InputMismatchException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
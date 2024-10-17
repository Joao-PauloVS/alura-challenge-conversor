public class Conversor {
    RecuperaMoeda recuperaMoeda = new RecuperaMoeda();

    public void converteMoeda (int i,double valor){


        switch (i){
            case 1:
                Conversao dolar = recuperaMoeda.buscaMoeda("USD", valor);
                System.out.println("O valor após conversão é: " + dolar);
                break;
            case 2:
                Conversao euro = recuperaMoeda.buscaMoeda("EUR", valor);
                System.out.println("O valor após conversão é: " + euro);
                break;
            case 3:
                Conversao libra = recuperaMoeda.buscaMoeda("GBP", valor);
                System.out.println("O valor após conversão é: " + libra);
                break;
            case 4:
                Conversao dolarCanadense = recuperaMoeda.buscaMoeda("CAD", valor);
                System.out.println("O valor após conversão é: " + dolarCanadense);
                break;
            case 5:
                Conversao ieneJapones = recuperaMoeda.buscaMoeda("JPY", valor);
                System.out.println("O valor após conversão é: " + ieneJapones);
                break;
            case 6:
                Conversao francoSuico = recuperaMoeda.buscaMoeda("CHF", valor);
                System.out.println("O valor após conversão é: " + francoSuico);
                break;
        }


    }
}

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765044");
        } catch (CepInvalidoException e) {
           System.out.println("O CEP não corresponde as regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() !=8 )
            throw new CepInvalidoException();

            return"23.765-064";
    }
    
}

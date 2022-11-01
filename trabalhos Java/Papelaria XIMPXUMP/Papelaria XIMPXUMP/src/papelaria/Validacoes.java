package papelaria;

public class Validacoes {

    public static boolean validarNIF(String nif) {
        int max=9;
        if (!nif.matches("[0-9]+") || nif.length()!=max){
            System.out.println("NIF inválido!");
            return false;
        }
        int checkSum=0;
        for (int i=0; i<max-1; i++){
            checkSum+=(nif.charAt(i)-'0')*(max-i);
        }
        int checkDigit=11-(checkSum % 11);
        if (checkDigit>9) checkDigit=0;
        if(checkDigit==nif.charAt(max-1)-'0'==false){
            System.out.println("NIF inválido!");
            return false;
        }else return true;
    }

    public static int validarInt(String str){
        int ano = 0;
        try {
            ano = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            System.out.println("Número Inválido!");}
        return ano;
    }



}

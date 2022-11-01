package papelaria;

public class ValidarNIF {

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
}

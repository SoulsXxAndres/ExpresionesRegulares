//Hecho por: Andrés López Corrales
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static String cadena = ""; //String cadena
    public static void main(String[] args) {

        //String es = a argumentos de línea de comandos
        String[] tamanio = new String[args.length];
        for (int i = 0; i < args.length ; i++) {
            tamanio[i] = args[i];
            cadena += tamanio[i];
        }

        System.out.println(cadena); //Comprobar que imprime
        Pattern pat = Pattern.compile("^(ISI)\\w{4}-(1|2)(.txt|.csv$)"); //Expresión
        Matcher mat = pat.matcher(cadena);
        //Decir si es válida o no
        if (mat.matches()) {
            System.out.println("SI es válida");
        } else {
            System.out.println("NO es válida");
        }

    }//end main
}
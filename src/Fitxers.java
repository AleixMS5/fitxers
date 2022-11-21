import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Fitxers {
    public static ArrayList llegir() throws IOException {
        //llegir:
        FileReader fileReaderAux = new FileReader("frases.txt");
        BufferedReader bufferedReaderAux = new BufferedReader(fileReaderAux);
        String fraseActual = "";
        //escriure:
        int i = 1;
        ArrayList<String> pelis = new ArrayList<String>();

        while ((fraseActual = bufferedReaderAux.readLine()) != null) {
            System.out.println(fraseActual);
            pelis.add(fraseActual);

        }
        return pelis;
    }
}


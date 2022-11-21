import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
////        Fes un programa que, passant-li una ruta et retorni:
//        Scanner S =new Scanner(System.in);
//        String path= S.nextLine();
//          File file1 = new File(path);
////        Si és la ruta d'un fitxer o un directori
//        if (file1.isFile()){
//        System.out.println("It is a file");}
//        else {
//            System.out.println("it is a directory");
//        }
////        El nom del fitxer/directori.
//        System.out.println("its name is: "+file1.getName());
////        El camí absolut (path).
//        System.out.println("its absolute path is: "+file1.getPath());
////        En cas de ser un fitxer Si el fitxer es pot llegir, escriure i/o executar.
//        if (file1.isFile()) {
//            System.out.println("read = " + file1.canRead());
//            System.out.println("write = " + file1.canWrite());
//            System.out.println("execute = " + file1.canExecute());
//        }
////        La última vegada que es va modificar.
//        Date dataFitxer = new Date(file1.lastModified());
//        System.out.println("it was modified the: "+ dataFitxer);
////        El seu tamany.
//        System.out.println("its size is of: "+file1.getTotalSpace()+" b");

//        Fes un programa que:

//        //        Generi 10 caràcters de la A a la Z maiúscules de forma aleatòria.
//        try {
//        FileWriter writeFile = new FileWriter("caracters.txt");
//        for (int i = 0; i < 10 ; i++) {
//            int numero= (int) (Math.random()*26 +65);
//
////        Guardi els 10 caràcters al fitxer "caracters.txt".
//                writeFile.write(numero);
//
//        }
//        writeFile.close();
//            //        Llegeixi el fitxer "caracters.txt" i tregui un llistat amb totes les lletres de l'abecedari en maiúscules i la quantitat de lletres que hi ha al fitxer de cada una d'elles.
//            int [] abecedari = new int[26];
//            FileReader fileReaderAux = new FileReader("caracters.txt");
//            int caracterActual = 0;
//            while((caracterActual = fileReaderAux.read())!=-1) {
//            abecedari[caracterActual-65]++;
//            }
//            for (int i = 0; i < 26 ; i++) {
//                System.out.println((char)(i+65)+": " +abecedari[i]);
//            }
//
//
//            fileReaderAux.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


                try{


                 ArrayList<String> pelis =Fitxers.llegir();
                 pelis.add(sc.nextLine());
                    FileWriter fileWriterAux = new FileWriter("frases.txt");
                    BufferedWriter bufferedWriterAux = new BufferedWriter(fileWriterAux);
                    pelis.sort(String::compareTo);
                    for (int i = 0; i < pelis.size() ; i++) {
                        bufferedWriterAux.write(pelis.get(i));
                        bufferedWriterAux.newLine();
                    }

                    bufferedWriterAux.close();
                    System.out.println("resultat" );
                    Fitxers.llegir();

                }catch (IOException e){
                    e.printStackTrace();
                }




    }
}
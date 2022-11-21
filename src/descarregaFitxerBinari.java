import jdk.internal.icu.impl.StringPrepDataReader;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class descarregaFitxerBinari {
    public static void descarrega(String url) throws IOException {
        URL urlFitxer = new URL(url);
        URLConnection connexio = urlFitxer.openConnection();
        int midaFitxer = connexio.getContentLength();
        InputStream fluxDadesEntrada = connexio.getInputStream();
        byte[] dadesFitxer = new byte[midaFitxer];
        int byteLlegt=0;
        int offset=0;
        while (offset<midaFitxer){

            byteLlegt=fluxDadesEntrada.read(dadesFitxer,offset,midaFitxer-offset);
        if (byteLlegt==-1)
            break;
        offset+=byteLlegt;
        }
        fluxDadesEntrada.close();
        String nomFitxer = url.substring(url.lastIndexOf('/')+1);
        FileOutputStream fluxDadesSortida =new FileOutputStream(nomFitxer);
        fluxDadesSortida.write(dadesFitxer);
        fluxDadesSortida.flush();
        fluxDadesSortida.close();


    }

    public static void main(String[] args) {
        try{
            descarrega("https://dungeonofbits.com/importantDATA.png");
        }catch (Exception e){}
    }
}

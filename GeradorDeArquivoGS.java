import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivoGS {

    public void saveJson (Rates rates) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        //FileWriter escrtta = new FileWriter(rates.)
    }
}
import com.google.gson.*;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Converter {
    private Rates exchangeRates;

    public Converter(){
        this.exchangeRates = taxaDeCambio();
    }

    public double converterDolarParaPesoArgentino(double valorDolar){
        return valorDolar * exchangeRates.ARS();
    }

    public double converterPesoArgentinoParaDolar(double valorPesoArgentino){
        return valorPesoArgentino / exchangeRates.ARS();
    }

    public double converterDolarParaRealBrasileiro(double valorDolar){
        return valorDolar * exchangeRates.BRL();
    }

    public double converterRealBrasileiroParaDolar(double valorRealBrasileiro){
        return valorRealBrasileiro / exchangeRates.BRL();
    }

    public double converterDolarParaPesoColombiano(double valorDolar){
        return valorDolar * exchangeRates.COP();
    }

    public double converterPesoColombianoParaDolar(double valorPesoColombiano) {
        return valorPesoColombiano / exchangeRates.COP();
    }


    private Rates taxaDeCambio() {

        try {
            String urlStr = "https://v6.exchangerate-api.com/v6/e574a21549cc833c2a070eec/latest/USD";

            URL url = new URL(urlStr);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            JsonParser jp = new JsonParser();
            JsonObject root = jp.parse(new InputStreamReader((InputStream)
                    request.getContent())).getAsJsonObject();

            double BRL = root.getAsJsonObject("conversion_rates").get("BRL").getAsDouble();
            double COP = root.getAsJsonObject("conversion_rates").get("COP").getAsDouble();
            double ARS = root.getAsJsonObject("conversion_rates").get("ARS").getAsDouble();
            double USD = root.getAsJsonObject("conversion_rates").get("USD").getAsDouble();

            return new Rates(BRL, COP, ARS, USD);

        } catch (Exception e) {
            System.out.println("Falha ao obter as taxas de câmbio: " + e.getMessage());
            return new Rates(0.0, 0.0, 0.0, 0.0);
        }

        }
    }


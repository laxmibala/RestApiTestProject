package utilities;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class RestClients {
    static CloseableHttpResponse httpResponse;

    public static CloseableHttpResponse getUrl(String url) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet =new HttpGet(url);
        try {
             httpResponse=httpClient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return httpResponse;
    }

}

package utilities;

import Configuration.ConfigLoader;
import DataDomains.Users;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestClients {
    static CloseableHttpResponse httpResponse;

    public static CloseableHttpResponse getUrl(String url) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        try {
            httpResponse = httpClient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return httpResponse;
    }

    public static Map<String, String> getHeaderMap() {
        Header[] headerArrays = httpResponse.getAllHeaders();
        Map<String, String> allHeader = new HashMap<>();
        for (Header header : headerArrays) {
            allHeader.put(header.getName(), header.getValue());
        }
        return allHeader;
    }

    public static JSONObject getJsonResponse() {
        String responseString;
        JSONObject jsonObject = null;
        try {
            responseString = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
            jsonObject = new JSONObject(responseString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonObject;

    }

    public static CloseableHttpResponse getHttpResponseWithHeaderDetails(String url, HashMap<String, String> headerMap) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        for (Map.Entry<String, String> entry : headerMap.entrySet()) {
            httpGet.addHeader(entry.getKey(), entry.getValue());
        }
        try {
            httpResponse = httpClient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return httpResponse;
    }


    public static CloseableHttpResponse getUrlWithPathparameters(String url, String pathParams) throws URISyntaxException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        URIBuilder builder = new URIBuilder(url);
        builder.setParameter("id", pathParams);
        HttpGet httpGet = new HttpGet(builder.build());
        try {
            httpResponse = httpClient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return httpResponse;
    }


    public static List<Users> getUserDataList() throws IOException, URISyntaxException {
        httpResponse = RestClients.getUrl(ConfigLoader.getBasePath());
        String responseString = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        List<Users> users = Arrays.asList(mapper.readValue(responseString, Users[].class));
        return users;
    }

}

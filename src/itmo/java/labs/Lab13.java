package itmo.java.labs;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class Lab13 {
    public static void wikiRequest() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Спросите меня о чем-то:");
        String data = scanner.nextLine();
        //Честно пытлся через WikipediApi, но это не реально.
        // Возвращает огромное количество данных и как их распарсить непонятно.
        String wikiApi = "https://ru.wikipedia.org/api/rest_v1/page/summary/";
        try {
            data = URLEncoder.encode(data, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String requestString = wikiApi + data;
        URL url = new URL(requestString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setReadTimeout(10000);
        connection.setConnectTimeout(15000);
        connection.setDoInput(true);

        connection.connect();
        InputStream stream = (InputStream) connection.getContent();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
        StringBuilder stringBuilder = new StringBuilder();
        String string = null;
        while ((string = bufferedReader.readLine()) != null) {
            stringBuilder.append(string);
        }
        stream.close();
        String jsonString = stringBuilder.toString();
        try {
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(jsonString);
            System.out.println(jsonObject.get("extract"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}


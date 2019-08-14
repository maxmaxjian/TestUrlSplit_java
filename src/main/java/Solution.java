import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://hypernova.amazonalexa.com/v0/mmhome/feed?timeZoneId=America%2FNew_York&heightPixels=480&widthPixels=480");
            System.out.println(url.getAuthority());
            System.out.println(url.getProtocol());
            System.out.println(url.getPath());
            System.out.println("query = " + url.getQuery());
            String[] strs = url.getQuery().split("&");
            Stream.of(strs).forEach(System.out::println);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}

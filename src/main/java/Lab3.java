import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */
public class Lab3 {
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
}
    /**
     *
     * @param args
     */
    public static final void main(String[] args) {
        // TODO Auto-generated method stub
        public static int wordCount (String contents) {
            int count = 0;

            for (int i =1; i < contents.length(); i++) {
                if (contents.charAt(i) != ' ' && contents.charAt(i+1) != ' ') {
                   count += 1;
                }
            return count;
            }
        }

    }


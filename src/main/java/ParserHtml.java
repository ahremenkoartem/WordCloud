import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserHtml {//работает только если искомое записано в одной строке

    public static void simple(String s) {
        String regex = "<div>(.*)<div class=\"kludges\">";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group(1));
        }
        System.out.println(result.toString());
    }

    public static void parseTxt(String txtForParsePath, String parsedTxtPath) throws IOException {
        String regex = "<div>(.*)<div class=\"kludges\">";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        FileInputStream fstream = new FileInputStream(txtForParsePath);
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine = "";
        BufferedWriter writer = new BufferedWriter(new FileWriter(parsedTxtPath));
        while ((strLine = br.readLine()) != null) {
            matcher = pattern.matcher(strLine);
            while (matcher.find()) {
                writer.write(matcher.group(1)+"\n");
            }
        }
        writer.close();
    }

    public static void parseTxt(String txtForParsePath, String parsedTxtPath, String regex) throws IOException {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        FileInputStream fstream = new FileInputStream(txtForParsePath);
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine = "";
        BufferedWriter writer = new BufferedWriter(new FileWriter(parsedTxtPath));
        while ((strLine = br.readLine()) != null) {
            matcher = pattern.matcher(strLine);
            while (matcher.find()) {
                writer.write(matcher.group(1)+"\n");
            }
        }
        writer.close();
    }
}

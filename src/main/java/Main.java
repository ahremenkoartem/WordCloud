import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ParserHtml.parseTxt("C:\\IDEA Projects\\WordCloud\\src\\main\\resources\\text\\sraka.txt",
                "C:\\IDEA Projects\\WordCloud\\output\\parsedText\\srakaText.txt",
                "<div>(.*)<div class=\"kludges\">");
        CloudMaker.makeCircleCloud("C:\\IDEA Projects\\WordCloud\\output\\parsedText\\srakaText.txt",
                "output/pictures/SrakaCloud.png");
    }
}

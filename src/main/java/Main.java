import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CloudMaker.makeCircleCloud();
        CloudMaker.makeCircleCloud("C:\\IDEA Projects\\WordCloud\\src\\main\\resources\\text\\text.txt",
                "output/datarank_wordcloud_circle_sqrt_fontP.png");

    }
}

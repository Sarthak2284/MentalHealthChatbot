import opennlp.tools.tokenize.SimpleTokenizer;

public class TestOpenNLP {
    public static void main(String[] args) {
        String text = "Hello, how can I help you today?";
        SimpleTokenizer tokenizer = SimpleTokenizer.INSTANCE;
        String[] tokens = tokenizer.tokenize(text);

        for (String token : tokens) {
            System.out.print(token + " ");
        }
    }
}

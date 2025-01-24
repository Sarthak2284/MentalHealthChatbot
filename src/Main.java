import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChatbotLogic chatbot = new ChatbotLogic();
        NLPProcessor nlp = new NLPProcessor();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hello! How can I help you today?");

        while (true) {
            System.out.println();
            System.out.print("You: ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }
            String response = chatbot.getResponse(userInput);
            System.out.print("Chatbot: " + response);
        }

        scanner.close();
    }
}

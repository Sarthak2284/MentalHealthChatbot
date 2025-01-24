public class ChatbotLogic {
    public static void main(String[] args) {
        // Create an instance and test the response
        ChatbotLogic chatbot = new ChatbotLogic();
        String response = chatbot.getResponse("Hello");
        System.out.println(response);
    }

    public String getResponse(String input) {
        return "Hello! How can I help you today?";
    }
}

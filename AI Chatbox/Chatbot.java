import java.util.Scanner;

public class Chatbot {

    private ResponseHandler handler;

    public Chatbot() {
        handler = new ResponseHandler();
    }

    public void startChat() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== AI CHATBOT =====");
        System.out.println("Type 'bye' to exit.\n");

        while (true) {
            System.out.print("You: ");
            String input = sc.nextLine();

            String response = handler.getResponse(input);
            System.out.println("Bot: " + response);

            if (input.equalsIgnoreCase("bye")) {
                break;
            }
        }

        sc.close();
    }
}
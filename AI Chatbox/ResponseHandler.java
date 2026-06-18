public class ResponseHandler {

    public String getResponse(String input) {
        input = input.toLowerCase();

        // Greetings
        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I help you?";
        }

        // Java question
        else if (input.contains("java")) {
            return "Java is a powerful object-oriented programming language.";
        }

        // AI question
        else if (input.contains("ai") || input.contains("artificial intelligence")) {
            return "Artificial Intelligence enables machines to simulate human intelligence.";
        }

        // Internship
        else if (input.contains("internship")) {
            return "Internships help you gain real-world experience.";
        }

        // Help
        else if (input.contains("help")) {
            return "You can ask me about Java, AI, or programming.";
        }

        // Bye
        else if (input.contains("bye")) {
            return "Goodbye! Have a great day.";
        }

        // Default response
        else {
            return "Sorry, I don't understand that yet.";
        }
    }
}

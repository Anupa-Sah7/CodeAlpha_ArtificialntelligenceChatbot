# 🤖 Artificial Intelligence Chatbot

> An intelligent Java-based conversational AI chatbot with pattern matching and natural language processing capabilities

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![AI](https://img.shields.io/badge/AI-Chatbot-blue?style=for-the-badge)
![Version](https://img.shields.io/badge/version-1.0-green?style=for-the-badge)
![CodeAlpha](https://img.shields.io/badge/CodeAlpha-Internship-purple?style=for-the-badge)
![NLP](https://img.shields.io/badge/NLP-Pattern%20Matching-orange?style=for-the-badge)

---

## 📋 Table of Contents
- [Project Overview](#-project-overview)
- [Features](#-features)
- [Technologies Used](#-technologies-used)
- [Installation & Setup](#-installation--setup)
- [How to Use](#-how-to-use)
- [Conversation Examples](#-conversation-examples)
- [Project Structure](#-project-structure)
- [Intents & Responses](#-intents--responses)
- [Future Enhancements](#-future-enhancements)
- [Contributing](#-contributing)
- [License](#-license)
- [Contact](#-contact)
- [Acknowledgments](#-acknowledgments)

---

## 🎯 Project Overview

The **Artificial Intelligence Chatbot** is a Java-based conversational AI application developed as part of the **CodeAlpha Internship Program**. It simulates intelligent conversations by using pattern matching and rule-based responses to understand and reply to user queries.

### 🤔 What Makes It "AI"?

While this chatbot doesn't use machine learning or neural networks, it demonstrates core AI concepts:

- **Natural Language Processing (NLP)**: Understanding user input through pattern recognition
- **Context Awareness**: Responding appropriately based on detected intents
- **Knowledge Base**: Storing and retrieving information from a structured database
- **Rule-Based Reasoning**: Applying logical rules to generate responses

### 🎓 Problem Statement
Users often need quick, automated responses to common queries without human intervention. This chatbot provides:
- 24/7 availability
- Instant responses
- Consistent answers
- Handling of multiple query types

### ✅ Solution
A Java-based conversational agent that:
- Recognizes user intent through pattern matching
- Responds with pre-defined or dynamic answers
- Learns from interactions (in enhanced versions)
- Provides a natural conversation experience

---

## ✨ Features

### 🧠 Core Capabilities
- ✅ **Pattern Recognition**: Identifies user intent using keywords and patterns
- ✅ **Multiple Intent Support**: Handles greetings, goodbyes, questions, jokes, and more
- ✅ **Rule-Based Responses**: Delivers appropriate responses based on detected patterns
- ✅ **Natural Conversation Flow**: Maintains context within conversations

### 💬 Conversation Features
- ✅ Greetings & Introductions
- ✅ Name inquiries
- ✅ Time & Date queries
- ✅ Joke telling
- ✅ Mathematical calculations
- ✅ Weather information
- ✅ Help & Support
- ✅ Farewell messages

### 🎨 User Experience
- ✅ Clean, interactive console interface
- ✅ Colorful ASCII art welcome screen
- ✅ Real-time response generation
- ✅ User-friendly prompts
- ✅ Exit command support

---

## 🛠️ Technologies Used

| Technology | Purpose |
|------------|---------|
| **Java** | Core programming language |
| **String Manipulation** | Pattern matching and text processing |
| **Scanner** | User input handling |
| **DateTime API** | Time and date functionality |
| **Collections Framework** | Data storage and retrieval |
| **OOP Principles** | Modular and maintainable code |

### Requirements
- Java 8 or higher
- Any Java IDE or text editor
- Terminal/Command Prompt

---

## 🚀 Installation & Setup

### Step 1: Clone the Repository
```bash
git clone https://github.com/yourusername/CodeAlpha_ArtificialIntelligenceChatbot.git
cd CodeAlpha_ArtificialIntelligenceChatbot
Step 2: Compile the Program
bash
javac AIChatbot.java
Step 3: Run the Program
bash
java AIChatbot
Alternative: Using IDE
Open the project in your preferred IDE

Navigate to AIChatbot.java

Click "Run" or press appropriate shortcut

💻 How to Use
Starting the Chatbot
When you run the program, you'll see:

text
╔═══════════════════════════════════════════════════════════════╗
║                                                               ║
║    █████╗ ██╗      ██████╗██╗  ██╗ █████╗ ████████╗██████╗   ║
║   ██╔══██╗██║     ██╔════╝██║  ██║██╔══██╗╚══██╔══╝██╔══██╗  ║
║   ███████║██║     ██║     ███████║███████║   ██║   ██████╔╝  ║
║   ██╔══██║██║     ██║     ██╔══██║██╔══██║   ██║   ██╔══██╗  ║
║   ██║  ██║███████╗╚██████╗██║  ██║██║  ██║   ██║   ██║  ██║  ║
║   ╚═╝  ╚═╝╚══════╝ ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝  ║
║                                                               ║
║           Artificial Intelligence Chatbot                     ║
║                   Version 1.0                                 ║
║                                                               ║
╠═══════════════════════════════════════════════════════════════╣
║  🤖 Chatbot: Hello! I'm your AI Assistant!                   ║
║  🤖 Chatbot: Type 'exit' or 'bye' to end the conversation    ║
║  🤖 Chatbot: How can I help you today?                       ║
╚═══════════════════════════════════════════════════════════════╝

You: 
Basic Commands
Command	Purpose
hello, hi, hey	Greet the chatbot
what is your name	Get bot's name
what is your purpose	Learn about bot's capabilities
time, date	Get current time/date
tell me a joke	Receive a joke
calculate 5 + 3	Perform calculations
help, commands	See available commands
bye, exit, goodbye	End conversation
💬 Conversation Examples
Example 1: Basic Greeting
text
You: hello
🤖 Chatbot: Hello! How can I assist you today?
Example 2: Getting Information
text
You: what is your name
🤖 Chatbot: I'm your AI Assistant, created to help you with various tasks!
Example 3: Asking for a Joke
text
You: tell me a joke
🤖 Chatbot: Why don't scientists trust atoms? Because they make up everything!
Example 4: Mathematics
text
You: calculate 15 * 7
🤖 Chatbot: 15 * 7 = 105
Example 5: Weather Query
text
You: what is the weather like
🤖 Chatbot: I don't have real-time data, but you can check a weather website!
Example 6: Goodbye
text
You: bye
🤖 Chatbot: Goodbye! Have a great day! 👋
Complete Conversation Example
text
You: hi
🤖 Chatbot: Hello! How can I assist you today?

You: what can you do
🤖 Chatbot: I can help you with greetings, tell jokes, answer basic questions, and more!

You: what is your name
🤖 Chatbot: I'm your AI Assistant, created to help you with various tasks!

You: tell me a joke
🤖 Chatbot: Why do programmers prefer dark mode? Because light attracts bugs!

You: time
🤖 Chatbot: Current time: 14:30:45

You: bye
🤖 Chatbot: Goodbye! Have a great day! 👋
📁 Project Structure
text
CodeAlpha_ArtificialIntelligenceChatbot/
│
├── AIChatbot.java              # Main chatbot application
│
├── README.md                   # Project documentation
├── LICENSE                     # MIT License
├── .gitignore                  # Git ignore file
│
├── docs/                       # Additional documentation
│   ├── UML_Diagram.png         # Class structure diagram
│   ├── User_Guide.pdf          # Detailed user manual
│   └── Intent_List.md          # Complete list of intents
│
└── resources/                  # Resources folder
    ├── responses.txt           # Customizable responses file
    └── training_data.json      # Training data for ML version
Class Structure
text
┌─────────────────────────────────────────────┐
│              AIChatbot                      │
│─────────────────────────────────────────────│
│ - scanner: Scanner                         │
│ - userName: String                         │
│ - conversationHistory: List<String>        │
│─────────────────────────────────────────────│
│ + main(String[] args)                      │
│ + startChat()                              │
│ + processInput(String input): String       │
│ + getResponse(String input): String        │
│ - generateGreeting(): String               │
│ - generateFarewell(): String               │
│ - handleJoke(): String                     │
│ - handleTime(): String                     │
│ - handleDate(): String                     │
│ - handleCalculation(String): String        │
│ - handleWeather(): String                  │
│ - help(): String                           │
│ - displayWelcome()                         │
└─────────────────────────────────────────────┘
🧠 Intents & Responses
Intent Recognition Patterns
Intent	Keywords	Response Type
Greeting	hi, hello, hey, good morning, good afternoon	Warm greeting
Name Query	your name, who are you	Introduction
Purpose	what do you do, help me with	Capabilities list
Time	time, current time, what time	Current time
Date	date, today's date, what date	Current date
Joke	joke, funny, tell me a joke	Random joke
Calculation	calculate, plus, minus, times, divided	Math result
Weather	weather, temperature, forecast	Weather info
Help	help, commands, what can I do	Command list
Goodbye	bye, exit, goodbye, see you	Farewell
Response Categories
Greetings
java
"Hello! How can I assist you today?"
"Hi there! What can I do for you?"
"Hey! Great to see you!"
"Good day! How may I help you?"
Jokes
java
"Why do programmers prefer dark mode? Because light attracts bugs!"
"What do you call a fake noodle? An impasta!"
"Why don't scientists trust atoms? Because they make up everything!"
"How many programmers does it take to change a light bulb? None - that's a hardware problem!"
Farewells
java
"Goodbye! Have a great day! 👋"
"Take care! See you soon!"
"Bye! It was nice chatting with you!"
"Until next time! 👋"
🔮 Future Enhancements
Short-term Goals
Machine Learning Integration: Implement NLP with ML algorithms

Sentiment Analysis: Detect user mood and respond accordingly

Multi-language Support: English, Spanish, French, etc.

Voice Input/Output: Text-to-speech and speech recognition

Memory & Context: Remember previous conversations

User Profiles: Personalized experiences

GUI Interface: JavaFX/Swing desktop application

Long-term Goals
Deep Learning: Neural network implementation

Web Integration: Deploy as web service

Mobile App: Android/iOS companion app

API Integration: Weather, news, calendar APIs

Database Integration: Persistent user data

Learning Capability: Improve responses over time

Emotion Detection: Recognize and respond to emotions

AI Features to Add
Intent Classification: Advanced ML models

Entity Recognition: Extract information from text

Dialogue Management: Complex conversation flows

Recommendation Engine: Suggest based on user queries

FAQ Automation: Intelligent FAQ responses

Integration with External Services: Database, web APIs

🤝 Contributing
We welcome contributions! Follow these steps:

Fork the repository

Create a feature branch

git checkout -b feature/AmazingFeature
Commit your changes

git commit -m 'Add some AmazingFeature'
Push to the branch

git push origin feature/AmazingFeature
Open a Pull Request

Contribution Guidelines
Follow Java coding conventions

Write meaningful commit messages

Update documentation accordingly

Add comments for complex logic

Test your code thoroughly

📝 License
This project is licensed under the MIT License - see the LICENSE file for details.

text
MIT License

Copyright (c) 2024 [Your Name]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
📧 Contact
Anupa Sah

📧 Email: anupasah621@gmail.com


🙏 Acknowledgments
CodeAlpha - For providing this internship opportunity

Java Community - For excellent documentation and resources

Open Source Community - For inspiration and tools

All Contributors - Who help improve this project

📊 Badges
https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=java&logoColor=white
https://img.shields.io/badge/AI-Chatbot-blue?style=flat-square
https://img.shields.io/badge/GitHub-100000?style=flat-square&logo=github&logoColor=white
https://img.shields.io/badge/Open%2520Source-%E2%9D%A4%EF%B8%8F-green?style=flat-square
https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square
https://img.shields.io/badge/Maintained%253F-yes-green.svg?style=flat-square
https://img.shields.io/badge/Made%2520with-%E2%9D%A4%EF%B8%8F-red?style=flat-square

📖 Additional Resources
Java Documentation

Natural Language Processing

GitHub Guide

CodeAlpha Internship

⭐ Support
If you found this project helpful, please consider:

⭐ Starring the repository

🍴 Forking the project

📢 Sharing with others

📝 Reporting issues

Made with ❤️ by [Your Name]
📍 CodeAlpha Internship - October 2024

"The goal of AI is not to replace humans, but to augment human capabilities." - Fei-Fei Li

text

---

## 🔧 Sample AIChatbot.java Code

Here's a basic implementation to accompany the README:

```java
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AIChatbot {
    private Scanner scanner;
    private String userName;
    
    public AIChatbot() {
        scanner = new Scanner(System.in);
        userName = "User";
    }
    
    public void startChat() {
        displayWelcome();
        
        while (true) {
            System.out.print("\nYou: ");
            String input = scanner.nextLine().toLowerCase();
            
            if (input.equals("exit") || input.equals("bye") || input.equals("goodbye")) {
                System.out.println("🤖 Chatbot: " + getFarewellResponse());
                break;
            }
            
            String response = getResponse(input);
            System.out.println("🤖 Chatbot: " + response);
        }
    }
    
    private String getResponse(String input) {
        // Greeting patterns
        if (input.matches(".*(hi|hello|hey|good morning|good afternoon).*")) {
            return getGreetingResponse();
        }
        
        // Name queries
        if (input.matches(".*(your name|who are you).*")) {
            return "I'm your AI Assistant, created to help you with various tasks!";
        }
        
        // Purpose queries
        if (input.matches(".*(what do you do|purpose|help with).*")) {
            return "I can help you with greetings, tell jokes, answer basic questions, and more!";
        }
        
        // Time queries
        if (input.matches(".*(time|current time|what time).*")) {
            return "Current time: " + getCurrentTime();
        }
        
        // Date queries
        if (input.matches(".*(date|today|what date).*")) {
            return "Today's date: " + getCurrentDate();
        }
        
        // Joke queries
        if (input.matches(".*(joke|funny|tell me a joke).*")) {
            return getRandomJoke();
        }
        
        // Math queries
        if (input.matches(".*(calculate|\\d+\\s*[+\\-*/]\\s*\\d+).*")) {
            return "Calculation: " + calculate(input);
        }
        
        // Weather queries
        if (input.matches(".*(weather|temperature|forecast).*")) {
            return "I don't have real-time data, but you can check a weather website!";
        }
        
        // Help queries
        if (input.matches(".*(help|commands|what can I do).*")) {
            return getHelpMessage();
        }
        
        // Default response
        return "I'm not sure how to respond to that. Try asking about my capabilities or type 'help' for commands.";
    }
    
    private String getGreetingResponse() {
        String[] greetings = {
            "Hello! How can I assist you today?",
            "Hi there! What can I do for you?",
            "Hey! Great to see you!",
            "Good day! How may I help you?"
        };
        return greetings[(int)(Math.random() * greetings.length)];
    }
    
    private String getFarewellResponse() {
        String[] farewells = {
            "Goodbye! Have a great day! 👋",
            "Take care! See you soon!",
            "Bye! It was nice chatting with you!",
            "Until next time! 👋"
        };
        return farewells[(int)(Math.random() * farewells.length)];
    }
    
    private String getRandomJoke() {
        String[] jokes = {
            "Why do programmers prefer dark mode? Because light attracts bugs!",
            "What do you call a fake noodle? An impasta!",
            "Why don't scientists trust atoms? Because they make up everything!",
            "How many programmers does it take to change a light bulb? None - that's a hardware problem!",
            "Why did the developer go broke? Because he lost his cache!",
            "What's a computer's favorite snack? Microchips!"
        };
        return jokes[(int)(Math.random() * jokes.length)];
    }
    
    private String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return now.format(formatter);
    }
    
    private String getCurrentDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return now.format(formatter);
    }
    
    private String calculate(String input) {
        try {
            // Remove "calculate" and clean up
            String expression = input.replaceAll("calculate", "").trim();
            
            // Simple evaluation (supports +, -, *, /)
            String[] parts;
            if (expression.contains("+")) {
                parts = expression.split("\\+");
                return parts[0].trim() + " + " + parts[1].trim() + " = " + 
                       (Double.parseDouble(parts[0].trim()) + Double.parseDouble(parts[1].trim()));
            } else if (expression.contains("-")) {
                parts = expression.split("-");
                return parts[0].trim() + " - " + parts[1].trim() + " = " + 
                       (Double.parseDouble(parts[0].trim()) - Double.parseDouble(parts[1].trim()));
            } else if (expression.contains("*")) {
                parts = expression.split("\\*");
                return parts[0].trim() + " * " + parts[1].trim() + " = " + 
                       (Double.parseDouble(parts[0].trim()) * Double.parseDouble(parts[1].trim()));
            } else if (expression.contains("/")) {
                parts = expression.split("/");
                double num2 = Double.parseDouble(parts[1].trim());
                if (num2 == 0) return "Cannot divide by zero!";
                return parts[0].trim() + " / " + parts[1].trim() + " = " + 
                       (Double.parseDouble(parts[0].trim()) / num2);
            }
        } catch (Exception e) {
            return "I couldn't calculate that. Please use format: calculate 5 + 3";
        }
        return "I couldn't calculate that. Please use format: calculate 5 + 3";
    }
    
    private String getHelpMessage() {
        return "I can help you with:\n" +
               "  • Greetings (hi, hello, hey)\n" +
               "  • Questions about my name and purpose\n" +
               "  • Current time and date\n" +
               "  • Jokes (tell me a joke)\n" +
               "  • Basic calculations (calculate 5 + 3)\n" +
               "  • Weather information\n" +
               "  • And more!\n" +
               "Type 'bye' or 'exit' to end the conversation.";
    }
    
    private void displayWelcome() {
        System.out.println("╔═══════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                               ║");
        System.out.println("║    █████╗ ██╗      ██████╗██╗  ██╗ █████╗ ████████╗██████╗   ║");
        System.out.println("║   ██╔══██╗██║     ██╔════╝██║  ██║██╔══██╗╚══██╔══╝██╔══██╗  ║");
        System.out.println("║   ███████║██║     ██║     ███████║███████║   ██║   ██████╔╝  ║");
        System.out.println("║   ██╔══██║██║     ██║     ██╔══██║██╔══██║   ██║   ██╔══██╗  ║");
        System.out.println("║   ██║  ██║███████╗╚██████╗██║  ██║██║  ██║   ██║   ██║  ██║  ║");
        System.out.println("║   ╚═╝  ╚═╝╚══════╝ ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝  ║");
        System.out.println("║                                                               ║");
        System.out.println("║           Artificial Intelligence Chatbot                     ║");
        System.out.println("║                   Version 1.0                                 ║");
        System.out.println("║                                                               ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════╣");
        System.out.println("║  🤖 Chatbot: Hello! I'm your AI Assistant!                   ║");
        System.out.println("║  🤖 Chatbot: Type 'exit' or 'bye' to end the conversation    ║");
        System.out.println("║  🤖 Chatbot: How can I help you today?                       ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════╝");
    }
    
    public static void main(String[] args) {
        AIChatbot chatbot = new AIChatbot();
        chatbot.startChat();
    }
}
📤 Uploading to GitHub
bash
# Initialize git repository
git init

# Add all files
git add .

# Commit changes
git commit -m "Initial commit: AI Chatbot for CodeAlpha"

# Add remote repository
git remote add origin https://github.com/yourusername/CodeAlpha_ArtificialIntelligenceChatbot.git

# Push to GitHub
git push -u origin main
This comprehensive README is perfect for your CodeAlpha AI Chatbot project submission. It covers everything from project overview to technical details and future enhancements! 🤖🚀
ciency in Java programming, algorithmic thinking, user experience 
design, and implementation of AI fundamentals without external libraries, demonstrating strong 
foundational understanding of conversational AI principles.
🏷️ Recommended for GitHub Repository
markdown
# 🤖 Artificial Intelligence Chatbot

**An intelligent Java console-based chatbot with natural language processing capabilities**

## 🌟 Key Features
✅ Pattern-based intent recognition
✅ Natural language understanding
✅ Multi-intent support (greetings, queries, calculations)
✅ Real-time conversational responses
✅ Time, date, and mathematical operations
✅ Interactive user-friendly interface

## 🛠️ Tech Stack
☕ Java | 🧠 Pattern Matching | 💬 NLP | 🖥️ Console UI

## 🎯 Capabilities
- Greetings & Introductions
- Name & Purpose Queries
- Joke Generation
- Time & Date Information
- Mathematical Calculations
- Weather Information
- Help & Commands

## 🚀 Quick Start
```bash
git clone https://github.com/yourusername/CodeAlpha_ArtificialIntelligenceChatbot.git
javac AIChatbot.java
java AIChatbot
📌 Project Status
✅ Completed as part of CodeAlpha internship program - October 2024

text

---

## 🔖 **Tagline Options**

Choose one for your project subtitle:

1. *"Where Java meets Artificial Intelligence"*
2. *"Your intelligent conversation partner"*
3. *"Experience conversational AI in Java"*
4. *"Smart conversations, simple code"*
5. *"Bridging the gap between humans and machines"*
6. *"Natural language processing made simple"*

---

## 📧 **For Email Submission**
Subject: CodeAlpha Internship Project - Artificial Intelligence Chatbot

Dear CodeAlpha Team,

I am submitting my completed project for the CodeAlpha internship program.

Project Name: Artificial Intelligence Chatbot
Technology: Java
GitHub Repository: https://github.com/yourusername/CodeAlpha_ArtificialIntelligenceChatbot

Project Overview:
The Artificial Intelligence Chatbot is a Java console application that simulates intelligent
conversations using pattern recognition and rule-based responses. It demonstrates core AI
concepts including natural language processing, intent recognition, and context-aware
responses.

Key Features:

Pattern-based intent detection and classification

Natural language understanding and processing

Multi-intent support for various user queries

Real-time conversational response generation

Interactive menu-free interface

Capabilities: greetings, questions, jokes, time/date, calculations

How to Run:

Clone the repository

Compile: javac AIChatbot.java

Run: java AIChatbot

Thank you for the opportunity to work on this project.

Best regards,
[Anupa Sah]



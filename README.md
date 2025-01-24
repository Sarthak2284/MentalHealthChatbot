# Mental Health Chatbot

### Project Overview

A chatbot application aimed at providing mental health support by offering motivational quotes, stress-relief techniques, and a conversational interface.

### Day 1 Progress

- Defined key features of the chatbot:
  - Chat interface for user interaction.
  - Basic NLP for detecting user intent.
  - Predefined responses for mental health topics.
- Planned the user flow and folder structure.
- Set up the project directory.
- Decided on the tech stack:
  - **Backend**: Java
  - **Frontend**: JavaFX or Swing
  - **NLP**: Apache OpenNLP
  - **Database**: SQLite/MySQL

### Folder Structure

```mermaid
graph TD;
  A[MentalHealthChatbot] --> B[.vscode];
  A --> C[src];
  A --> D[db];
  A --> E[resources];
  A --> F[libs];
  A --> G[README.md];
  A --> H[.classpath];

  B --> B1[settings.json];
  C --> C1[ChatbotLogic.java];
  C --> C2[Main.java];
  C --> C3[NLPProcessor.java];
  C --> C4[TestOpenNLP.java];
  D --> D1[chatbot.db];
  F --> F1[opennlp-tools-2.5.3.jar];
  F --> F2[slf4j-api-2.0.0-alpha1.jar];
  F --> F3[slf4j-simple-2.0.0-alpha1.jar];
```

### Next Steps

- Set up the development environment.
- Build the project skeleton.

### Day 2 Progress

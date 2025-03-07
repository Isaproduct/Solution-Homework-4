 Documentation for Singleton and Adapter Pattern Implementation

 Overview
This project demonstrates the Singleton and Adapter design patterns through Java implementation. It includes a ConfigurationManager class (Singleton) and a ChatServiceAdapter class (Adapter) that integrates legacy functionality with new interfaces.



 Files and Classes

 1. ConfigurationManager.java (Singleton)
- *Purpose:* Manages configuration settings for the application.
- *Pattern Implementation:* Singleton ensures only one instance of ConfigurationManager exists.
- *Key Methods:*
  - getInstance(): Provides the Singleton instance.
  - getConfig(String key): Retrieves configuration values by key.
  - printAllConfigurations(): Prints all stored configurations.

 2. ConfigManagerDemo.java
- *Purpose:* Demonstrates usage of the Singleton configuration manager.
- *Execution:* Prints configuration values.

 3. LegacyChatService.java
- *Purpose:* Simulates a legacy chat system.
- *Key Methods:*
  - sendLegacyMessage(String message): Sends a chat message in legacy format.

 4. ChatService.java (Interface)
- *Purpose:* Defines a common interface for chat services.
- *Method:*
  - sendMessage(String message): Standard method to send messages.


 5. ChatServiceAdapter.java (Adapter)
- *Purpose:* Adapts the LegacyChatService to the new ChatService interface.
- *Pattern Implementation:* Adapter allows legacy code to be used seamlessly.
- *Key Methods:*
  - sendMessage(String message): Delegates message sending to LegacyChatService.

 6. ChatAdapterDemo.java
- *Purpose:* Demonstrates adapter functionality.
- *Execution:* Translates and prints messages via legacy chat through adapter.



 Compilation and Execution Instructions

 Compile:
shell
javac *.java


 Run Demos:
shell
java ConfigManagerDemo
java ChatAdapterDemo




 Sample Output

*Configuration Manager Output:*

maxPlayers: 100
Configuration Settings:
maxPlayers → 100
defaultLanguage → en
gameDifficulty → medium


*Chat Adapter Output:*

Legacy Chat: Hello world!




 Code Quality
- Clear naming conventions
- Proper package organization (suggested, though not shown explicitly)
- Adherence to Single Responsibility and Dependency Inversion principles


This documentation ensures clarity, maintainability, and ease of understanding for future developers.

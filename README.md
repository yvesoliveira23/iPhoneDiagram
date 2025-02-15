# iPhone UML Diagram Implementation

This project implements a simplified version of the original iPhone's core functionalities as presented by Steve Jobs in 2007. It demonstrates the use of interfaces and implementation in Java to represent the iPhone's three main roles: Music Player, Phone, and Internet Browser.

## Project Structure

```bash
iPhoneDiagram/
├── iPhone.java          # Main class implementing all interfaces
├── MusicPlayer.java     # Interface for music player functionality
├── Phone.java          # Interface for phone functionality
├── InternetBrowser.java # Interface for browser functionality
└── Main.java           # Test class demonstrating all functionalities
```

## Class Diagram

```bash
+----------------+     +---------------+     +------------------+
|  MusicPlayer   |     |    Phone      |     | InternetBrowser |
+----------------+     +---------------+     +------------------+
| +playMusic()   |     | +makeCall()   |     | +openWebsite()  |
| +pauseMusic()  |     | +receiveCall()|     | +refreshPage()  |
| +stopMusic()   |     | +endCall()    |     | +closeBrowser() |
+----------------+     +---------------+     +------------------+
          ▲                   ▲                      ▲
          |                   |                      |
          +-------------------+----------------------+
                              |
                          +-------+
                          |iPhone |
                          +-------+
```

## How to Run

1. Ensure you have Java Development Kit (JDK) installed
2. Open terminal/command prompt
3. Navigate to the project directory.

4. Compile all Java files:

   ```bash
   javac *.java
   ```

5. Run the program:

   ```bash
   java Main
   ```

## Features

- **Music Player**: Play, pause, and stop music
- **Phone**: Make calls, receive calls, and end calls
- **Internet Browser**: Open websites, refresh pages, and close browser

## Implementation Details

- Uses interfaces to define contracts for each functionality
- iPhone class implements all three interfaces
- Demonstrates multiple interface implementation in Java
- Follows SOLID principles and clean code practices

## Requirements

- Java JDK 8 or higher
- Any terminal or command prompt

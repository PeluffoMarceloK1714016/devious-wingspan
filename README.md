🕊️ Wingspan (Java Recreation)

A digital recreation of the popular board game Wingspan, built in Java Swing.
Players collect birds, food, and bonuses to build habitats and earn points over four rounds.

🎮 How to Run

Clone or download the repository.

Open the project in an IDE (like IntelliJ or VS Code with Java).

Run the WingspanRunner class to start the game.

🧩 Project Overview
Component	Description
WingspanRunner / WingspanFrame	Entry point and main game window setup.
SetupPanel	Handles player setup (bonus cards, bird cards, food).
GamePanel	Main in-game UI for player turns and actions.
AbilityPanel	Displays bird ability prompts and player interactions.
Abilities	Backend logic for executing bird abilities.
GameState	Centralized storage for all players, cards, and resources.
CardManager / FoodManager	Manage card pools and the bird feeder dice.
Player / GameBoard	Represent individual player states and boards.
GoalBoard / Goal classes	Handle round goals and scoring.
🛠️ Technologies

Language: Java

UI: Swing (JFrame, JPanel, BufferedImage)

Data Structures: ArrayList, HashSet

🚀 Future Ideas

Save/load game states

Animated UI

AI or online multiplayer

Full scoring interface
The **Gem Game** is a simple, interactive game designed for two players: the **User** and the **Computer**. The objective of the game is to reduce the total number of gems (randomly chosen between 50 and 80 at the start) to zero or below. The player who successfully does this wins the game.

### **How It Works**
1. **Initialization**: 
   - The game starts with a random number of gems (`t`), selected between 50 and 80.
   - Two ranges are defined:
     - For the user: Initially between 3 and 5 (`p` to `f`).
     - For the computer: Also between 3 and 5 (`p1` to `f1`).

2. **Gameplay**:
   - **User's Turn**:
     - The user is prompted to pick a number of gems within their allowed range (`p` to `f`).
     - If the input is valid, the number of gems chosen is subtracted from the total (`t`), and the range is incremented by 1 for the next turn.
     - If the input is invalid, the user is asked to try again.
   - **Computer's Turn**:
     - The computer randomly selects a number of gems within its allowed range (`p1` to `f1`).
     - The selected number is subtracted from the total (`t`), and the range is incremented by 1 for the next turn.
     - The computer's choice is displayed for the user.

3. **Winning Condition**:
   - After each turn, the total number of gems (`t`) is checked:
     - If `t <= 0` after the **User's turn**, the user wins.
     - If `t <= 0` after the **Computer's turn**, the computer wins.

4. **End of Game**:
   - The game announces the winner (User or Computer) and ends.

### **Game Features**
- **Randomized Start**: The total number of gems is different for every game, making each session unique.
- **Interactive Input**: The user actively participates by entering values within a dynamic range.
- **Simple AI Logic**: The computer makes its choice randomly within its allowed range, creating an element of unpredictability.

### **Objective**
The goal is to outsmart the computer by strategically selecting the number of gems to leave your opponent with fewer options, ultimately making them reduce the total to zero on their turn.

### **Example Gameplay**
- **Initial Gems**: 60
- **User's Turn**: User picks 4 gems (valid input, reduces total to 56).
- **Computer's Turn**: Computer randomly picks 5 gems (reduces total to 51).
- **Next Round**: User's range becomes 4-6, and the computer's range becomes 4-6.
- The game continues until one player reduces the total to zero or below.

This game is a fun and straightforward exercise in strategy and decision-making, suitable for beginners learning programming!

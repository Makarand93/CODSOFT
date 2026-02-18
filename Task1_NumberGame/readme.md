# 🎯 Number Guessing Game – CODSOFT Internship (Task 1)

## 👨‍💻 Project Information
- **Project Title:** Number Guessing Game
- **Internship:** Java Development Internship
- **Organization:** CODSOFT
- **Language Used:** Java
- **Type:** Console-Based Application

---

## 📖 Project Description

The Number Guessing Game is a Java console-based application where the system generates a random number between 1 and 100, and the user attempts to guess the number within a limited number of attempts.

The program provides hints such as **"Too High"** or **"Too Low"** to guide the user. A scoring system is implemented based on the number of attempts taken. The game also supports multiple rounds.

---

## 🚀 Features

- Generates random number between 1 and 100
- Limits number of attempts (7 attempts)
- Provides hints (Too High / Too Low)
- Score calculation based on performance
- Multiple rounds support
- Input validation to prevent invalid entries

---

## 🛠 Concepts Used

- Random Class
- Scanner Class
- Loops (while loop, do-while loop)
- Conditional Statements (if-else)
- Arithmetic Operations
- Input Validation

---

## 🧠 Score Calculation Logic

Score is calculated using the formula:

```
Score = (MaxAttempts – AttemptsUsed + 1) × 10
```

### Example:
- If guessed in 1 attempt → 70 points
- If guessed in 4 attempts → 40 points
- If guessed in 7 attempts → 10 points

👉 Fewer attempts result in higher score.

---

## ▶ How to Run the Program

### Step 1 – Compile
```bash
javac Task1_NumberGame.java
```

### Step 2 – Run
```bash
java Task1_NumberGame
```

---

## 📌 Sample Output

```
===== NUMBER GUESSING GAME =====

Round 1
Guess the number between 1 and 100
Enter your guess: 50
Too High!
Attempts left: 6

Enter your guess: 30
Too Low!
Attempts left: 5

Enter your guess: 40
Correct! You won.
You earned: 50 points
```

---

## 🎯 Learning Outcome

Through this project, I improved my understanding of:
- Core Java Programming
- Logical Thinking
- Loop Control Structures
- Conditional Statements
- User Input Handling
- Game Logic Implementation

---

## ✅ Conclusion

The Number Guessing Game was successfully implemented using Core Java concepts.  
This project enhanced my programming skills and provided hands-on experience in building interactive console-based applications.

---

⭐ Developed as part of CODSOFT Java Development Internship

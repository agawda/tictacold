# Tic Tac Toe game

## To run the project:
1. Download the project sources
2. Run mvn install inside the project folder
3. Go to the target folder
4. Run tictactoe-1.0-SNAPSHOT.jar

## Test list:
### 1st iteration:
1. Is board created properly? ☑
2. Is user's choice stored correctly? ☑
3. Is it impossible to overwrite taken field? ☑
4. Are symbols changed correctly (turns)? ☑
5. Can you win? ☑

### 2nd iteration:
1. Can you see the board? ☑
2. Can you create the Symbol from String? ☑
3. Is creating Symbols from Strings working properly? ☑
4. Is Board working with Symbols? (Reuse old tests.) ☑
5. Is converting Symbols to Strings working? ☑
6. Does the board work with Symbols? ☑

### 3rd iteration:
#### Symbols class:
1. Add a symbol. ☑
2. Is Overwriting fields impossible? (Should throw exceptions in the future) ☑
3. Is it possible to check symbol at one tile? ☑

### 4th iteration:
#### Refactor Board so it uses Symbols.
1. Does creating a new board work? ☑
2. Is adding new tiles working? ☑
3. Is printing working? ☑
4. Does win algorithm work? ☑

### 5th iteration:
#### Extract and change winning algorithm.
1. Is Result class working? ☑
2. Change the algorithm. ☑ (Change it again later.)

### 6th iteration:
#### Player and Players classes
1. Are player names stored correctly?
2. Are player symbols stored correctly?
3. Do players have scores?
4.

## General todo:
1. Player names
2. Draw
3. Switch to parametrized tests
4. Run the game automatically
5. Change the winning algorithm
6. Scores
7. Make classes which contain rows/columns/diagonals (connected to 5)
8. Different board sizes
9. A lot of refactoring
10. Multiple languages


## Requirements list:
1. It is "best of three", though I can quit mid-way through.
2. Characters: O (naught) and X (cross)
3. Players have names and scores.
4. Winner has better score. Draw is possible.
5. Interactive:
6. it should accept players instructions about each move
7. it should ask who begins
8. it informs about session result, who’s turn it is now and the like
9. Match gives points: win 3, draw 1, loss 0. 3 matches == game.
10. Game works with square or rectangular board.
11. Player wins, if he has unbroken line of his characters, in a row, in a column or diagonally.
12. Winning is announced in a message: Wygrywa O. O: 1 X: 0 (numbers are current points).
13. Game is configurable:
14. Board dimensions: 3x3, 4x4, 99x101, etc. (user provides)
15. Winning condition has variable number of characters: 3, 4, 5, etc. (user provides)
16. Game messages should have configurable target: console (System.out) or logs (for the sake of this exercise it’s OK to make it System.err), or external printer.
17. before game starts it asks who goes first, O or X
18. We are bi-lingual: Polish and English are fine. In future we want to add more languages: messages are to be read from a file for chosen language. Choosing the language depends on configuration variable.
<h1>Sudoku Solver</h1>
A Java-based application to solve Sudoku puzzles using a backtracking algorithm. This project demonstrates problem-solving using recursion and constraint satisfaction techniques.
<br>


<h3>Features</h3>
Solves standard 9x9 Sudoku puzzles <br>
Uses backtracking algorithm <br>
Command-line interface for input/output <br>
Well-structured and object-oriented Java code <br>


<h3>Demo</h3>
<img src="img.jpg" alt="Output Image">


<h3>Installation</h3>
1. Clone the repository: <br>
git clone https://github.com/your-username/sudoku-solver-java.git <br>
cd sudoku-solver-java
<br>
2. Compile the code: <br>
javac SudokuSolver.java
<br>
3. Run the program:
<br>


<h3>How It Works</h3>
Start.
<br>
1. We start with the first empty cell.
<br>
2. We generate a list of possible valid values that can be filled in that cell.
<br>
3. We iterate over this list and start with the first value. This value is placed in the required cell.
<br>
4. We move on to the next cell. We again generate a list of possibilities. However, if no list can be generated, then this means that there is something wrong with the value of the previous cell. We then move back to the previous cell and place the next value on the generated list in the cell now. We repeat this step until the current cell has a valid value placed inside it.
<br>
5. We stop when we reach the 81st cell (the last cell in a Sudoku puzzle) and have placed a valid value.
<br>
6. The puzzle has now been solved.
<br>
Stop.

<h3>Contributing</h3>
Contributions are welcome! Feel free to open issues or submit pull requests for improvements or new features.

# COS201-Programming-I
Practical exercises for COS 201 Computer Programming I, including Java programs on variables, data types, and input/output

### Student Details

- Name: Erhisere Oghenenyeruovwo Rhema
- Matriculation Number: 25/17334
- Programme: Computer Science
- Course Code: COS 201

### Practical Title

Variables, Data Types, Expressions and Input/Output

### Objectives

- Declare and initialize Java variables.
- Use appropriate primitive and reference data types.
- Perform arithmetic calculations.
- Read keyboard input using Scanner.
- Display formatted output.
- Compile, test and submit Java programs using GitHub.

### Programs

1. `week03/SimpleCalculator.java`
   - Reads two numbers and an operator (+, -, *, /), then displays the result.
   - Checks for division by zero and invalid operators, and lets the user calculate again.

2. `week03/AverageCalculator.java`
   - Asks how many numbers the user wants to average, reads them in, then displays the total and the average.

3. `week03/ItemCostCalculator.java`
   - Reads the name, unit price and quantity of each item, plus a tax rate.
   - Displays the subtotal, tax and total cost.

### Skills Practised

- Declaring and initializing variables (`int`, `double`, `char`, `String`)
- Arithmetic and relational expressions
- Decision making with `if` and `switch`
- Repetition with `for` and `do-while` loops
- Keyboard input with the `Scanner` class
- Formatted output with `printf()`
- Compilation and execution with `javac` and `java`

### How to Run

Open a terminal in the `week03` directory.

Compile and run the simple calculator:

- `javac SimpleCalculator.java`
- `java SimpleCalculator`

Compile and run the average calculator:

- `javac AverageCalculator.java`
- `java AverageCalculator`

Compile and run the item cost calculator:

- `javac ItemCostCalculator.java`
- `java ItemCostCalculator`

### Testing

Each program should be tested with different valid inputs to confirm the results match the expected calculations. For example:

- Simple calculator: `20 / 4` should give `5.0`, and dividing by `0` should show an error message.
- Average calculator: the numbers `70`, `80` and `90` should give a sum of `240.0` and an average of `80.00`.
- Item cost calculator: 3 units at a price of `1500` with no tax should give a total of `4500.00`.

### Learning Outcome

I practised declaring variables, using data types and expressions, reading keyboard input with `Scanner`, and displaying formatted output in Java.

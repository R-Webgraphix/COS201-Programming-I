# COS 201 - Computer Programming I

Practical exercises for COS 201 Computer Programming I, including Java programs on variables, data types, and input/output. This repository covers **Weeks 1 to 3** of the course.

## Student Details

- Name: Erhisere Oghenenyeruovwo Rhema
- Matriculation Number: 25/17334
- Programme: Computer Science
- Course: COS 201 - Computer Programming I
- Programming Language: Java

## Repository Structure

```
COS201-Programming-I/
├── README.md
├── week01/
│   └── week1firstprogram.java
├── week02/
│   └── HelloWorld.java
└── week03/
    ├── SimpleCalculator.java
    ├── AverageCalculator.java
    └── ItemCostCalculator.java
```

## Tools Used

- Java Development Kit (JDK): provides the Java compiler (`javac`) and runtime
- Visual Studio Code: code editor with the Extension Pack for Java
- Git: version control
- GitHub Desktop: commits and pushes changes to GitHub
- GitHub: hosts the repository online

---

## Week 1: Introduction to Programming and Problem-Solving

### Topics Covered

- What a computer, a computer program and computer programming are
- Why programming matters in different computing disciplines
- Programming languages and paradigms (procedural, object-oriented, functional and logic)
- How Java runs a program: source code, compiler (`javac`), bytecode and the Java Virtual Machine (JVM)
- The program development life cycle: problem definition, analysis, design, coding, compilation, testing and debugging, documentation and maintenance
- The Input-Process-Output (IPO) model for analysing a problem
- Algorithms and the characteristics of a good algorithm
- Pseudocode and flowcharts
- Common errors: syntax, runtime and logical errors, and how to debug them

### Practical

Created and executed my first Java program. It displays my course code and title, my programme of study, three reasons programming is important to my discipline, and a personal learning goal.

- File: `week01/week1firstprogram.java`

### Skills Practised

- Writing a Java class and `main` method
- Output with `System.out.println()`
- Compiling and running a program
- Using GitHub for version control

---

## Week 2: Development Environment and First Java Program

### Topics Covered

- What a development environment and an IDE are
- The difference between the JDK, the JVM and the Java compiler
- Installing and verifying the JDK (`java -version` and `javac -version`)
- Installing Visual Studio Code and the Extension Pack for Java
- Installing Git and GitHub Desktop
- The structure of a basic Java program: class, `main` method and `System.out.println()`
- `print()` versus `println()`
- Single-line and multi-line comments
- Finding and fixing common errors, such as a missing semicolon
- Version control with Git and GitHub: repositories, cloning, committing and pushing

### Practical

Wrote, compiled and ran a Java program that displays the course, programme, week, topic and learning goal.

- File: `week02/HelloWorld.java`

### How to Run

1. Open a terminal in the `week02` directory.
2. Compile the program: `javac HelloWorld.java`
3. Run the program: `java HelloWorld`

### Expected Output

```
COURSE: COS 201
COURSE TITLE: Computer Programming I
PROGRAMME: Computer Science
WEEK: 2
TOPIC: Development Environment and Java
GOAL: To learn how to write Java programs.
```

---

## Week 3: Variables, Data Types, Expressions and Input/Output

### Topics Covered

- Variables: declaration, initialization, assignment and updating
- Rules and conventions for naming variables (camelCase) and constants (`final`)
- Java's primitive data types (`int`, `double`, `char`, `boolean`, etc.) and the `String` class
- Arithmetic, assignment, relational and logical operators
- Operator precedence and the use of parentheses
- Integer division versus decimal division
- Type conversion and casting
- Keyboard input with the `Scanner` class (`nextInt()`, `nextDouble()`, `nextLine()`)
- Formatted output with `printf()` (`%s`, `%d`, `%.2f`, `%n`)
- Testing and debugging programs

### Practical Programs

1. `week03/SimpleCalculator.java`
   - Reads two numbers and an operator (+, -, *, /), then displays the result.
   - Checks for division by zero and invalid operators, and lets the user calculate again.

2. `week03/AverageCalculator.java`
   - Asks how many numbers the user wants to average, reads them in, then displays the sum and the average.

3. `week03/ItemCostCalculator.java`
   - Reads the name, unit price and quantity of each item, plus a tax rate.
   - Displays the subtotal, tax and total cost.

### How to Run

Open a terminal in the `week03` directory, then compile and run each program:

```
javac SimpleCalculator.java
java SimpleCalculator

javac AverageCalculator.java
java AverageCalculator

javac ItemCostCalculator.java
java ItemCostCalculator
```

### Testing

Each program was designed to be tested with different valid inputs, checking that the results match the expected calculations:

- Simple calculator: `20 / 4` should give `5.0`, and dividing by `0` should show an error message.
- Average calculator: the numbers `70`, `80` and `90` should give a sum of `240.0` and an average of `80.00`.
- Item cost calculator: 3 units at a price of `1500` with no tax should give a total of `4500.00`.

---

## Learning Outcome

Over Weeks 1 to 3, I learned how to approach a problem step by step, set up a Java development environment, and write, compile and run Java programs. I practised using variables, data types, operators, keyboard input and formatted output, and I submitted my work through a GitHub repository.

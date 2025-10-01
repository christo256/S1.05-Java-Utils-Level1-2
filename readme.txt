README - Java Exercises Level 1
===============================

Project structure:
------------------
S1.05-Java-Utils-Level1-2/
├─ src/
│   └─ task1and2_S1_05_JavaUtils_Level1/
│       ├─ MainListDirectory.java
│       ├─ DirectoryLister.java
│       ├─ DirectoryPrinter.java
│       └─ DirectoryValidator.java
├─ bin/         <- compiled .class files go here
└─ readme.txt

Instructions to compile and run from command line:
--------------------------------------------------

1. Open a terminal or command prompt.

2. Navigate to the root of the project (where src/ and bin/ folders are):
   Example:
   > cd path\to\S1.05-Java-Utils-Level1-2

3. Compile all Java source files into the bin folder:
   (Make sure the bin folder exists; if not, create it)
   > javac -d bin src/task1and2_S1_05_JavaUtils_Level1/*.java

   Explanation:
   - `-d bin` tells javac to place .class files into the bin folder.
   - `src/task1and2_S1_05_JavaUtils_Level1/*.java` selects all .java files in your package.

4. Run the program:
   > java -cp bin task1and2_S1_05_JavaUtils_Level1.MainListDirectory <directory_path>

   Replace `<directory_path>` with the relative path to the directory you want to list. Example:
   > java -cp bin task1and2_S1_05_JavaUtils_Level1.MainListDirectory src

   Notes:
   - `-cp bin` tells Java where to find compiled .class files.
   - Do **not** use absolute paths for portability; use relative paths instead.
   - Output will show the content of the directory, alphabetically sorted, indicating (D) for directories and (F) for files, including last modified date.

5. Repeat execution for Exercise 2:
   - The same `MainListDirectory` class also lists directories recursively.
   - Example:
   > java -cp bin task1and2_S1_05_JavaUtils_Level1.MainListDirectory src

Good practices:
---------------
- All paths are relative.
- Use `File.separator` in your code to ensure compatibility across operating systems.
- Project is ready to be cloned and run by anyone without changing folder names or paths.

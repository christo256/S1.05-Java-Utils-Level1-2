# 📚 S1.05-Java-Utils-Level1-2

All exercises in this project must be compiled and executed from the command line, not only from the IDE.  
This document explains how to compile and execute each exercise **class by class**, using **relative paths** for portability.  

Project developed in Java, following clean code and Git best practices.

---

TECHNOLOGIES USED
---

- Java 17+
- IntelliJ IDEA
- Standard Java IO / NIO
- (Optional) Apache Commons Configuration for Level 2 Exercise 1

---

## 📂 Project structure

```text
src/
├── task1_S1_05_JavaUtils_Level2/
│   ├── MainDirectoryToFile.java
│   ├── ConfigReader.java
├── task2_S1_05_JavaUtils_Level1/
│   ├── MainListDirectory.java
│   ├── DirectoryLister.java
│   ├── DirectoryPrinter.java
│   ├── DirectoryValidator.java
├── task3and4_S1_05_JavaUtils_Level1/
│   ├── MainListDirectoryToFile.java
│   ├── DirectoryListerToFile.java
│   ├── DirectoryPrintToFile.java
│   ├── DirectoryValidator2.java
│   ├── TextFileReader.java
├── task5_S1_05_JavaUtils_Level1/
│   ├── MainAnimal.java
│   ├── Animal.java
│   ├── AnimalSerializer.java
│   └── AnimalDeserializer.java
```
---

## LEVEL 1 - EXERCISE 1  
---

📌 **Description:**  
List alphabetically the content of a directory received as parameter.

🧠 **Main class:** `MainListDirectory.java`  
📦 **Package:** `task2_S1_05_JavaUtils_Level1`

➡️ Compile:
**Compile:**
`javac -d out src/task2_S1_05_JavaUtils_Level1/MainListDirectory.java`

➡️ Execute:
 
`java -cp out task2_S1_05_JavaUtils_Level1.MainListDirectory ./testFolder`

---

## LEVEL 1 - EXERCISE 2  
---

📌 **Description:**  
Recursively list a directory tree. Show elements alphabetically inside each level, indicate if it is a Directory (D) or File (F), and print last modification date.

🧠 **Main class:** `MainListDirectory.java` (same, extended functionality)

➡️ Compile:

`javac -d out src/task2_S1_05_JavaUtils_Level1/MainListDirectory.java`

➡️ Execute:

`java -cp out task2_S1_05_JavaUtils_Level1.MainListDirectory ./testFolder`

---

## LEVEL 1 - EXERCISE 3  
---
📌 **Description:**  
Save the recursive directory listing into a TXT file instead of printing it.

🧠 **Main class:** `MainListDirectoryToFile.java`  
📦 **Package:** `task3and4_S1_05_JavaUtils_Level1`

➡️ Compile:

`javac -d out src/task3and4_S1_05_JavaUtils_Level1/MainListDirectoryToFile.java`

➡️ Execute:

`java -cp out task3and4_S1_05_JavaUtils_Level1.MainListDirectoryToFile ./testFolder output.txt`

---
## LEVEL 1 - EXERCISE 4  
---
📌 **Description:**  
Read any TXT file and display its content on the console.

🧠 **Main class:** `TextFileReader.java`  
📦 **Package:** `task3and4_S1_05_JavaUtils_Level1`

➡️ Compile:

`javac -d out src/task3and4_S1_05_JavaUtils_Level1/TextFileReader.java`

➡️ Execute:

`java -cp out task3and4_S1_05_JavaUtils_Level1.TextFileReader output.txt`

---
LEVEL 1 - EXERCISE 5  
---
📌 **Description:**  
Serialize a Java object into a `.ser` file, then deserialize it and display the result.

🧠 **Main class:** `MainAnimal.java`  
📦 **Package:** `task5_S1_05_JavaUtils_Level1`

➡️ Compile:

`javac -d out src/task5_S1_05_JavaUtils_Level1/MainAnimal.java`

➡️ Execute:

`java -cp out task5_S1_05_JavaUtils_Level1.MainAnimal`

---
## LEVEL 2 - EXERCISE 1  
---
📌 **Description:**  
Run the functionality from Level 1 - Exercise 3, but parameterized through a configuration file (`config.properties`) using Java Properties or Apache Commons Configuration.

🧠 **Main class:** `MainDirectoryToFile.java`  
📦 **Package:** `task1_S1_05_JavaUtils_Level2`

➡️ Compile:

`javac -d out src/task1_S1_05_JavaUtils_Level2/MainDirectoryToFile.java`

➡️ Execute:

`java -cp out task1_S1_05_JavaUtils_Level2.MainDirectoryToFile`

Make sure your `config.properties` file is in the project root and contains the required parameters (e.g., input directory, output file name).

---
NOTES & BEST PRACTICES
---
- Use **File.separator** in code to build file paths for cross-platform compatibility.
- Avoid absolute paths. Use relative paths like `./src`, `./out`, `./testFolder`.
- Include a `.gitignore` file to avoid uploading `out/`, `.idea/`, `.class` files, etc.
- Commit with clear messages and keep the repository clean.
- Do not upload commented-out code.

1.  **Clone the Repository:**
    Open your terminal or command line and execute:
    ```bash
    git clone https://github.com/christo256/S1.04---Testing---Level-1-2--
    ```
    `cd S1.04---Testing---Level-1-2--`

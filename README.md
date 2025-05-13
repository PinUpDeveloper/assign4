# 🌐 Weighted Graph with Vertex-Based Traversal

📌 **Overview**

This project implements a weighted directed graph in Java using `Vertex` objects instead of traditional `Edge` classes. It includes:

🔹 A custom `Vertex` class with data and adjacency mapping (with weights)  
🔹 A `WeightedGraph` class to manage vertices and edges  
🔹 BFS and Dijkstra implementations for graph traversal  
🔹 An example `Main` class to demonstrate usage  

🚀 **Features**

✅ Clean object-oriented design using only `Vertex` references  
✅ Breadth-First Search (BFS) for shortest path in unweighted graphs  
✅ Dijkstra’s Algorithm for shortest weighted paths  
✅ Reusable and generic classes for any data type `V` in `Vertex<V>`  
✅ Works with unchanged `Main` class as in lecture repo  

🛠 **Technologies Used**

- Java 21 (or compatible versions)  
- IntelliJ IDEA / VS Code / Eclipse  
- Git & GitHub for version control  

📥 **Installation & Setup**

1️⃣ Clone the Repository  
```bash
git clone https://github.com/PinUpDeveloper/assign4.git
cd assign4
```

2️⃣ Compile the project  
```bash
javac -d out src/**/*.java
```

3️⃣ Run the program  
```bash
java -cp out Main
```

📂 **Project Structure**
```
│── src/
│   ├── Vertex.java
│   ├── WeightedGraph.java
│   ├── Search.java
│   ├── BreadthFirstSearch.java
│   ├── DijkstraSearch.java
│   └── Main.java
│── README.md
```

📚 **References & Resources**

📖 [Graph Representations - GeeksforGeeks](https://www.geeksforgeeks.org/graph-data-structure-and-algorithms/)

📖 [Dijkstra Algorithm - Visual Algo](https://visualgo.net/en/sssp)

📖 [Java Collections Framework - Oracle Docs](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html)

👨‍💻 **Author**  
👤 Tazhibayev Marsel
📌 Astana IT University
📅 Year: 2025

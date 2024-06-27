# Data Structures and Algorithms (DSA)

## What is DSA?

**Data Structures and Algorithms (DSA)** is a fundamental concept in computer science and software engineering. Data structures are ways of organizing and storing data so that they can be accessed and modified efficiently. Algorithms are step-by-step procedures or formulas for solving problems.

## Uses of DSA

1. **Efficient Data Management**: DSA helps in storing data in an organized manner so that it can be accessed and modified efficiently.
2. **Optimization**: Algorithms help in finding the most efficient way to solve a problem, optimizing time and space complexity.
3. **Problem Solving**: Understanding DSA is crucial for solving complex problems and for competitive programming.
4. **System Design**: Helps in designing robust and scalable systems.

## Types of Data Structures

### 1. Linear Data Structures

- **Arrays**: Collection of elements identified by index or key.
    ```java
    int[] array = new int[10]; // Declaration
    array[0] = 1; // Initialization
    ```
- **Linked Lists**: A sequence of elements, where each element points to the next element.
    ```java
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    class LinkedList {
        Node head; // head of list
    }
    ```
- **Stacks**: Last In First Out (LIFO) data structure.
    ```java
    import java.util.Stack;

    Stack<Integer> stack = new Stack<>();
    stack.push(10); // Push
    stack.pop(); // Pop
    ```
- **Queues**: First In First Out (FIFO) data structure.
    ```java
    import java.util.LinkedList;
    import java.util.Queue;

    Queue<Integer> queue = new LinkedList<>();
    queue.add(10); // Enqueue
    queue.poll(); // Dequeue
    ```

### 2. Non-linear Data Structures

- **Trees**: Hierarchical structure with a root node and child nodes.
    - **Binary Tree**: Each node has at most two children.
        ```java
        class Node {
            int data;
            Node left, right;
            public Node(int item) {
                data = item;
                left = right = null;
            }
        }

        class BinaryTree {
            Node root;
            BinaryTree() {
                root = null;
            }
        }
        ```
    - **Binary Search Tree**: Binary tree with nodes arranged in a sorted manner.

- **Heaps**: A special tree-based data structure that satisfies the heap property.
    - **Min-Heap**: The key at the root must be the minimum among all keys present in the heap.
    - **Max-Heap**: The key at the root must be the maximum among all keys present in the heap.

- **Graphs**: Collection of nodes connected by edges.
    - **Directed Graph**: Edges have a direction.
    - **Undirected Graph**: Edges do not have a direction.
    - **Weighted Graph**: Edges have weights or costs.
    - **Unweighted Graph**: Edges do not have weights or costs.

### 3. Hash-based Data Structures

- **Hash Tables**: Stores key-value pairs for efficient lookup.
    ```java
    import java.util.HashMap;

    HashMap<Integer, String> hashMap = new HashMap<>();
    hashMap.put(1, "Value1"); // Insert
    String value = hashMap.get(1); // Retrieve
    ```


- **HashSet**: Stores unique elements for efficient lookup.
    ```java
    import java.util.HashSet;

    HashSet<String> hashSet = new HashSet<>();
    hashSet.add("Value1"); // Add
    hashSet.contains("Value1"); // Check if contains
    hashSet.remove("Value1"); // Remove
    ```

These are some of the fundamental data structures and algorithms. Mastering these concepts is crucial for solving complex problems efficiently and for building robust, scalable systems. Keep exploring and practicing to enhance your understanding and skills in DSA!

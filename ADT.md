# Abstract Data Types (ADTs) in Java using DSA

Abstract Data Types (ADTs) provide a way to define data structures and their operations without specifying the exact implementation. Here’s an overview of some commonly used ADTs in Java and their typical implementations:

## 1. List
A list is an ordered collection of elements that allows duplicates. It provides indexed access to elements.

### Common Implementations
- **ArrayList**: A resizable array implementation.
- **LinkedList**: A doubly-linked list implementation.

### Basic Operations
- `add(element)`: Adds an element to the list.
- `remove(index)`: Removes the element at the specified index.
- `get(index)`: Retrieves the element at the specified index.
- `size()`: Returns the number of elements in the list.
- `isEmpty()`: Checks if the list is empty.

## 2. Stack
A stack is a collection that follows the Last-In-First-Out (LIFO) principle. It allows operations at one end only.

### Common Implementations
- **Array-based stack**: Uses an array to store elements.
- **Linked list stack**: Uses a linked list to store elements.

### Basic Operations
- `push(element)`: Adds an element to the top of the stack.
- `pop()`: Removes and returns the top element of the stack.
- `peek()`: Returns the top element without removing it.
- `isEmpty()`: Checks if the stack is empty.

## 3. Queue
A queue is a collection that follows the First-In-First-Out (FIFO) principle. It allows operations at both ends.

### Common Implementations
- **Array-based queue**: Uses an array to store elements.
- **Linked list queue**: Uses a linked list to store elements.

### Basic Operations
- `enqueue(element)`: Adds an element to the end of the queue.
- `dequeue()`: Removes and returns the front element of the queue.
- `peek()`: Returns the front element without removing it.
- `isEmpty()`: Checks if the queue is empty.

## 4. Deque
A deque (double-ended queue) allows insertion and removal of elements at both ends.

### Common Implementation
- **ArrayDeque**: Uses a resizable array to store elements.

### Basic Operations
- `addFirst(element)`: Adds an element to the front.
- `addLast(element)`: Adds an element to the end.
- `removeFirst()`: Removes and returns the front element.
- `removeLast()`: Removes and returns the last element.
- `peekFirst()`: Returns the front element without removing it.
- `peekLast()`: Returns the last element without removing it.

## 5. Priority Queue
A priority queue stores elements such that the element with the highest priority is always at the front.

### Common Implementation
- **Binary heap**: A complete binary tree that satisfies the heap property.

### Basic Operations
- `add(element)`: Adds an element to the queue.
- `poll()`: Removes and returns the highest priority element.
- `peek()`: Returns the highest priority element without removing it.

## 6. Map
A map is a collection that maps keys to values, with no duplicate keys allowed.

### Common Implementations
- **HashMap**: Uses a hash table to store key-value pairs.
- **TreeMap**: Uses a red-black tree to store key-value pairs in sorted order.

### Basic Operations
- `put(key, value)`: Adds a key-value pair to the map.
- `get(key)`: Retrieves the value associated with the key.
- `remove(key)`: Removes the key-value pair from the map.
- `containsKey(key)`: Checks if the map contains the key.
- `size()`: Returns the number of key-value pairs.



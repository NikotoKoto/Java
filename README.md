# Java

## 4 OOP pillars

### Encapsulation

Is the fact of making fields private and managing them with setters and getters.

### Inheritance 

Is the fact of inheriting different methods from the parent class into the child class.

### Polymorphism 

Is the fact that an object can take multiple forms. We ca, have overloading and overriding. Override changes the body of the function, whereas overload changes the signature by adding ohter parameters but keeps the same name.

### Abstraction 

Is the fact of having an abstract class that cannot be instantiated and is used as a model for child classes.

## Difference between class, Abstract class and interface

### Class
- A class is a blueprint for objects.
- It can have attributes and methods
- full implementation

### Abstract class
 - Cannot be instantiatied 
 - Can contain abstract method, concrete method, attributes / constructor

### Interface 
- Define a contract: classes must implement all methods.
- ore Java 8: only abstract methods + constants.
- Since Java 8: can have default methods (with body) and static methods.
- Since Java 9: can even have private methods inside.

## Java Collections

### List

A list is an ordered collection. You can access element by index, it allows duplicates.

🔸 Implementations of List:
	1.	ArrayList

<ul>
  <li>Backed by a dynamic array.</li>
  <li>Fast for get(index) and iteration.</li>
  <li>Slow for inserting/removing in the middle (needs shifting).</li>
</ul>
		
```
List<String> list = new ArrayList<>();
list.add("Alice");
list.add("Bob");
System.out.println(list.get(0)); // Alice
```

📌 Use when: you need fast access by index, mostly add/remove at the end.

### LinkedList

<ul>
  <li>Doubly-linked list.</li>
  <li>Fast for adding/removing at beginning or middle.</li>
  <li>Slow for access by index (you must traverse).</li>
</ul>

```
List<String> list = new LinkedList<>();
list.add("Alice");
list.addFirst("Bob");
```
📌 Use when: you insert/remove elements often in the middle/start.

## Set

👉 A Set stores unique elements (no duplicates).

🔸 Implementations of Set:
	
 ### HashSet

<ul>
  <li>Uses a hash table.</li>
  <li>Unordered (no guarantee of order).</li>
  <li>Very fast for add, remove, contains (O(1) average).</li>
</ul>

 ```
Set<String> set = new HashSet<>();
set.add("Alice");
set.add("Bob");
set.add("Alice"); // ignored
```
📌 Use when: uniqueness matters, order doesn’t.

### LinkedHashSet

<ul>
  <li>Like HashSet but keeps insertion order</li>
	<li>Slightly slower than HashSet.</li>
</ul>

```
Set<String> set = new LinkedHashSet<>();
set.add("Alice");
set.add("Bob");
System.out.println(set); // [Alice, Bob]
```

📌 Use when: you want uniqueness + order of insertion.

### TreeSet

<ul>
  <li>Implements SortedSet.</li>
	<li>Keeps elements sorted (natural order or custom Comparator).</li>
	<li>Slower than HashSet (O(log n)).</li>
</ul>

```
Set<Integer> set = new TreeSet<>();
set.add(3);
set.add(1);
set.add(2);
System.out.println(set); // [1, 2, 3]
```

📌 Use when: you need sorted unique values.

## Map

👉 A Map stores key-value pairs. Keys must be unique.

🔸 Implementations of Map:
	
  ### HashMap

<ul>
	<li>	Uses a hash table.
	<li>	Unordered, allows 1 null key and multiple null values.</li>
	<li>	Very fast for get/put (O(1) average)</li>
</ul>

```
Map<String, Integer> map = new HashMap<>();
map.put("Alice", 25);
map.put("Bob", 30);
```
📌 Use when: you need fast access, order doesn’t matter.

### LinkedHashMap

<ul>
  <li>Like HashMap but keeps insertion order.</li>
 <li> Can also be configured as access-order (useful for caches).</li>
</ul>

```
Map<String, Integer> map = new LinkedHashMap<>();
map.put("Alice", 25);
map.put("Bob", 30);
System.out.println(map); // {Alice=25, Bob=30}
```
📌 Use when: you need predictable iteration order.

### TreeMap

<ul>
  <li>Implements SortedMap.</li>
	<li>Keeps keys sorted (natural order or comparator).</li>	
	<li>Slower (O(log n)).</li>
</ul>

```
Map<String, Integer> map = new TreeMap<>();
map.put("Bob", 30);
map.put("Alice", 25);
System.out.println(map); // {Alice=25, Bob=30}
```
📌 Use when: you need sorted keys.

## Stream 

### What is a Stream ?

A Stream is like a pipeline to process data.
 
<ul>
	<li>It doesn’t store data itself → it reads from a source (List, Set, array, file…).</li>	
	<li>It lets you transform, filter, or combine data in a declarative way (describe what you want, not how to loop).</li>
</ul>

👉 Think of it like a conveyor belt in a factory:

<ul>
	<li>Objects go in (source).</li>
	<li>They pass through filters and transformations (operations).</li>
	<li>You get a final result (terminal operation).</li>
</ul>

### Stream workflow

Every stream pipeline has 3 steps:

	
#### Source → where the data comes from.

Example:
```
List<String> names = List.of("Alice", "Bob", "Charlie");
Stream<String> stream = names.stream();
```
#### Intermediate operations → transform/filter the stream.

	•	filter() → keep some elements.
	•	map() → transform each element.
	•	sorted() → order them.
	•	distinct() → remove duplicates.

👉 They return a new Stream, so you can chain them.

 ####	Terminal operation → produce the result.
 
	•	collect(toList()) → build a list.
	•	forEach() → iterate and print.
	•	reduce() → combine into one value (sum, max…).

👉 After this, the stream is consumed (cannot be reused).

⸻

🔹 Example

```
List<String> names = List.of("Alice", "Bob", "Charlie", "Bob");

List<String> result = names.stream()          // 1. source
    .filter(n -> n.length() > 3)             // 2. keep names longer than 3
    .distinct()                              // 2. remove duplicates
    .sorted()                                // 2. sort alphabetically
    .toList();                               // 3. collect into a list

System.out.println(result); // [Alice, Charlie]
```
🔹 Common Stream Operations

Intermediate (return Stream)

	•	filter(Predicate) → keep some elements.
	•	map(Function) → transform elements.
	•	sorted() → sort.
	•	distinct() → remove duplicates.
	•	limit(n) → take first n elements.
	•	skip(n) → skip first n elements.

Terminal (end the pipeline)

	•	collect(toList()) → build a new list.
	•	forEach() → apply action on each element.
	•	reduce() → combine into one result.
	•	count() → number of elements.
	•	anyMatch(), allMatch(), noneMatch() → boolean checks.

⸻

📌 Why use Streams instead of loops?

👉 Classic loop:

```
List<String> result = new ArrayList<>();
for (String name : names) {
    if (name.length() > 3 && !result.contains(name)) {
        result.add(name);
    }
}
Collections.sort(result);
```

👉 Stream version:

```
List<String> result = names.stream()
    .filter(n -> n.length() > 3)
    .distinct()
    .sorted()
    .toList();
```
⚡ Much cleaner and easier to read!

## Difference between "final" and "records"

### Final 

final is a keyword that means something cannot be changed.

- variable cannot be reassigned.
- attributes must be assigned once.
- method cannot be overridden.
- class cannot be extend

### Records 

Record is a special class type designed for immutable data.

All attributes are final and private automatically.

The class gets: 
- constructor 
- getters and setters
- toString()
- equals() and hashcode() generated automatically.

### Resume

- final, keyword that prevents reassignement/extension or orverrding.
- record, a class definition designed to be immutable data carriers.







	

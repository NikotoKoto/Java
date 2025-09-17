# Java


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

##





	

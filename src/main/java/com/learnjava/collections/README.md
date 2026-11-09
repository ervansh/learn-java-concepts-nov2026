# Collections framework
## Theory
The Collections Framework provides interfaces and implementations for groups of objects. List is ordered and permits duplicates; Set models uniqueness; Queue models elements awaiting processing; Map stores key-value mappings and is not a subtype of Collection.
## Concepts
- List: ArrayList and LinkedList.
- Set: HashSet, LinkedHashSet and TreeSet.
- Map: HashMap, LinkedHashMap and TreeMap; iteration and Map.Entry.
- Ordering, duplicates, null support, equals/hashCode and complexity trade-offs.
## Program
Run CollectionsDemo. It demonstrates duplicates in List, insertion order in LinkedHashSet and Map iteration.
## SDET use
Use LinkedHashMap for deterministic reporting order; use sets to de-duplicate test identifiers. Choose concurrent collections when shared access truly requires them.
## Pitfalls
- Assuming HashMap iteration order.
- Mutable objects used as hash keys.
- Selecting a collection without considering ordering and uniqueness.
## Official reference
[Oracle Collections Framework](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html)
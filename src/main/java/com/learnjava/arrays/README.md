# Arrays
## Theory
An array is a fixed-length, indexed container whose elements share one component type. Indexes are zero-based. Arrays can hold primitives or references and can be multidimensional (arrays of arrays).
## Concepts
- Declaration, initialization, traversal and bounds.
- Copying with `Arrays.copyOf`; sorting and searching with `Arrays`.
- Multidimensional arrays and default element values.
## Program
Run `ArraysDemo`. Note that binary search requires the array to be sorted first.
## SDET use
Arrays are useful for fixed-size datasets and expected values. For dynamic test data, consider List or another collection.
## Pitfalls
- Accessing an index outside `0..length-1`.
- Assuming an array grows automatically.
- Calling binarySearch on unsorted data.
## Official reference
[Oracle Arrays API](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html)
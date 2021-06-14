classwork#2 tasks:

### 1: Invert an array
You should invert an int array starting from the middle index to 0 index.

```java
private static void invertFromMiddle(int[] arr) {
        //implement me
}
```
example: 
- input: {1,2,3,4,5}
- output: {5,4,3,2,1}

### 2: Binary search
Implement the [binary search](https://en.wikipedia.org/wiki/Binary_search_algorithm) logic for the sorted `int` array.

```java
private static boolean isExist(int[] arr, int value) {
        //implement me
}
```
example:
- input: arr = {1,2,3,4,5}, value = 1
- output: true

### 3: Insert new data into an already sorted array
You should insert new values `int[]` on the correct positions into an already sorted array.

tips: 
- your previously implemented `binarySeacrch` could help with this or `Arrays.binarySearch(...)` method
- `System.arraycopy` could help you to copy values from one array to another

```java
private static void insert(int[] arr, int[] values) {
        //implement me
}
```
example:
- input: arr = {10,20,30,40,50}, values = {15,95,30}
- output: {10,15,20,30,30,40,50,95}

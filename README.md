# interview-prep

Data Structures and Algorithms interview preparation.

## Data Structure Review

A data structure is a way of organizing data so it can be used effeciently

- essential to create fast algorithms
- help manage and organize data
- make code cleaner and easier to understand

#### Abstract Data Types vs. Data Structures

An abstract data type is an abstraction of that data type only provides an interface to which the data structure adheres to.

ADT -> DS (Implementation)

List -> Dynamic Array, Linked List

Queue -> Liked List based Queue, stackk based queue, array based queue

Map -> Tree map, hash map

## Computational Complexity Analysis

Understand the performance, how much time does this algorithm need to finish, and how much space our algorithm needs to finish

#### Big-O notation

Gives an upper bound of the complexity in the **worst case**, helping to quatify performance as the input size becomes **arbitrarily large**.
n = the size of the input
Complexities ordered in from smallest to largest

- Constant Time: O(1)
- Logarithmic Time: O(log(n))
- Linear Time: O(n)
- Linearithmic Time: O(nlog(n))
- Quadratic Time: O(n^2)
- Cubic Time: O(n^3)
- Exponential Time: O(b^n), b > 1
- Factorial Time: O(n!)

Only cares about input when getting large

O(n + c) = O(n)

can remove constant values

or when mutiplying constat values

O(cn) = O(n)

f(n) = 7log(n)^3 + 15n^2 + 2n^3 + 5

f(n) = O(n^3)

Mutiply loops on different levels, and add loops on the same level.

#### Examples

Provide code examples and common algorithm times

Finding all subsets of set -> O(2^n)

finding all permutations of string -> O(n!)

sorting using mergesort -> O(nlog(n))

iterating over all the cells in a matrix of size n by m -> O(nm)

## Static and Dynamic Arrays

The most used data structure, forms a fundamental building block for all other data structure

Static Array

- fixed length
- n elements
- indexable from range [0, n-1]
- memory addresses are next to eachother

1. used storing accessing sequential data
2. temporary store objects
3. buffers for IO routines
4. lookup tables and inverse lookup tables
5. return mutiple values from function
6. cache answers to sub problems (coin change)

Complexity

- Static -> Dynamic
- Access O(1) O(1)
- search O(n) O(n)
- insertion n/a o(n)
- appending n/a o(1)
- deletion n/a O(n)

Dyanmic Arrays

can grow an shrink in sdize

## Singly and Doubly Linked List

A linked list is a sequential list of nodes that hold data which point to other nodes also containing data

Last node always has a null reference to the next node

- Used in many lists, stacks, and queues
- creating circular lists (last node pointing to fist node)
- real world objects such as train cars
- used i hashtable, seperate chaining
- used in graphs

**Head**: The first node in a linked list

**Tail**: the last node

**Pointers**: always point to next node

**Node**: an object containing data and pointers

### Singly

Pointer to next node

- less memory, bc of pointers to node
- one pointer to each node

Search -> O(n)

Insert at head -> O(1)

insert at tail -> O(1)

remove head -> O(1)

remove tail -> O(n)

remove in middle -> O(n)

### Doubly

Pointer to next node and previous node

- can be traversed backwards
- can remove a node in constant time
- takes 2x memory

Search -> O(n)

Insert at head -> O(1)

insert at tail -> O(1)

remove head -> O(1)

remove tail -> O(1)

remove in middle -> O(n)

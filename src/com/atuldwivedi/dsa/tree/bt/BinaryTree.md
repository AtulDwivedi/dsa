# Binary Tree

Each node in the binary tree must have at most 2 children.
```mermaid
graph TD
1((1))         
2((2))
3((3))
4((4))
5((5))
6((6))
7((7))
1 -- left child -->  2
1 -- right child --> 3
2 -- left child --> 4 
2 -- right child --> 5
3 -- left child --> 6
3 -- right child --> 7
4 --> 4Null((Null))
5 --> 5Null((Null))
6 --> 6Null((Null))
7 --> 7Null((Null))
```
## DFS
### In Order Traversal [Left, Root, Right]
```mermaid
graph LR
4((4)) --> 2((2)) 
2 --> 5((5))
5 --> 1((1)) 
1 --> 6((6))
6 --> 3((3))
3 --> 7((7))
```
### Pre Order Traversal [Root, Left, Right]
```mermaid
graph LR
1((1)) --> 2((2)) 
2 --> 4((4))
4 --> 5((5)) 
5 --> 3((3))
3 --> 6((6))
6 --> 7((7))
```
### Post Order Traversal [Left, Right, Root]
```mermaid
graph LR
4((4)) --> 5((5)) 
5 --> 2((2))
2 --> 6((6)) 
6 --> 7((7))
7 --> 3((3))
3 --> 1((1))
```
---

## BFS
### Level Order Traversal
```mermaid
graph LR
1((1)) --> 2((2)) 
2 --> 3((3))
3 --> 4((4)) 
4 --> 5((5))
5 --> 6((6))
6 --> 7((7))
```
---
```mermaid
graph LR
A[Square Rect] -- Link text --> B((Circle))
A --> C(Round Rect)
B --> D{Rhombus}
C --> D
```

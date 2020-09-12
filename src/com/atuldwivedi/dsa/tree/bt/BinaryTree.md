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
1 -- left -->  2
1 -- right --> 3
2 -- left --> 4 
2 -- right --> 5
3 -- left --> 6
3 -- right --> 7
4 --> 4c((Null))
5 --> 5c((Null))
6 --> 6c((Null))
7 --> 7c((Null))

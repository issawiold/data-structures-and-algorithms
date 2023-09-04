# Implement a Queue using two Stacks.

## Whiteboard Process
![the white board of code challenge ](https://i.ibb.co/tm274sQ/Whiteboard-11.png)
## Approach & Efficiency
create two stacks one called front(frontwards shortened) and the other called back (backwards shortened)
to enqueue data to one use push from stack and to dequeue data pop the data from front while pushing it to back until front becomes empty and the stack is saved backwards into back return the pop() afterwords pop() all the elements in back and save them in front to return the stack back to how it was before you use the return 
## Solution
![Solution](https://i.ibb.co/VS0LFJB/psudeo-test.png)

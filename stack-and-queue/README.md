# Implement a Queue using two Stacks.

## Whiteboard Process
![the white board of code challenge ](https://i.ibb.co/tm274sQ/Whiteboard-11.png)
## Approach & Efficiency
create two stacks one called front(frontwards shortened) and the other called back (backwards shortened)
to enqueue data to one use push from stack and to dequeue data pop the data from front while pushing it to back until front becomes empty and the stack is saved backwards into back return the pop() afterwords pop() all the elements in back and save them in front to return the stack back to how it was before you use the return 
## Solution
![Solution](https://i.ibb.co/VS0LFJB/psudeo-test.png)
============================================================
# Multi-bracket Validation.

## Whiteboard Process
![the white board of code challenge ](hhttps://i.ibb.co/MNZN9y9/Whiteboard-12.png)
## Approach & Efficiency
Initialize an empty stack or queue.
Iterate through each character in the input string.
If the character is an opening bracket (i.e., '(', '[', or '{'), push it onto the stack or enqueue it in the queue.
If the character is a closing bracket (i.e., ')', ']', or '}'), check if the stack or queue is empty. If it is, return False because there is no corresponding opening bracket.
If the stack or queue is not empty, pop the top element from the stack or dequeue the front element from the queue.
Check if the popped/dequeued element matches the current closing bracket. If it doesn't, return False because the brackets are not closed properly.
After iterating through all the characters, check if the stack or queue is empty. If it is, return True because all brackets are closed properly. Otherwise, return False.
 ## Solution
![Solution](https://i.ibb.co/cQNncmD/test.png)

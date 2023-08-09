# array-insert-shift
Insert and shift an array in middle at index

## Whiteboard Process
![white board](https://i.ibb.co/F3RtdCp/Whiteboard-1.png)
## Approach & Efficiency
I decided to create a new array and then add elements before and after the middle index using an if statement 
then I inserted the number at the middle index 
## Solution
so you enter this array [2,4,6,-8] and the number 5 , the first thing the function does is creating a new array
newArray[0,0,0,0,0] that have the length of the entered array plus one ,
afterwords it loops through the values of the first array and through an if statement 
so the first element 2 has the index of zero which is less than 2 so
the first element of new array becomes 2
[2,0,0,0,0]
and so on until we reach the element 6
which has the index of 2 which is not less than 2 , so the newArray become like this 
[2,4,0,6,0]
and eventually 
[2,4,0,6,-8]
after that we leave the loop
and the number is assigned by index into the array
[2,4,5,6,-8]
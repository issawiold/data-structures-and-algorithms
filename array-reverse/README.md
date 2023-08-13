# Reverse an array.

## Whiteboard Process
![the white board of code challenge 1](https://i.ibb.co/286rn3h/Whiteboard-1.png)

## Approach & Efficiency
I created a new array using the length of the array inputed to make sure that both has the same length.
then I created an integer and initiated to the value 0 .
after that I used a for loop and began the counter from the length of the inputed array-1 and would move downwards
inside the for loop , I used the index of the for loop to set a value to the new array element from the inputed array using the integer I declared at the start of the function 
basically I used the i from the for and the integer from the begining as indeces .
I increased the value of the integer by one 
finally after the loop is finished 
I would return the new array
## Solution
[1,2,3,4] inputed
array1=[1,2,3,4]
array2=[0,0,0,0]
j=0
--------------------
first iteration i=3
array1=[1,2,3,4]
array2[3]=array[0]
array2=[0,0,0,4]
j=1
---------------------
second iteration i=2
array2[2]=array[1]
array2=[0,0,3,4]
j=2
-------------------------
third iteration i=1
array2[1]=array[2]
array2=[0,2,3,4]
j=3
-------------------------
fourth iteration i=0
array2[0]=array[3]
array2=[1,2,3,4]
j=4//not important
---------------------
i less than zero 
exist loop
return array2





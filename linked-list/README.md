# Linked Lists
create an object class of Linked list along with three methods 
## Whiteboard Process
![white board](https://i.ibb.co/x5FjFBZ/Whiteboard-4.png)
![white board](https://i.ibb.co/r5Hy21F/Whiteboard-5.png)

## Approach & Efficiency
create a new Linked list
LinkedList <Datatype> name = new LinkedList<>();
then call the name of the method using a dot after the name of the LinkedList
name.methodname
//call my name evanescence
### insert

time complexity , linear in relation to the length of Linked list , due to it having to locate the last element of the linked list 
space complexity , contant since it oly needs to store the data needed to be placed at last element
### includes

time complexity , linear in relation to the length of Linked list , due to it having to locate the element needed to be found but less than insert , since the moment we find that element we break 
space complexity , contant since it oly needs to store the data which we need to compare
### toString

time complexity , linear in relation to the length of Linked list , due to it having to reach the last element by looping through the array list
 space complexity , linear since the longer the linked list the bigger the size of the string returned the more space it would need obvously

## Solution
### insert
we begin by creating a new linked list
then using the name of that linked list we call the method insert(data)
name.insert(data)
note that the data has to be the same type as the linked list
1.the method will create a new node adding the data into it 
2. will check if the data in head is equal to null , if it's set head to newnode
3. if not it will loop through the data until it reachs null and set it to new node
and that's it
### includes
we begin by creating a new linked list
then using the name of that linked list we call the method 
includes(data)
name.include data
note that data has to be the same type as the Linked list 
1. the method will create a new node and set it to head 
2. will check if the value stored in head is equal to data if it's equal it will return true 
3. if not equal , will move to next node to check via a loop 
4. if the value is not found in linked list it will return false
and that's it
### toString 
we begin by creating a new linked list
then using the name of that linked list we call the method 
toString()
name.tostring
1. the method will create a new empty string 
2. loop throgh the array and add the element of the linked list to the empty string untill it reachs null
3. on each loop {current.value}-> is add to the string
4. after the loop finishes return string +NULL
![solution](https://i.ibb.co/Kj5d3bs/ground-zero-1.png)

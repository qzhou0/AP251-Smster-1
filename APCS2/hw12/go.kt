Qian ZHou
APCS2 pd01
HW12 -- +3R|\/|1|\|4|_  1|_|_|\|3$$
2018-03-01

Q0: What do you make of the multiple class definitions in a single .java file?
It stops the need to switch between files while writing code, but makes the code longer to navigate. I suppose Boardasurus would not be runnable in the terminal.
Q1: How are the command line arguments processed?
boardSize, timeDelay
Q2: What happens if no command line arguments are given?
It uses default value boardSize=8 and timeDelay = 500 miliseconds
Q3: What is the nature/purpose of the recursion? Is it necessary for the animation?
The nature of the recursion is to allow the board to update every 500, update the value put down, and allow it to run for itself until the end.
I think maybe a for loop or while loop might also work?
Q4: What do you expect to see when you run it?
a board with n+4 * n+4 with a 2 width side line on four corners, random values in the n+2*n+2 middle board updating as board reprints itself
Q5: What does ANSI stand for? (You are permitted some intertubes searching here…). What is it good for?
ANSI stands for American National Standards Institute. It is good for representing things in simple code.

Q6: How did your expectations compare to your observations?
The observations were more real than expectations. I expected to see the invalid values of the main method, but the board was cleared before I could see them.I did not have a clear idea of what to expect before, as the -1s and three spaces from the ANSI "%3d".I also did not expect the square to update itself without printing new ones all the way down.There is a large space before the board prints if you input value, but is replaced by the invalid statements otherwise.
Q7: How might you adapt this framework to animate a probing for a Knight’s Tour?
I can change the "go" method to make the update using the algorithm instead of randomly.I would need to change the limit to 64 from 65, or to 63 if starting from zero, unless it is a closed ended tour.

Knight Tour Algo:
1. Counter = 0
2. counter ++, Start from input square, mark it occupied by valuing it as counter, counter
3. generate a list of all possible next-moves
4. if list.length <1 && counter < 64
    earase current square by setting value to 0
    return false
5. if counter >=64, return true;
5. for each element in the list, 
    return (start from 2 with current element as input square, counter as counter) 
       
        
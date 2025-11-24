CIS2360 Week 8 Practical 1&2
PHP Parts 1 and 2
In this week and the next, practical content includes a variety of exercises to help you get familiarised
with PHP. Choose any of these and ask for help if you’re stuck.
1. Figure out what this program prints then create a PHP page with the code and run it to see if it
prints what you expected.
$age = 12;
$shoe_size = 13;
if ($age > $shoe_size)
{
print "Message 1.";
}
elseif (($shoe_size++) && ($age > 20))
{
print "Message 2.";
}
else
{
print "Message 3.";
}
print "Age: $age. Shoe Size: $shoe_size";
2. Write a PHP page to output the sequence "1 2 4 8 16 .... 1024" all on one line, using a for loop. (You
can use print(i); to output the value of the variable i). Note that a variable in PHP is prefixed with a
$ sign.
3. Write a PHP page to output the sequence "1 2 4 8 16 .... 1024" on separate lines, using a for loop.
(Hint, you can output html from within PHP using (for example) print("<br>");)
4. Write a PHP page to output the following table using a for loop.
1
2
4
8
16
32
64
128
256
512
1024

5. Write a PHP page to output the following table using nested for loops.
1 2 3 4 5
2 4 6 8 10
3 6 9 12 15
4 8 12 16 20
5 10 15 20 25
6. Change the above to be a 20 by 20 table.
7. Rewrite the 5 by 5 table above to print consecutive numbers.
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
8. Use a while loop to print out a table of Fahrenheit and Celsius temperature equivalents from -50
degrees F to 50 degrees F in 5-degree increments. On the Fahrenheit temperature scale, water
freezes at 32 degrees and boils at 212 degrees. On the Celsius scale, water freezes at 0 degrees and
boils at 100 degrees. So, to convert from Fahrenheit to Celsius, you subtract 32 from the
temperature, multiply by 5, and divide by 9. To convert from Celsius to Fahrenheit, you multiply by
9, divide by 5, and then add 32.
9. Modify your answer to the above question to use for( ) instead of while( ).
10. Write a script that creates a variable and assigns an integer value to it, then adds 1 to the variable’s
value three times, using a different operator each time. Display the final result to the user.
11. Write a script that creates two variables and assigns a different integer value to each variable. Now
make your script test whether the first value is
a. equal to the second value
b. greater than the second value
c. less than or equal to the second value
d. not equal to the second value
Output the result of each test to the user.
12. Write a script that counts from 1 to 10 in steps of 1. For each number, display whether that number
is an odd or even number, and also display a message if the number is a prime number. Display this
information within an HTML table
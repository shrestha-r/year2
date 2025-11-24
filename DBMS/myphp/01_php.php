<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>This is php programs </title>
    <style>
        td{
            padding:  15px ;
        }
    </style>
</head>
<body>
    <section>
        <h1>Question1 </h1>
        
        <p>$age = 12;
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
    print "Age: $age. Shoe Size: $shoe_size";</p>
    
    <h2>Answer </h2>
    <p>
        <?php 
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
        ?>
    </p>
</section>
<section id="question2">
<h2>Questsion 2 "1 2 4 8 16 .... 1024"</h2>
<?php

    for ($i =1;$i<=1024;$i=$i*2){
        echo "$i--->";
    }
    echo "null";
?>
</section>


<section id="question3">
    <h2>Question 2 </h2>
    <p>"1 2 4 8 16 .... 1024"</p>

    <?php
for ($i =1;$i<=1024;$i=$i*2){
        echo "$i <br> ";
    }
    ?>
</section>


<section id="questikon5">
    <h1>Question 5</h1>
    <p>1 2 3 4 5
2 4 6 8 10
3 6 9 12 15
4 8 12 16 20
5 10 15 20 25</p>

    <table border="5px" >
            <?php 
for($i = 1;$i<=5;$i++){
    echo"<tr>";
    for($j=1;$j<=5;$j++){
        echo"<td>";
        echo $j*$i;
        echo "</td>";
    }
    echo"<tr>";
}
?>
    </table>
</section>

<section id="question6">
    <h2>Question 6</h2>
    
    <table border="5px" >
            <?php 
for($i = 1;$i<=20;$i++){
    echo"<tr>";
    for($j=1;$j<=20;$j++){
        echo"<td>";
        echo $j*$i;
        echo "</td>";
    }
    echo"<tr>";
}
?>
    </table>
</section>


<section id="question7">
    <h2>Question 12 </h2>
    <p>12. Write a script that counts from 1 to 10 in steps of 1. For each number, display whether that number
is an odd or even number, and also display a message if the number is a prime number. Display this
information within an HTML table</p>

<table>




<?php 
    function isPrime(){
        if()
    }
for($i=1;$i<=10;$i++){
    echo $i;
}
?>
</table>
</section>
</body>
</html>
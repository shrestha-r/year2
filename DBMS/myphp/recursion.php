<?php 

    function factorial($n){
        if($n <=1 ){
            return 1;
        }

        return $n*factorial($n);
    }

    for($i=5;$i<=1;$i--){
     echo (factorial(5));
    }

    

?>  
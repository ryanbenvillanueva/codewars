<?php
function summation($n) 
{
  $sum = 0;
  for ($i = 1; $i <= $n; $i++) {
    $sum += $i;
  }
  
  return $sum;
}

echo summation(7);
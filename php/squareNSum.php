<?php
function square_sum($numbers): int
{
    $sum = 0;

    for ($i = 0; $i < count($numbers); $i++) {
        $sum += $numbers[$i] * $numbers[$i];
    }

    return $sum;
}

echo square_sum([1, 5]);

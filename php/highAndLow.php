<?php
function highAndLow($numbers)
{
    $arrayOfNumbers = explode(' ', $numbers);
    $lowest = min($arrayOfNumbers);
    $highest = max($arrayOfNumbers);

    return $highest . ' ' . $lowest;
}

echo highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");

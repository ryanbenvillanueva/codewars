<?php
function divisors($n)
{
    $count = 0;

    for ($i = 1; $i <= $n; $i++) {
        if ($n % $i == 0) {
            $count++;
        }

    }

    return $count;
}

echo divisors(24);

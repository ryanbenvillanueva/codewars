<?php
function pre_fizz($n)
{
    $arr = [];
    for ($i = 1; $i <= $n; $i++) {
        $arr[$i - 1] = $i;
    }

    return $arr;
}
print_r(pre_fizz(10));

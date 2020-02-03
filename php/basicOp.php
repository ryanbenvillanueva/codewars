<?php
function basicOp($op, $val1, $val2)
{
    switch ($op) {
        case '+':
            return $val1 + $val2;
        case '-':
            return $val1 - $val2;
        case '*':
            return $val1 * $val2;
        case '/':
            return $val1 / $val2;
    }
}

echo (basicOp('+', 4, 7));
echo (basicOp('-', 15, 18));
echo (basicOp('*', 5, 5));
echo (basicOp('/', 49, 7));

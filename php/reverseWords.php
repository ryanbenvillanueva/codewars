<?php
function reverseWords($str)
{
    $arr = explode(" ", $str);

    for ($i = 0; $i < count($arr); $i++) {
        $arr[$i] = strrev($arr[$i]);
    }

    return implode(" ", $arr);
}

echo reverseWords("Double  spaced");

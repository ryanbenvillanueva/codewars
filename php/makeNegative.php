<?php
function makeNegative($num) {
    if ($num * -1 > 0) {
     return $num;
    } else {
      return -1 * $num;
    }
}
echo makeNegative(3);
?>
<?php
function boolToWord($bool)
{
  return $bool ? 'Yes' : 'No';
}    

echo (boolToWord(true));
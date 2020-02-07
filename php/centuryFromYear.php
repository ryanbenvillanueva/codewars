<?php
function centuryFromYear($year)
{
  return $year % 100 == 0 ? $year / 100 : (int) ($year / 100) + 1;
}

echo centuryFromYear(1705);
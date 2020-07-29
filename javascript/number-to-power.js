function numberToPower(number, power) {
  let result = 1;

  while (power > 0) {
    result *= number;
    power--;
  }

  return result;
}
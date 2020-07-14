function halvingSum(n) {
  let sum = 0;

  while (n > 0) {
    sum += Math.trunc(n);
    n /= 2;
  }

  return sum;
}
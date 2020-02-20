function isDivisible(n, x, y) {
  return n % x == 0 && n % y == 0;
}

console.log(isDivisible(24, 2, 4));
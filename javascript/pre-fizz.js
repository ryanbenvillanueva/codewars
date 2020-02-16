function preFizz(n) {
  let integers = [];

  for (let i = 1; i <= n; i++) {
    integers[i - 1] = i;
  }

  return integers;
}

console.log(preFizz(10));
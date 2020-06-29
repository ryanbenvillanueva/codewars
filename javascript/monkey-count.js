function monkeyCount(n) {
  let monkeys = [];
  let i = 1;

  while (i <= n) {
    monkeys.push(i);
    i++;
  }

  return monkeys;
}
function repeats(arr) {
  const map = {};
  let sum = 0;
  for (const num of arr) {
    if (map[num]) {
      map[num]++;
    } else {
      map[num] = 1;
    }
  }

  for (const prop in map) {
    if (map[prop] === 1) {
      sum += parseInt(prop);
    }
  }

  return sum;
}
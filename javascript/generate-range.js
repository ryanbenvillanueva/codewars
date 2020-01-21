function generateRange(min, max, step) {
  const range = [];

  for (let i = min; i <= max; i += step) {
    range.push(i);
  }

  return range;
}

console.log(generateRange(2, 10, 2));

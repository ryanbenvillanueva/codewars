function mirror(data) {
  const arr = [].concat(data).sort((a, b) => a - b);
  arr.pop();
  return arr.concat([].concat(data).sort((a, b) => b - a));
}
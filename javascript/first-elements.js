function first(arr, n) {
  if (n === 0) return [];
  if (n === undefined) return arr.slice(0, 1);

  return arr.slice(0, n);
}
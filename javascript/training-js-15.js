
function howManySmaller(arr, n) {
  return arr.map(a => a.toFixed(2)).filter(x => x < n).length;
}

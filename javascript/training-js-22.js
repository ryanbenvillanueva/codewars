const shuffleIt = (arr, ...swaps) => {
  for ([a, b] of swaps) {
    [arr[a], arr[b]] = [arr[b], arr[a]];
  }

  return arr;
}

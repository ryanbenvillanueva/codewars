function removeSmallest(numbers) {
  const min = Math.min(...numbers);
  const arr = [...numbers];
  arr.splice(arr.indexOf(min), 1);
  return arr;
}
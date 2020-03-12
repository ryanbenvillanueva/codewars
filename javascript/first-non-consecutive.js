function firstNonConsecutive (arr) {
  let first = arr[0];
  
  for (let i = 1; i < arr.length; i++) {
    if (arr[i] != arr[i-1] + 1) {
      first = arr[i];
      break;
    }
  }
  
  if (first == arr[0]) {
    return null;
  }
  
  return first;
}

console.log(firstNonConsecutive([1, 2, 3, 4, 6, 7, 8]));
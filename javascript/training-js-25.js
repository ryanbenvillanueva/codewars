function sortIt(arr) {
  const newArr = arr.slice();
  const numCount = {};

  for (let i = 0; i < arr.length; i++) {
    if (numCount[arr[i]]) {
      numCount[arr[i]]++;
    } else {
      numCount[arr[i]] = 1;
    }
  }

  newArr.sort((a, b) => {
    if (numCount[a] > numCount[b]) {
      return 1;
    }
    if (numCount[a] == numCount[b]) {
      return b - a;
    }
    return -1;
  });
  
  return newArr;
}
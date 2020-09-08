function cutIt(arr) {
  let min = arr[0];
  let newArr = [];
  for (let str of arr) {
    if (str.length < min.length) {
      min = str;
    }
  }

  for (let str of arr) {
    newArr.push(str.slice(0, min.length));
  }

  return newArr;
}
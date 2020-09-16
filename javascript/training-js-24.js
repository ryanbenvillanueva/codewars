function threeInOne(arr) {
  const newArr = arr.slice();
  const sumArr = [];
  while (newArr.length > 0) {
    sumArr.push(newArr.splice(0, 3).reduce((a, b) => a + b));
  }

  return sumArr;
}
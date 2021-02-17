function summy(stringOfInts) {
  let arr = stringOfInts.split(" ");
  return arr.reduce((cur, val) => parseInt(cur) + parseInt(val), 0);
}

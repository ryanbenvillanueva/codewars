function arr2bin(arr) {
  return arr.includes(NaN) ? 'NaN' : arr.filter(a => Number.isInteger(a) && !isNaN(a)).reduce((sum, val) => sum + val, 0).toString(2);
}
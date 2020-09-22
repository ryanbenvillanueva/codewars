function tailAndHead(arr) {
  const result = [];

  for (let i = 0; i < arr.length - 1; i++) {
    result[i] = Number(arr[i].toString()[arr[i].toString().length - 1])
      + Number(arr[i + 1].toString()[0]);
  }

  return result.reduce((a, b) => a * b);
}

function mirrorImage(arr) {
  let a = 0, b = 0;

  const result = arr.some((x, i) => {
    a = arr[i];
    b = arr[i + 1];
    return x === Number(String(b).split('').reverse().join(''));
  });

  return result ? [a, b] : [-1, -1];
}
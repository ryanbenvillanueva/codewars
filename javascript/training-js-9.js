function padIt(str, n) {
  let i = 1;
  let even = '';
  let odd = '';
  while (i <= n) {
    if (i % 2 === 0) {
      even += '*';
    } else {
      odd += '*';
    }
    i++;
  }
  return odd + str + even;
}
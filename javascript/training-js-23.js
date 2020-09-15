function infiniteLoop(arr, d, n) {
  if (d === 'left') {
    while (n > 0) {
      let el = arr[0].shift();
      arr[0].push(arr[1][0]);
      arr[1].shift();
      arr[1].push(arr[2][0]);
      arr[2].shift();
      arr[2].push(el);
      n--;
    }
  } else {
    while (n > 0) {
      let el = arr[2].pop();
      arr[2].unshift(arr[1][arr[1].length - 1]);
      arr[1].pop();
      arr[1].unshift(arr[0][arr[0].length - 1]);
      arr[0].pop();
      arr[0].unshift(el);
      n--;
    }
  }

  return arr;
}
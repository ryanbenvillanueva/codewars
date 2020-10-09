function pairs(ar) {
  const a = [], b = [];
  let count = 0;
  if (ar.length <= 1) {
    return 0;
  } else {
    for (let i = 0; i < ar.length; i++) {
      if (i % 2 === 0) {
        a.push(ar[i]);
      } else {
        b.push(ar[i]);
      }
    }

    for (let i = 0; i < a.length; i++) {
      if (Math.abs(a[i] - b[i]) === 1) {
        count++;
      }
    }

    return count;
  }
};
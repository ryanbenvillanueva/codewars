function duplicateSandwich(a) {
  for (let i = 0; i < a.length; i++) {
    let j = a.lastIndexOf(a[i]);
    if (j !== i) {
      return a.slice(i + 1, j);
    }
  }

  return [];
}
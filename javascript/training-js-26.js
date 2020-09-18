function isolateIt(arr) {
  return arr.map(x => {
    if (x.length % 2 === 0) {
      x = x.split('');
      x.splice(x.length / 2, 0, '|');
      return x.join('');
    } else {
      x = x.split('');
      x.splice(x.length / 2, 1, '|');
      return x.join('');
    }
  });
}
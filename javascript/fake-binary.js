function fakeBin(x) {
  return x.split('').map(digit => digit < 5 ? 0 : 1).join('');
}
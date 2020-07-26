function addLength(str) {
  return str.split(' ').map(s => s.concat(' ' + s.length));
}
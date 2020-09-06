function colorOf(r, g, b) {
  let rHex, gHex, bHex = '';

  r < 16 ? rHex = '0' + r.toString(16) : rHex = r.toString(16);
  g < 16 ? gHex = '0' + g.toString(16) : gHex = g.toString(16);
  b < 16 ? bHex = '0' + b.toString(16) : bHex = b.toString(16);

  return '#' + rHex + gHex + bHex;
}
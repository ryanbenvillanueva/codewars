// return masked string
function maskify(cc) {
  return cc.split('').map((letter, index) => index < cc.length - 4 ? '#' : letter).join('');
}
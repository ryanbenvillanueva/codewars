function solve(str) {
  let reversed = '';

  for (let i = str.length - 1; i >= 0; i--) {
    if (str[i] !== ' ') {
      reversed += str[i];
    }

    if (str[reversed.length] === ' ') {
      reversed += str[reversed.length];
    }
  }

  return reversed;
}
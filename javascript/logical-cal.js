function logicalCalc(array, op) {
  switch (op) {
    case "AND": return array.includes(false) ? false : true;
    case "OR": return array.includes(true);
    case "XOR": return array.reduce((a, b) => a !== b)
  }
}
function oddOrEven(array) {
  return array.reduce((acc, val) => acc + val, 0) % 2 === 0 ? "even" : "odd";
}
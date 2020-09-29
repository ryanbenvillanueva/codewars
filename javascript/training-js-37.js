function countAnimals(animals, count) {
  const arr = [];
  for (let a of count) {
    arr.push(animals.split(a).length - 1);
  }
  return arr;
}
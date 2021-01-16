function findDifference(a, b) {
  return Math.abs(
    a.reduce(function (acc, cur) {
      return acc * cur;
    }) -
      b.reduce(function (acc, cur) {
        return acc * cur;
      })
  );
}

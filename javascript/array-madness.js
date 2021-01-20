function arrayMadness(a, b) {
  return (
    a.reduce((sum, el) => sum + el ** 2, 0) >
    b.reduce((sum, el) => sum + el ** 3, 0)
  );
}

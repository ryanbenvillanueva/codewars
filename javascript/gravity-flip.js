const flip = (d, a) => {
  return d === "L" ? a.sort((x, y) => y - x) : a.sort((x, y) => x - y);
};

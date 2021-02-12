const maxRedigit = function (num) {
  if (num.toString().length !== 3) return null;

  let digits = num
    .toString()
    .split("")
    .sort((a, b) => b - a)
    .join("");

  return parseInt(digits);
};

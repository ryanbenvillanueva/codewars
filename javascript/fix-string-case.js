function solve(s) {
  let isUpper = 0;
  let isLower = 0;

  for (let i = 0; i < s.length; i++) {
    if (s.charAt(i) === s.charAt(i).toUpperCase()) {
      isUpper++;
    } else {
      isLower++;
    }
  }

  if (isUpper > isLower) {
    return s.toUpperCase();
  } else {
    return s.toLowerCase();
  }
}
function alternateCase(s) {
  let str = '';
  for (let i = 0; i < s.length; i++) {
    if (s.charAt(i) === s.charAt(i).toUpperCase()) {
      str += s.charAt(i).toLowerCase();
    } else {
      str += s.charAt(i).toUpperCase();
    }
  }
  return str;
}
function sumStr(a, b) {
  if (a === "" && b == "") {
    return "0";
  }

  if (a === "") {
    return b;
  }

  if (b === "") {
    return a;
  }

  return parseInt(a) + parseInt(b) + "";
}

function trueOrFalse(val) {
  if (val === false || val === 0 || val === -0 ||
    val === null || val === undefined || val === NaN || val === "") return 'false';
  else return 'true';
}
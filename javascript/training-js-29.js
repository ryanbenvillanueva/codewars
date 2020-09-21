function bigToSmall(arr) {
  const result = [];

  return result.concat(...arr).sort((a, b) => b - a).join('>');
}
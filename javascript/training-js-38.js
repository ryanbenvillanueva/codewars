function findSimilarity(str, word) {
  const arr = str.split(" ");

  return arr.filter(x => x.length === word.length &&
    x.charAt(0) === word.charAt(0) &&
    x.charAt(x.length - 1) === word.charAt(word.length - 1)).join(" ");
}
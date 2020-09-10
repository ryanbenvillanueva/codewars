function alienLanguage(str) {
  const words = str.toUpperCase().split(' ');

  for (let i = 0; i < words.length; i++) {
    words[i] = words[i].slice(0, words[i].length - 1) + words[i][words[i].length - 1].toLowerCase();
  }
  return words.join(' ');

}
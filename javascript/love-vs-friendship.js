function wordsToMarks(string) {
  return string.split("").reduce((acc, char) => {
    return acc + char.charCodeAt() - 96;
  }, 0);
}

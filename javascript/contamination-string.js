function contamination(text, char) {
  return text.length === 0 || text === 1 ? "" : char.repeat(text.length);
}

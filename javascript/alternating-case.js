String.prototype.toAlternatingCase = function () {
  return this.split('').map(changeCase).join('');
}

function changeCase(char) {
  return char.toLowerCase() === char ? char.toUpperCase() : char.toLowerCase();
}

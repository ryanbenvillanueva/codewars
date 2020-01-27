function removeChar(str) {
  const strArray = str.split('');
  let newStr = '';

  for (let i = 1; i < str.length - 1; i++) {
    newStr += strArray[i];
  }

  return newStr;
}

console.log(removeChar('slices'));

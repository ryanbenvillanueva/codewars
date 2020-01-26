function accum(s) {
  const strArr = s.split('');
  let result = [];

  for (let i = 0; i < strArr.length; i++) {
    result.push(
      strArr[i].toUpperCase() + Array(i + 1).join(strArr[i].toLowerCase())
    );
  }

  return result.join('-');
}

console.log(accum('abcd'));

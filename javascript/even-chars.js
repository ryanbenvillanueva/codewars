function evenChars(string) {
  if (string.length < 2 || string.length > 100) return "invalid string"
  const arr = string.split('');
  let even = [];
  for (let i = 0; i < arr.length; i++) {
    if (i % 2 === 1) even.push(arr[i]);
  }

  return even;
}
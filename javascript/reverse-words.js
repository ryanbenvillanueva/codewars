function reverseWords(str) {
  let words = str.split(' ');
  
  if (words.length === 0) {
    return str;
  }
  
  for (let i = 0; i < words.length; i++) {
    let reverse = '';
    
    for (let j = words[i].length - 1; j >= 0; j--) {
       reverse += words[i].charAt(j);
    }
    
    words[i] = reverse;
  }
  
  return words.join(' ');
}

console.log(reverseWords('double  spaced  words!'))
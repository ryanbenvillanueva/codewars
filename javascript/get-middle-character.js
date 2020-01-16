function getMiddle(s) {
    const word = s.split('');
    if (s.length <= 2) {
      return s;
    } else if (s.length % 2 === 0) {
        return word[s.length/2 - 1] + word[s.length/2]; 
      } else {
          return word[((s.length + 1) / 2) - 1];
        }    
  }
  console.log(getMiddle('testing'));
const mispelled = function(word1, word2) {
  let differCount = 0,
        longerLength = Math.max(word1.length, word2.length);
  for(var i = 0; i < longerLength; i++) {
    if(word1.indexOf(word2[i]) === -1) {
      differCount++;
    }
  }
  return differCount <= 1;
}

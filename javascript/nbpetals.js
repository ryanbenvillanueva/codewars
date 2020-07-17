function howMuchILoveYou(nbPetals) {
  const phrases = ["I love you", "a little", "a lot", "passionately", "madly", "not at all"];

  switch (nbPetals % phrases.length) {
    case 0: return phrases[5];
    case 1: return phrases[0];
    case 2: return phrases[1];
    case 3: return phrases[2];
    case 4: return phrases[3];
    case 5: return phrases[4];
    default: return undefined;
  }
}
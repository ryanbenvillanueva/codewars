function rndCode() {
  const symbols = ['~', '!', '@', '#', '$', '%', '^', '&', '*'];

  return (String.fromCharCode(~~((77 - 65) * Math.random() + 65)) +
    String.fromCharCode(~~((77 - 65) * Math.random() + 65)) +
    String.fromCharCode(~~((57 - 48) * Math.random() + 48)) +
    String.fromCharCode(~~((57 - 48) * Math.random() + 48)) +
    String.fromCharCode(~~((57 - 48) * Math.random() + 48)) +
    String.fromCharCode(~~((57 - 48) * Math.random() + 48)) +
    symbols[~~(symbols.length * Math.random())] +
    symbols[~~(symbols.length * Math.random())]
  );

}
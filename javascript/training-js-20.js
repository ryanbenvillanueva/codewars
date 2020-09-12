function topSecret(str){
  const chars = str.split("");
  
  for (let i = 0; i < chars.length; i++) {
    if (chars[i].charCodeAt() > 67 && chars[i].charCodeAt() < 91 ||
        chars[i].charCodeAt() > 99 && chars[i].charCodeAt() < 123) {
      chars[i] = String.fromCharCode(chars[i].charCodeAt() - 3);
      continue;
    }
    
    if (chars[i].charCodeAt() > 64 && chars[i].charCodeAt() < 68 ||
        chars[i].charCodeAt() > 96 && chars[i].charCodeAt() < 100) {
      chars[i] = String.fromCharCode(chars[i].charCodeAt() + 23);
    }
  }
  
  return chars.join("");
}
//question1: The top secret file number is...
answer1="2768";
//question2: Super agent's name is...
answer2="Pwkz";
//question3: He stole the treasure is...
answer3="John's wife";
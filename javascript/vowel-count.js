function getCount(str) {
    let vowelsCount = 0;

    for (let i = 0; i < str.length; i++) {
        if (str.charAt(i) === 'a' || str.charAt(i) === 'e' || str.charAt(i) === 'i' || str.charAt(i) === 'o' || str.charAt(i) === 'u') {
            vowelsCount++;
        }
    }

    return vowelsCount;
}

console.log(getCount('The quick brown fox jumps over all the lazy dogs'));
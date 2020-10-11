function dontGiveMeFive(start, end) {
  const arr = [];
  
  for (let i = start; i <= end; i++) {
    arr.push(i.toString());
  }
  
  return arr.filter(x => !x.includes('5')).length;
}
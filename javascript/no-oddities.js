function noOdds( values ){
  noOddsArr = [];
  
  for (let i = 0; i < values.length; i++) {
      if (values[i] % 2 === 0) {
        noOddsArr.push(values[i]);
      }
  }

  return noOddsArr;
}
 
let arr = [1, 2, 3, 4, 5,];
console.log(noOdds(arr));
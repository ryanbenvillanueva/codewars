function XO(str) {  
    let xCount = 0;
    let oCount = 0;
    
    for (let i = 0; i < str.length; i++) {
      if (str.charAt(i) === 'x' || str.charAt(i) === 'X') {
        xCount++;
      }
      
      if(str.charAt(i) ==='o' || str.charAt(i) === 'O') {
        oCount++;
      }
    }
    return xCount === oCount;
  }

  console.log(XO('xxxoooxxxooo'));
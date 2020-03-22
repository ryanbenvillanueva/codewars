function modifiedSum(a, n) {

  let nthPowerSum = 0;
  let arraySum = 0;
  
  for (let i = 0; i < a.length; i++) {
    nthPowerSum += a[i] ** n;
    arraySum += a[i];
  }
  
  return nthPowerSum - arraySum;
}

console.log(modifiedSum([1,2,3,4,5], 3));
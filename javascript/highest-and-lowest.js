function highAndLow(numbers) {
  const arrayOfNumbers = numbers.split(' ');
  const lowest = Math.min(...arrayOfNumbers);
  const highest = Math.max(...arrayOfNumbers);

  return `${highest} ${lowest}`;
}

console.log(highAndLow('1 2 3 4 5 6 7 8 9'));
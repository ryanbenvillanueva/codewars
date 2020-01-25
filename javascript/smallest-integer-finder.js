class SmallestIntegerFinder {
  findSmallestInt(args) {
    let smallest = args[0];

    for (let i = 1; i < args.length; i++) {
      if (args[i] < smallest) {
        smallest = args[i];
      }
    }

    return smallest;
  }
}

const finder = new SmallestIntegerFinder();
const array = [1, 3, 5, 7, 9];
console.log(finder.findSmallestInt(array));

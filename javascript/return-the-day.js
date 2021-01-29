function whatday(num) {
  if (num < 1 || num > 7) {
    return "Wrong, please enter a number between 1 and 7";
  }

  switch (num) {
    case 1:
      return "Sunday";
    case 2:
      return "Monday";
    case 3:
      return "Tuesday";
    case 4:
      return "Wednesday";
    case 5:
      return "Thursday";
    case 6:
      return "Friday";
    case 7:
      return "Saturday";
  }
}

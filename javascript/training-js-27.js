function countGrade(scores) {
  const gradesCount = { 'S': 0, 'A': 0, 'B': 0, 'C': 0, 'D': 0, 'X': 0 };
  scores.filter(x => {
    if (x === 100) {
      gradesCount['S']++;
    } else if (x >= 90) {
      gradesCount['A']++;
    } else if (x >= 80) {
      gradesCount['B']++;
    } else if (x >= 60) {
      gradesCount['C']++;
    } else if (x >= 0) {
      gradesCount['D']++;
    } else if (x === -1) {
      gradesCount['X']++;
    }
  });
  return gradesCount;
}
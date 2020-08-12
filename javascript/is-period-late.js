function periodIsLate(last, today, cycleLength) {
  return ((today - last) / (24 * 60 * 60 * 1000)) > cycleLength;
}
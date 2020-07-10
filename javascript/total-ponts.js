function points(games) {
  return games.reduce((total, game) => {
    const [x, y] = game.split(':').map(Number);

    if (x > y) {
      total += 3;
    } else if (x === y) {
      total += 1;
    }

    return total;
  }, 0);
}

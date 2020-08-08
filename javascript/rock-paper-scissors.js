const rps = (p1, p2) => {
  const getMsg = (n) => `Player ${n} won!`;

  if (p1 === 'rock' && p2 === 'scissors' ||
    p1 === 'scissors' && p2 === 'paper' ||
    p1 === 'paper' && p2 === 'rock') return getMsg(1);
  else if (p2 === 'rock' && p1 === 'scissors' ||
    p2 === 'scissors' && p1 === 'paper' ||
    p2 === 'paper' && p1 === 'rock') return getMsg(2);
  else return 'Draw!';
};
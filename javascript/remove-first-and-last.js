const array = arr => {
  let seq = arr.split(',');
  if (seq.length < 3)
    return null;
  else {
    seq.pop();
    seq.shift();
  }

  return seq.join(' ');
};
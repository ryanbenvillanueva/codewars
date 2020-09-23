function roundIt(n) {
  const [a, b] = n.toString().split('.');
  return a.length < b.length ? Math.ceil(n) : a.length > b.length ? Math.floor(n) : Math.round(n);
}
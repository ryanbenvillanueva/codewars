function nextId(ids) {
  let nextId = 0;

  while (ids.includes(nextId)) {
    nextId++;
  }

  return nextId;
}
function hello(name) {
  if (name === undefined || name === '') {
    return "Hello, World!";
  } else {
    let newName = name.split('');
    for (let i = 0; i < name.length; i++) {
      if (i === 0) {
        newName[i] = newName[i].toUpperCase();
      } else {
        newName[i] = newName[i].toLowerCase();
      }
    }

    return "Hello, " + newName.join('') + "!";
  }
}
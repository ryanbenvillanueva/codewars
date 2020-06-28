function abbrevName(name) {
  const fullName = name.split(" ");
  return fullName[0].charAt(0).toUpperCase() + "." + fullName[1].charAt(0).toUpperCase();
}
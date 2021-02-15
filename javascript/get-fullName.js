class Dinglemouse {
  constructor(firstName, lastName) {
    this.firstName = firstName.concat(" ");
    this.lastName = lastName;
  }

  getFullName() {
    return this.firstName.concat(this.lastName).trim();
  }
}

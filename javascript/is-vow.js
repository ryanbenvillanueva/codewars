function isVow(a){
  for (let i = 0; i < a.length; i++) {
    switch (a[i]) {
        case 97: a[i] = String.fromCharCode(97);
          break;
        case 101: a[i] = String.fromCharCode(101);
          break;
        case 105: a[i] = String.fromCharCode(105);
          break;
        case 111: a[i] = String.fromCharCode(111);
          break;
        case 117: a[i] = String.fromCharCode(117);
          break;
    }
  }
  return a;
}
function charFreq(message) {
  return message.split("").reduce(function (acc, cur) {
    return (acc[cur] = (acc[cur] || 0) + 1) && acc;
  }, {});
}

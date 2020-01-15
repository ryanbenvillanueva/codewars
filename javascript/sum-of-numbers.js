function getSum(a, b) {
    let sum = 0;

    if (b < a) {
        const t = a;
        a = b;
        b = t;
    }

    for (let i = a; i <= b; i++) {
        sum += i;
    }

    return sum;
}

console.log(getSum(10, -5));
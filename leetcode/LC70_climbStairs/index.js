const climbStairs = n => {
  let fib_1 = 1;
  let fib_2 = 2;
  let fib_fin = 0;

  if (n <= 3) {
    return n;
  }

  for (let step = 3; step <= n; step++) {
    fib_fin = fib_1 + fib_2;
    fib_1 = fib_2;
    fib_2 = fib_fin;
  }

  return fib_fin;
};

module.exports = climbStairs;

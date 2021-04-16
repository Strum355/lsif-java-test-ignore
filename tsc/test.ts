interface I {
  foo(): void;
}

interface II {
  foo(): void;
}

class B implements I, II {
  foo(): void {
  }
}

/* let i: I;
i.foo();

let b: B;
b.foo(); */
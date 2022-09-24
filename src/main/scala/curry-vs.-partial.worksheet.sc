// currying vs. partially applied
// https://dzone.com/articles/difference-between-currying-amp-partially-applied

def sum(a: Int, b: Int): Int = a + b
//(Int, Int) => Int

def curriedsum = (sum).curried
//Int => (Int => Int)

def plus5c = curriedsum(5)
def plus5p = sum(5, _)

plus5c(12)
plus5p(12)
curriedsum(5)(5)
curriedsum(5)(6)

def isInRange(left: Int, right: Int, n: Int ): Boolean = 
    if (left < n && n < right) true else false

def isInRangeC = (isInRange).curried
def is0To12c = isInRangeC(0)(12)

def is0To12p = isInRange(0, 12, _)

is0To12c(13)
is0To12c(5)
is0To12p(13)

// add optional handling to all methods
def lift[A, B](f: A => B): Option[A] => Option[B] = _.map(f)

// example lift ------------------------------------------
def abs_lift: Option[Double] => Option[Double] = lift(math.abs)

math.abs(-4)
Some(-4)
abs_lift(Some(-44))
abs_lift(None)

// 4.3 map2 -------------------------------------

def map2[A, B, C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] =
    if (a.isDefined && b.isDefined) then Some(f(a.get, b.get)) else None

map2(Some(3),Some(4))(_ + _)    
map2(None,Some(4))(_ + _)    
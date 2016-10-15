def fib(n:Int):Int = n match
{
  case 0 => 0
  case 1 => 1
  case _ => fib(n-1) + fib(n-2)
}



def fib(n:Int, prev:Int = 0, next:Int = 1):Int = n match
{
  case 0 => prev
  case 1 => next
  case _ => fib(n-1, next, (next + prev))
}


def replaceNth[A](list:List[A], n:Int, obj:A):List[A]=
  if(list == Nil) throw new Exception("Index out of bound exception")
  else if(n==0) obj :: list.tail
  else list.head :: replaceNth(list.tail, n-1, obj)


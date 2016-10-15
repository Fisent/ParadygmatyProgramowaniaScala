def flatten[A](list:List[List[A]]):List[A]=
  if(list==Nil) Nil
  else list.head ++ flatten(list.tail)
  
def count[A](obj:A, list:List[A]):Int=
  if(list==Nil) 0
  else if(list.head == obj) 1 + count(obj, list.tail)
  else count(obj, list.tail)
  
def replicate[A](obj:A, count:Int):List[A]=
  if(count<=0) List()
  else obj :: replicate(obj, count-1)
        
  
def squareList(list:List[Int]):List[Int]=
  if(list == Nil) Nil
  else list.head*list.head :: squareList(list.tail)

def palindrome[A](list:List[A])=
  list == list.reverse
  
def listLength[A](list:List[A]):Int = 
  if(list == Nil) 0
  else 1 + listLength(list.tail)
  

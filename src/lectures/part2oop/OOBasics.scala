package lectures.part2oop

import java.time.LocalDate

object OOBasics extends App {

  val person = new Person("Phellipe", 23)
  println(person.age)
  person.greet("Fulan@")
  person.greet()

  val author = new Writer("Bob", "Lorren", 2000)
  println(author.fullName())

  val novel = new Novel("Avenida Brasil", 2008, author)
  println(novel.isWrittenBy(author))

  println(novel.isWrittenBy(author))
  println(novel.copy(1990).yarOfRelease)
  println(novel.authorAge)

  val counter = new Counter(10)
  println(counter.inc.count)
  println(counter.dec.count)
  println(counter.inc(2).count)
  println(counter.dec(2).count)
}

// constructor
class Person(val name: String, val age: Int = 0){
  //body
  val x = 2

  //method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  //overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple contructors
  def this(name: String) = this(name, 0)
  def this() = this("Bob Brown")

}
//class parameters are NOT FIELDS

/*
   Novel and a Writer

   Writer: first name, surname, year
     -method fullname (concatenate first name and surname)

   Novel: name, yar of release, author
     - authorAge
     - isWrittenBy(author)
     - copy(new yar of release
*/
class Writer(val name: String, val surname: String, val year: Int) {
  def fullName(): String = s"$name $surname"
}

class Novel(val name: String, val yarOfRelease: Int, val author: Writer) {

  def authorAge: Int = yarOfRelease - author.year
  def isWrittenBy(author: Writer): Boolean = author == this.author
  def copy(year: Int): Novel = new Novel(name, year, author)

}

/*

  Counter class
   - receives an int value
   - method current count
   - method to increment/decrement => new Counter
   - overload inc/dec to receive an amount

 */


class Counter(val count: Int = 0){

  def inc = new Counter(count + 1) //immutability
  def dec = new Counter(count - 1)

  def inc(n: Int): Counter = {
    if(n <= 0) this
    else inc.inc(n-1)
  }

  def dec(n: Int): Counter = {
    if(n <= 0) this
    else dec.dec(n-1)
  }

}



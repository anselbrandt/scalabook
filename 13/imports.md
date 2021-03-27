# imports

// easy access to all members of bobsdelights
  import bobsdelights._

import selector clause

import Fruits.{Apple, Orange}

This imports just members Apple and Orange from object Fruits.

import Fruits.{Apple => McIntosh, Orange}

This imports the two members Apple and Orange from object Fruits.

However, the Apple object is renamed to McIntosh, so this object can be accessed with either Fruits.Apple or McIntosh

import Fruits.{Apple => McIntosh, _}

This imports all members from object Fruits but renames Apple to McIntosh. import Fruits.{Pear => _, _}

This imports all members of Fruits except Pear

## Protected members

In Scala, a protected member is only accessible from subclasses of the class in which the member is defined.

 package p {
      class Super {
        protected def f() = { println("f") }
      }
      class Sub extends Super {
        f()
      }
      class Other {
        (new Super).f()  // error: f is not accessible
      }
}

## Scope of protection

Access modifiers in Scala can be augmented with qualifiers. A modifier of the form private[X] or protected[X] means that access is private or protected "up to" X, where X designates some enclosing package, class or singleton object.

```
package bobsrockets
    package navigation {
      private[bobsrockets] class Navigator {
        protected[navigation] def useStarChart() = {}
        class LegOfJourney {
          private[Navigator] val distance = 100
  
}
        private[this] var speed = 200
      }
    }
    package launch {
      import navigation._
      object Vehicle {
        private[launch] val guide = new Navigator
      }
}
```

```
no access modifier          public access

private[bobsrockets]        access within outer package

private[navigation]         same as package visibility in Java

private[Navigator]          same as private in Java

private[LegOfJourney]       same as private in Scala

private[this]               access only from same object
```

## Package objects

Each package is allowed to have one package object. Any definitions placed in a package object are considered members of the package itself.

```
// In file bobsdelights/package.scala
    package object bobsdelights {
      def showFruit(fruit: Fruit) = {
        import fruit._
        println(name + "s are " + color)
      }
}
    // In file PrintMenu.scala
    package printmenu
    import bobsdelights.Fruits
    import bobsdelights.showFruit
    object PrintMenu {
      def main(args: Array[String]) = {
        for (fruit <- Fruits.menu) {
          showFruit(fruit)
} }
}
```
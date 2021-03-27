# traits

encapsulates method and field definitions

can be mixed into classes

inherit with `extends`

mix in with `with`

`super.` calls the overidden method

If the behavior will not be reused, then make it a concrete class

If it might be reused in multiple, unrelated classes, make it a trait

If you want to inherit from it in Java code, use an abstract class

If you plan to distribute it in compiled form, and you expect outside groups to write classes inheriting from it, you might lean towards using an abstract class

If you still do not know, after considering the above, then start by making it as a trait

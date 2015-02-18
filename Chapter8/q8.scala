class Person(val name: String) {
  override def toString = getClass.getName +"[name="+name+"]"
}

class SecretAgent(codename:String) extends Person(codename) {
  override val name = "secret"
  override val toString = "secret"
}

//so we have a name field for each class 
// and a name function in each class
// they both get the name field
// but in secretAgent the name field is set to "secret" in the constructor
// so the code name is super.name but there is no getter visible

class Library {
    val name = String;
    val adress = String;
    val phone = String;
    val email = String;

    def getName(): String = {
        return this.name;
    }
    def getAddress(): String = {
        return this.address;
    }
    def getPhone(): String = {
        return this.phone;
    }

    def getEmail(): String = {
        return this.email;
    }
}

//Crud
case class library( name: String, adress: String, phone: String, email: String)
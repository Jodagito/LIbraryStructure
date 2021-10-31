class Editorial {
    val name = String;
    val adress = String;
    val country = String;
    def getName(): String = {
        return this.name;
    }
    def getAdress(): String = {
        return this.adress;
    }
    def getCountry(): String = {
        return this.country;
    }
}

case class Editorial (name: String, adress: String, country: String)
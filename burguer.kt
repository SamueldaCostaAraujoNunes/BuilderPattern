data class Burguer(
    val breed: String,
    val cheese: Pair<Int, String>,
    val beef: List<Pair<Int, String>>,
    val hasLettuce: Boolean,
    val hasTomato: Boolean,
    val hasOnion: Boolean,
    val hasPickles: Boolean,
    val hasKetchup: Boolean,
    val hasMustard: Boolean,
    val hasMayo: Boolean,
    val hasSpecialSauce: Boolean
)


fun main(){
    val whopper = Burguer("Branco com Gergelim", 1 to "Cheedar", listOf(1 to "Cupim"), true, true, true, false, true, false, true, false) 
    val cheeseburguerDuplo = Burguer("Branco com Gergelim", 2 to "Cheedar", listOf(2 to "Cupim"), true, true, true, true, true, false,false, true) 
    val rodeioDuplo = Burguer("Branco com Gergelim", 1 to "Cheedar", listOf(1 to "Frango Empanado", 2 to "Cupim"), true, false, true, true, false, false,false, true) 
    
    println(whopper)
    println(cheeseburguerDuplo)
    println(rodeioDuplo)
}
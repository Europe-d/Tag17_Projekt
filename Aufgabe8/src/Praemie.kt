

fun main() {
    val duration: Int = 28



    if(duration <= 12){
        println("Keine Prämie!")
    }else if(duration in 13..24){
        println("5€ Amazon Gutschein")
    }else if(duration in 25..36){
        println("15€ Amazon Gutschein")
    }else if(duration in 37..48){
        println("25€ Amazon Gutschein")
    }else if(duration >= 49){
        println("50€ Amazon Gutschein")
    }

}



//gutschein(0..12).lowercase() == "Keine Prämie".lowercase() &&
//gutschein1(12..24).lowercase() == "5€ Amazon-Gutschein".lowercase() &&
//gutschein2(24..36).lowercase() == "15€ Amazon Gutschein".lowercase() &&
//gutschein3(36..48).lowercase() == "25€ Amazon Gutschein".lowercase() &&
//gutschein4(48..100).lowercase() == "50€ Amazon Gutschein".lowercase() &&





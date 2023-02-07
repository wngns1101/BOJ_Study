import Foundation

func solution(_ age:Int) -> String {
    if age < 10{
        return convertNumToChar(age)
    }else if age < 100{
        var answer = ""
        answer += convertNumToChar(age / 10)
        answer += convertNumToChar(age % 10)
        return answer
    }else if age < 1000{
        var answer = ""
        answer += convertNumToChar(age / 100)
        answer += convertNumToChar((age / 10) % 10)
        answer += convertNumToChar((age % 100) % 10)
        return answer
    }else{
        var answer = ""
        answer += convertNumToChar(age / 1000)
        answer += convertNumToChar((age / 100) % 10)
        answer += convertNumToChar(((age % 1000) % 100) / 10)
        answer += convertNumToChar(((age % 1000) % 100) % 10)
        return answer
    }
}

func convertNumToChar(_ num: Int) -> String{
    if num == 0{
        return "a"
    } else if num == 1{
        return "b"
    } else if num == 2{
        return "c"
    } else if num == 3{
        return "d"
    } else if num == 4{
        return "e"
    } else if num == 5{
        return "f"
    } else if num == 6{
        return "g"
    } else if num == 7{
        return "h"
    } else if num == 8{
        return "i"
    } else {
        return "j"
    }
}
import Foundation

func solution(_ cipher:String, _ code:Int) -> String {
    var index = 1
    var answer = ""
    for i in cipher{
        if index == code{
            answer.append(i)
            index = 1
        }else{
            index += 1
        }
    }
    return answer
}
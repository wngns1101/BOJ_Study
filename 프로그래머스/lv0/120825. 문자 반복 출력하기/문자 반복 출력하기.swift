import Foundation

func solution(_ my_string:String, _ n:Int) -> String {
    var sentense = my_string.unicodeScalars.map(String.init)
    var answer = ""
    for i in sentense{
        for j in 1...n{
            answer += i
        }
    }
    return answer
}
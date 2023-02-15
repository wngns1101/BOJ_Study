import Foundation

func solution(_ s:String) -> Int {
    var sentense = s.split(separator: " ")
    var index = 0
    var answer = 0
    for i in sentense{
        if i == "Z"{
            index -= 1
            answer -= Int(sentense[index])!
            index += 2
        }else{
            answer += Int(i)!
            index += 1
        }
    }
    return answer
}
import Foundation

func solution(_ my_string:String) -> String {
    var answer = ""
    for i in my_string{
        if !answer.contains(String(i)){
            answer.append(String(i))
        }
    }
    return answer
}
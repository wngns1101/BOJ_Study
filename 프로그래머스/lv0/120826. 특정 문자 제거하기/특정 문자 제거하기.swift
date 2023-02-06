import Foundation

func solution(_ my_string:String, _ letter:String) -> String {
        var answer = ""
    for i in my_string{
        if String(i) == letter{
            continue
        }else{
            answer += String(i)
        }
    }
    return answer
}
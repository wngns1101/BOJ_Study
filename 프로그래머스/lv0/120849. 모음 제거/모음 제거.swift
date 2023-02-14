import Foundation

func solution(_ my_string:String) -> String {
    var answer = ""
    let vowel = ["a", "e", "i", "o", "u"]
    for i in my_string{
        if vowel.contains(String(i)){
            continue
        }else{
            answer += String(i)
        }
    }
    
    return answer
}
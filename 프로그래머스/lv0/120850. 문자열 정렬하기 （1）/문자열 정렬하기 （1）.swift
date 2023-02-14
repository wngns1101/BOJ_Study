import Foundation

func solution(_ my_string:String) -> [Int] {
    let alpabet = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","u","z"]
    var answer : [Int] = []
    for i in my_string{
        if alpabet.contains(String(i)){
            continue
        }else{
            if let number = Int(String(i)) {
                answer.append(number)
            }
        }
    }
    answer.sort()
    return answer
}
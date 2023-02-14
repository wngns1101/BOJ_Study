import Foundation

func solution(_ my_string:String) -> Int {
        
    var num = my_string.filter {$0.isNumber}.map {Int(String($0))!}
    var answer = 0
    
    for i in num {
        answer += i
    }
    
    return answer

}
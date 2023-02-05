import Foundation

func solution(_ my_string:String) -> String {
    let answer = my_string.split(separator: "")
    var sentense : String = ""
    for i in 1...answer.count{
        sentense += answer[answer.count - i]
    }
    return sentense
}
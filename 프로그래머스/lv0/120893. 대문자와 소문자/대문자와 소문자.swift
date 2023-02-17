import Foundation

func solution(_ my_string:String) -> String {
    var answer = ""
    for c in my_string{
        var up = c.uppercased()
        var low = c.lowercased()
        String(c) == up ? answer.append(low) : answer.append(up)
    }
    return answer
}
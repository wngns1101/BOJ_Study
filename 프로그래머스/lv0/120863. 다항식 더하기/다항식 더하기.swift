import Foundation

func solution(_ polynomial:String) -> String {
    var index = 0
    var value = 0
    var sentense = polynomial.components(separatedBy: " + ")
    for i in sentense{
        if i.contains("x"){
            if i == "x"{
                value += 1
            }else{
                var temp = i
                temp.removeLast()
                value += Int(temp)!
            }
        }else{
            index = index + Int(i)!
        }
    }
    
    if value == 0 {return "\(index)"}
    if index == 0 { if value != 1 {return "\(value)x"} else {return "x"}}
    return value == 1 ? "x + \(index)" : "\(value)x + \(index)"
}
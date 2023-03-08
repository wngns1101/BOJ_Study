import Foundation

func solution(_ my_string:String) -> Int {
    var index = 0
    var temp = ""
    for i in my_string{
        if i.isNumber{
            temp += String(i)
        }else{
            if temp != ""{
                index = index + Int(temp)!
                temp = ""
            }
        }
    }
    if temp != ""{
        index = index + Int(temp)!
    }
    return index
}
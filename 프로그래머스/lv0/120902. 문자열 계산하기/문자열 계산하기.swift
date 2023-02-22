import Foundation

func solution(_ my_string:String) -> Int {
   var arr = my_string.split(separator: " ")
    var result = Int(arr[0])!
    for i in arr.enumerated(){
        if i.element == "+"{
            result += Int(arr[i.offset + 1])!
        }
        if i.element == "-"{
            result -= Int(arr[i.offset + 1])!
        }
    }
    return result
}
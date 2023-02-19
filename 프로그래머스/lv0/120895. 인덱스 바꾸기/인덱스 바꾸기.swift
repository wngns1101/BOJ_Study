import Foundation

func solution(_ my_string:String, _ num1:Int, _ num2:Int) -> String {
    var answer = ""
    var arr : [String] = []
    for i in my_string{
        arr.append(String(i))
    }
    var storage = arr[num1]
    arr[num1] = arr[num2]
    arr[num2] = storage
    for i in arr{
        answer.append(i)
    }
    return answer
}
import Foundation

func solution(_ my_string:String) -> String {
    var sentense = my_string.lowercased()
    var sortSentense = sentense.sorted()
    return String(sortSentense)
}
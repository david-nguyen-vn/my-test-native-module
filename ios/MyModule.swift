import Foundation
import React

@objc(MyModule)
class MyModule: NSObject {
  
  @objc
  func performTask(_ callback: @escaping RCTResponseSenderBlock) {
    // Perform your task here
    let result = "Task completed"
    callback([NSNull(), result])
  }
  
  @objc
  static func requiresMainQueueSetup() -> Bool {
    return true
  }
}
#import <React/RCTBridgeModule.h>

@interface MyModule : NSObject <RCTBridgeModule>
@end

@implementation MyModule

RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(doSomething:(NSString *)param resolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    // Implement your native functionality here
    // For example, you can perform some task and return a result
    if (param) {
        // Simulate a successful operation
        resolve(@{@"result": [NSString stringWithFormat:@"Received: %@", param]});
    } else {
        // Simulate an error
        NSError *error = [NSError errorWithDomain:@"MyModuleErrorDomain" code:400 userInfo:@{NSLocalizedDescriptionKey: @"Invalid parameter"}];
        reject(@"no_param", @"No parameter was provided", error);
    }
}

@end
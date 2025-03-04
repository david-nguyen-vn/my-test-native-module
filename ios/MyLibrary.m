#import <React/RCTBridgeModule.h>

@interface MyLibrary : NSObject <RCTBridgeModule>
@end

@implementation MyLibrary

RCT_EXPORT_MODULE();

// Example of a method that can be called from JavaScript
RCT_EXPORT_METHOD(exampleMethod:(NSString *)param callback:(RCTResponseSenderBlock)callback) {
    // Implement your native functionality here
    NSString *result = [NSString stringWithFormat:@"Hello, %@", param];
    callback(@[[NSNull null], result]);
}

@end
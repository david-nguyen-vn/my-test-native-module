# My React Native Library

This is a sample React Native library that utilizes Kotlin native code for Android and Objective-C for iOS. It provides a bridge between JavaScript and native functionalities, allowing you to leverage native features in your React Native applications.

## Installation

To install the library, you can use Yarn:

```bash
yarn add my-react-native-library
```

## Usage

### Android

Make sure to link the library in your Android project. If you are using React Native 0.60 and above, the library should be automatically linked. If not, you may need to manually link it.

### iOS

For iOS, ensure that you have run `pod install` in the `ios` directory of your React Native project to include the native module.

## Example

Here is a simple example of how to use the library in your React Native application:

```javascript
import { NativeModules } from 'react-native';

const { MyLibrary } = NativeModules;

// Call a method from the native module
MyLibrary.someMethod()
  .then(result => {
    console.log(result);
  })
  .catch(error => {
    console.error(error);
  });
```

## Contributing

If you would like to contribute to this library, feel free to submit a pull request or open an issue.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.
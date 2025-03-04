# My Native Module

This is a native module for React Native written in Kotlin for Android and Objective-C/Swift for iOS. It allows you to call native functionalities directly from your JavaScript code.

## Installation

To install the module, you can use npm or yarn. Run the following command in your React Native project:

```bash
npm install my-native-module
```

or

```bash
yarn add my-native-module
```

## Linking

For React Native 0.60 and above, the module should be automatically linked. If you are using an older version, you will need to link the module manually:

```bash
react-native link my-native-module
```

## Usage

### Importing the Module

You can import the module in your JavaScript code as follows:

```javascript
import MyModule from 'my-native-module';
```

### Calling Native Methods

You can call the methods defined in the native module. For example:

```javascript
MyModule.someNativeMethod()
  .then(result => {
    console.log(result);
  })
  .catch(error => {
    console.error(error);
  });
```

## Android Setup

Make sure to include the necessary permissions and configurations in your `AndroidManifest.xml` file located in `android/src/main/AndroidManifest.xml`.

## iOS Setup

For iOS, ensure that you have the necessary configurations in your Xcode project. The native module is implemented in both Objective-C and Swift, allowing for flexibility in usage.

## Contributing

If you would like to contribute to this project, please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License. See the LICENSE file for details.